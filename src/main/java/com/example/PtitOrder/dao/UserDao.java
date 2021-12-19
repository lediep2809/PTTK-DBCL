package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 4:01 PM
 */
@Repository
public interface UserDao extends JpaRepository<TblAccount,Long> {

    @Query("SELECT u FROM TblAccount u WHERE u.username = :username")
    TblAccount getUserByUsername(@Param("username") String username);
}
