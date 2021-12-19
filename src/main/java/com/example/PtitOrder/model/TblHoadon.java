package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_hoadon")
public class TblHoadon {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mota")
    private String mota;

    @Column(name = "tbl_orderid")
    private Integer tblOrderid;

    @Column(name = "tbl_nhanvienid")
    private Integer tblNhanvienid;

    @Column(name = "magiamgiaid")
    private Integer magiamgiaid;

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

    public Integer getTblOrderid() {
        return this.tblOrderid;
    }

    public void setTblOrderid(Integer tblOrderid) {
        this.tblOrderid = tblOrderid;
    }

    public Integer getTblNhanvienid() {
        return this.tblNhanvienid;
    }

    public void setTblNhanvienid(Integer tblNhanvienid) {
        this.tblNhanvienid = tblNhanvienid;
    }

    public Integer getMagiamgiaid() {
        return this.magiamgiaid;
    }

    public void setMagiamgiaid(Integer magiamgiaid) {
        this.magiamgiaid = magiamgiaid;
    }
}
