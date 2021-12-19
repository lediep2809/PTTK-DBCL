package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_thongitndat")
public class TblThongitndat {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mota")
    private String mota;

    @Column(name = "bandatid")
    private Integer bandatid;

    @Column(name = "tbl_nhanvienid")
    private Integer tblNhanvienid;

    @Column(name = "tbl_khachhangid")
    private Integer tblKhachhangid;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Integer getBandatid() {
        return this.bandatid;
    }

    public void setBandatid(Integer bandatid) {
        this.bandatid = bandatid;
    }

    public Integer getTblNhanvienid() {
        return this.tblNhanvienid;
    }

    public void setTblNhanvienid(Integer tblNhanvienid) {
        this.tblNhanvienid = tblNhanvienid;
    }

    public Integer getTblKhachhangid() {
        return this.tblKhachhangid;
    }

    public void setTblKhachhangid(Integer tblKhachhangid) {
        this.tblKhachhangid = tblKhachhangid;
    }
}
