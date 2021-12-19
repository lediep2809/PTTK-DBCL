package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_magiamgia")
public class TblMagiamgia {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "ten")
    private String ten;

    @Column(name = "tiengiam")
    private Float tiengiam;

    @Column(name = "time_to")
    private java.sql.Date timeTo;

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

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Float getTiengiam() {
        return this.tiengiam;
    }

    public void setTiengiam(Float tiengiam) {
        this.tiengiam = tiengiam;
    }

    public java.sql.Date getTimeTo() {
        return this.timeTo;
    }

    public void setTimeTo(java.sql.Date timeTo) {
        this.timeTo = timeTo;
    }
}
