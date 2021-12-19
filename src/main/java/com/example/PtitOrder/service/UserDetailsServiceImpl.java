package com.example.PtitOrder.service;

import com.example.PtitOrder.config.MyUserDetails;
import com.example.PtitOrder.dao.UserDao;
import com.example.PtitOrder.model.TblAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 4:19 PM
 */

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TblAccount user = userDao.getUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        return new MyUserDetails(user);
    }
}
