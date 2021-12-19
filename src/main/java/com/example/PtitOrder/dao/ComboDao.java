package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblCombo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/18/2021 7:04 PM
 */
public interface ComboDao extends JpaRepository<TblCombo,Long> {
}
