package com.example.PtitOrder.service;

import com.example.PtitOrder.dao.BanDao;
import com.example.PtitOrder.dao.BandatDao;
import com.example.PtitOrder.model.TblBan;
import com.example.PtitOrder.model.TblBandat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 5:56 PM
 */
@Service
public class BanService {
    @Autowired
    private BanDao banDao;

    @Autowired
    private BandatDao bandatDao;

    public List<TblBan> findAll() {
        return banDao.findAll();
    }

    public TblBandat Newbandat(TblBandat bandat){
        return bandatDao.save(bandat);
    }

}
