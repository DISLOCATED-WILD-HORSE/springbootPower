package org.hsc.demo.entity;

public class Menu {
    private Integer menuid;

    private String menuname;

    private String menusrc;

    private Integer parentid;

    private Integer level;

    private Boolean ischild;

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getMenusrc() {
        return menusrc;
    }

    public void setMenusrc(String menusrc) {
        this.menusrc = menusrc == null ? null : menusrc.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getIschild() {
        return ischild;
    }

    public void setIschild(Boolean ischild) {
        this.ischild = ischild;
    }
}