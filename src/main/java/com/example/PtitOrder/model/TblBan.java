package com.example.PtitOrder.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_ban")
@Data
public class TblBan {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "chotrong")
    private Integer chotrong;

    @Column(name = "mota")
    private String mota;

}
