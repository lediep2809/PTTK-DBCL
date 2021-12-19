package com.example.PtitOrder.service;

import com.example.PtitOrder.dao.UserDao;
import com.example.PtitOrder.model.TblAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 11:19 AM
 */
@Service
public class AccountService {

    @Autowired
    private UserDao userDao;

    public TblAccount findByUsername(String username){
        return userDao.getUserByUsername(username);
    }
}
