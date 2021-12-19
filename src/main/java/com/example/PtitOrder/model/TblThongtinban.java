package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_thongtinban")
public class TblThongtinban {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mota")
    private String mota;

    @Column(name = "bandatid")
    private Integer bandatid;

    @Column(name = "banid")
    private Integer banid;

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

    public Integer getBanid() {
        return this.banid;
    }

    public void setBanid(Integer banid) {
        this.banid = banid;
    }
}
