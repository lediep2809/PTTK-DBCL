package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_nguyenlieu")
public class TblNguyenlieu {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "dongia")
    private Double dongia;

    @Column(name = "tbl_hoadonnhapid")
    private Integer tblHoadonnhapid;

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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDongia() {
        return this.dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    public Integer getTblHoadonnhapid() {
        return this.tblHoadonnhapid;
    }

    public void setTblHoadonnhapid(Integer tblHoadonnhapid) {
        this.tblHoadonnhapid = tblHoadonnhapid;
    }
}
