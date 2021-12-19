package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_khachhang")
public class TblKhachhang {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "tbl_thanhvienid")
    private Integer tblThanhvienid;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getTblThanhvienid() {
        return this.tblThanhvienid;
    }

    public void setTblThanhvienid(Integer tblThanhvienid) {
        this.tblThanhvienid = tblThanhvienid;
    }
}
