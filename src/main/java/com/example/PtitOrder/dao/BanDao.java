package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 5:55 PM
 */
@Repository
public interface BanDao extends JpaRepository<TblBan,Long> {

}
