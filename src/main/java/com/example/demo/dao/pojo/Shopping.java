package com.example.demo.dao.pojo;

public class Shopping {
    private Integer userid;

    private String shoppinginfor;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getShoppinginfor() {
        return shoppinginfor;
    }

    public void setShoppinginfor(String shoppinginfor) {
        this.shoppinginfor = shoppinginfor == null ? null : shoppinginfor.trim();
    }
}