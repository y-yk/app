package springboots.pojo;

import java.util.Date;

/**
 * @Description:测试账号表
 * @Author 罗曼蒂克
 * @Date Created in 11:14   2018/4/25
 */
public class Dev_user {

    private Integer id; //NOT NULL主键id
    private String devCode;//开发者帐号
    private String devName; //开发者名称
    private String devPassword;//开发者密码
    private String devEmail;//开发者电子邮箱
    private String devInfovar;//开发者简介
    private Integer createdBy;//创建者（来源于backend_user用户表的用户id）
    private Date creationDate;//创建时间
    private Integer modifyBy;//更新者（来源于backend_user用户表的用户id）
    private Date modifyDate;//最新更新时间

    public Dev_user(Integer id, String devCode, String devName, String devPassword, String devEmail, String devInfovar, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate) {
        this.id = id;
        this.devCode = devCode;
        this.devName = devName;
        this.devPassword = devPassword;
        this.devEmail = devEmail;
        this.devInfovar = devInfovar;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
    }

    public Dev_user() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getDevPassword() {
        return devPassword;
    }

    public void setDevPassword(String devPassword) {
        this.devPassword = devPassword;
    }

    public String getDevEmail() {
        return devEmail;
    }

    public void setDevEmail(String devEmail) {
        this.devEmail = devEmail;
    }

    public String getDevInfovar() {
        return devInfovar;
    }

    public void setDevInfovar(String devInfovar) {
        this.devInfovar = devInfovar;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "Dev_user{" +
                "id=" + id +
                ", devCode='" + devCode + '\'' +
                ", devName='" + devName + '\'' +
                ", devPassword='" + devPassword + '\'' +
                ", devEmail='" + devEmail + '\'' +
                ", devInfovar='" + devInfovar + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
