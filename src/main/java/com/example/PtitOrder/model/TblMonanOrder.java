package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_monan_order")
public class TblMonanOrder {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "soluong")
    private Integer soluong;

    @Column(name = "gia")
    private Double gia;

    @Column(name = "monanid")
    private Integer monanid;

    @Column(name = "tbl_orderid")
    private Integer tblOrderid;

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

    public Integer getMonanid() {
        return this.monanid;
    }

    public void setMonanid(Integer monanid) {
        this.monanid = monanid;
    }

    public Integer getTblOrderid() {
        return this.tblOrderid;
    }

    public void setTblOrderid(Integer tblOrderid) {
        this.tblOrderid = tblOrderid;
    }
}
