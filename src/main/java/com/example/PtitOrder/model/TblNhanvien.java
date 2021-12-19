package com.example.PtitOrder.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_nhanvien")
public class TblNhanvien {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "is_deleted")
    private Byte isDeleted;

    @Column(name = "tbl_accountid")
    private Integer tblAccountid;

    @Column(name = "tbl_thanhvienid")
    private Integer tblThanhvienid;

    @Column(name = "tbl_nvtypeid")
    private Integer tblNvtypeid;

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

    public Byte getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getTblAccountid() {
        return this.tblAccountid;
    }

    public void setTblAccountid(Integer tblAccountid) {
        this.tblAccountid = tblAccountid;
    }

    public Integer getTblThanhvienid() {
        return this.tblThanhvienid;
    }

    public void setTblThanhvienid(Integer tblThanhvienid) {
        this.tblThanhvienid = tblThanhvienid;
    }

    public Integer getTblNvtypeid() {
        return this.tblNvtypeid;
    }

    public void setTblNvtypeid(Integer tblNvtypeid) {
        this.tblNvtypeid = tblNvtypeid;
    }
}
