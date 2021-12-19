package com.example.PtitOrder.service;

import com.example.PtitOrder.dao.MonanOrderDao;
import com.example.PtitOrder.dao.OrderDao;
import com.example.PtitOrder.model.TblMonanOrder;
import com.example.PtitOrder.model.TblOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 10:13 AM
 */
@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private MonanOrderDao monanOrderDao;

    public TblOrder newOrder(TblOrder newOrder){
        return orderDao.save(newOrder);
    }

    public List<TblMonanOrder> saveMonanorderAll(List<TblMonanOrder> monanOrders){
        return monanOrderDao.saveAll(monanOrders);
    }
}
