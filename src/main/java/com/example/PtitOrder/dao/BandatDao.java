package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblBandat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 9:59 AM
 */
@Repository
public interface BandatDao extends JpaRepository<TblBandat,Long> {
}
