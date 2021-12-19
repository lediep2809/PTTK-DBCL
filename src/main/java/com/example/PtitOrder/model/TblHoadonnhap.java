package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_hoadonnhap")
public class TblHoadonnhap {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dongia")
    private Double dongia;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "tongtien")
    private Double tongtien;

    @Column(name = "tbl_nhanvienid")
    private Integer tblNhanvienid;

    @Column(name = "tbl_NCCid")
    private Integer tblNcCid;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDongia() {
        return this.dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    public Integer getSoluong() {
        return this.soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Double getTongtien() {
        return this.tongtien;
    }

    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }

    public Integer getTblNhanvienid() {
        return this.tblNhanvienid;
    }

    public void setTblNhanvienid(Integer tblNhanvienid) {
        this.tblNhanvienid = tblNhanvienid;
    }

    public Integer getTblNcCid() {
        return this.tblNcCid;
    }

    public void setTblNcCid(Integer tblNcCid) {
        this.tblNcCid = tblNcCid;
    }
}
