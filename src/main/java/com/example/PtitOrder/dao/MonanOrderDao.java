package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblMonanOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 3:09 PM
 */

public interface MonanOrderDao extends JpaRepository<TblMonanOrder,Long> {
}
