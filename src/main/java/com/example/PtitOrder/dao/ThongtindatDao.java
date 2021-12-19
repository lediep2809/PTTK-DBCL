package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblThongitndat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 10:01 AM
 */
@Repository
public interface ThongtindatDao extends JpaRepository<TblThongitndat,Long> {
}
