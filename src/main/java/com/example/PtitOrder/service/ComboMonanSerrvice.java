package com.example.PtitOrder.service;

import com.example.PtitOrder.dao.ComboDao;
import com.example.PtitOrder.dao.MonanDao;
import com.example.PtitOrder.model.TblCombo;
import com.example.PtitOrder.model.TblMonan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 7:04 PM
 */
@Service
public class ComboMonanSerrvice {

    @Autowired
    private MonanDao monanDao;

    @Autowired
    private ComboDao comboDao;

    public List<TblMonan> findMonanAll() {
        return monanDao.findAll();
    }
    public List<TblCombo> findComboAll() {
        return comboDao.findAll();
    }
}
