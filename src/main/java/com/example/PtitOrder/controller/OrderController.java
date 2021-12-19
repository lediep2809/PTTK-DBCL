package com.example.PtitOrder.controller;

import com.example.PtitOrder.config.MyUserDetails;
import com.example.PtitOrder.dto.MonanOrderDto;
import com.example.PtitOrder.model.*;
import com.example.PtitOrder.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 3:08 PM
 */

@RequestMapping("/")
@Controller
public class OrderController {
    @Autowired
    private BanService banService;

    @Autowired
    private ComboMonanSerrvice comboMonanSerrvice;

    @Autowired
    private OrderService orderService;

    @Autowired
    private AccountService account;

    @Autowired
    private NhanvienService nhanvienService;

    @GetMapping("/")
    public String getptitorder(Model model){
        return "trangchu";
    }

    @GetMapping("/chonban")
    public String getBan(Model model){
        model.addAttribute("ban",banService.findAll());
        model.addAttribute("banan",new TblBan());

        return "chonban";
    }

    @PostMapping("/order")
    public String getOrder(Model model , @ModelAttribute TblBan banan ){
        MonanOrderDto form = new MonanOrderDto();
        for (int i = 0; i < 10; i++) {
            form.addMonanOrder(new TblMonanOrder());
        }
        model.addAttribute("form",form);

        model.addAttribute("monan",comboMonanSerrvice.findMonanAll());
        model.addAttribute("combo",comboMonanSerrvice.findComboAll());
        return "tables";
    }

    @PostMapping("/saveorder")
    public String saveOrder(@ModelAttribute MonanOrderDto from, Model model){
        List<TblMonanOrder> monanOrders = new ArrayList<>();
        TblOrder newOrder = new TblOrder();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails userDetail = (MyUserDetails) auth.getPrincipal();
        TblAccount user = account.findByUsername(userDetail.getUsername());
        TblNhanvien nhanvien = nhanvienService.findbyUserid(user.getId());
        newOrder.setTblNhanvienid(nhanvien.getId());
        //newOrder = orderService.newOrder(newOrder);

        for(TblMonanOrder item:from.getMonanOrder()){
            if(item.getMonanid()==null || item.getSoluong() <1){

            }
            else{
                TblMonanOrder monanOrder = new TblMonanOrder();
//                monanOrder.setTblOrderid(newOrder.getId());
                monanOrder.setTblOrderid(1);
                monanOrder.setMonanid(item.getMonanid());
                monanOrder.setSoluong(item.getSoluong());
                monanOrders.add(monanOrder);
            }
        }
        try{
            orderService.saveMonanorderAll(monanOrders);
        } catch (Exception e) {
            System.out.println(e);
        }

        return "xacnhan";
    }


}
