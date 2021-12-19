package com.example.PtitOrder.service;

import com.example.PtitOrder.dao.NhanvienDao;
import com.example.PtitOrder.model.TblNhanvien;
import com.example.PtitOrder.model.TblThanhvien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 11:21 AM
 */
@Service
public class NhanvienService {

    @Autowired
    private NhanvienDao nhanvienDao;

    public TblNhanvien findbyUserid(Integer id){
        return nhanvienDao.findByUserid(id);
    }
}
