package org.hsc.demo.entity;

public class User {
    private String userid;

    private String username;

    private String password;

    private String remark;

    private Boolean isdisable;

    private String idpicpath;

    private String sex;

    private String phone;

    private String email;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsdisable() {
        return isdisable;
    }

    public void setIsdisable(Boolean isdisable) {
        this.isdisable = isdisable;
    }

    public String getIdpicpath() {
        return idpicpath;
    }

    public void setIdpicpath(String idpicpath) {
        this.idpicpath = idpicpath == null ? null : idpicpath.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}