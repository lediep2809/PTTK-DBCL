package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblMonan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 7:02 PM
 */
@Repository
public interface MonanDao extends JpaRepository<TblMonan,Long> {

}
