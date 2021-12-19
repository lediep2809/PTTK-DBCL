package com.example.PtitOrder.dao;

import com.example.PtitOrder.model.TblAccount;
import com.example.PtitOrder.model.TblNhanvien;
import com.example.PtitOrder.model.TblThanhvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author GMO DiepLN
 * @version 1.0
 * @since 12/19/2021 11:21 AM
 */

public interface NhanvienDao extends JpaRepository<TblNhanvien,Long> {

    @Query("SELECT tv from TblNhanvien tv where tv.tblAccountid =:userid")
    TblNhanvien findByUserid(@Param("userid") Integer userid);

}
