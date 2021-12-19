package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_combo_order")
public class TblComboOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "tbl_orderid")
    private Integer tblOrderid;

    @Column(name = "comboid")
    private Integer comboid;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSoluong() {
        return this.soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Double getGia() {
        return this.gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getTblOrderid() {
        return this.tblOrderid;
    }

    public void setTblOrderid(Integer tblOrderid) {
        this.tblOrderid = tblOrderid;
    }

    public Integer getComboid() {
        return this.comboid;
    }

    public void setComboid(Integer comboid) {
        this.comboid = comboid;
    }
}
