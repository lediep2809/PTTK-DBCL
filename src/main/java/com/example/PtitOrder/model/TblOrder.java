package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_order")
public class TblOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tongtien")
    private Integer tongtien;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "tbl_thongitndatid")
    private Integer tblThongitndatid;

    @Column(name = "tbl_nhanvienid")
    private Integer tblNhanvienid;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTongtien() {
        return this.tongtien;
    }

    public void setTongtien(Integer tongtien) {
        this.tongtien = tongtien;
    }

    public Integer getSoluong() {
        return this.soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Integer getTblThongitndatid() {
        return this.tblThongitndatid;
    }

    public void setTblThongitndatid(Integer tblThongitndatid) {
        this.tblThongitndatid = tblThongitndatid;
    }

    public Integer getTblNhanvienid() {
        return this.tblNhanvienid;
    }

    public void setTblNhanvienid(Integer tblNhanvienid) {
        this.tblNhanvienid = tblNhanvienid;
    }
}
