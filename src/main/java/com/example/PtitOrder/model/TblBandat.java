package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_bandat")
public class TblBandat {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "time_from")
    private java.sql.Timestamp timeFrom;

    @Column(name = "mota")
    private String mota;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.sql.Timestamp getTimeFrom() {
        return this.timeFrom;
    }

    public void setTimeFrom(java.sql.Timestamp timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
