package com.example.PtitOrder.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_account")
@Data
public class TblAccount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Byte enabled;

    @Column(name = "role")
    private String role;

}
