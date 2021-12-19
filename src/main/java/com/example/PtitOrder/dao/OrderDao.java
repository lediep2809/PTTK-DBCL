package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 12:47 AM
 */
@Repository
public interface OrderDao extends JpaRepository<TblOrder,Long> {
}
