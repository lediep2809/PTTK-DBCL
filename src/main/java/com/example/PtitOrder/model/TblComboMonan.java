package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_combo_monan")
public class TblComboMonan {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "mota")
    private String mota;

    @Column(name = "monanid")
    private Integer monanid;

    @Column(name = "comboid")
    private Integer comboid;

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

    public Integer getMonanid() {
        return this.monanid;
    }

    public void setMonanid(Integer monanid) {
        this.monanid = monanid;
    }

    public Integer getComboid() {
        return this.comboid;
    }

    public void setComboid(Integer comboid) {
        this.comboid = comboid;
    }
}
