package com.qd.entity;

public class Txl {
    private String bh;
    private String xm;

    public Txl() {
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Txl(String bh, String xm) {
        this.bh = bh;
        this.xm = xm;
    }

    @Override
    public String toString() {
        return bh+"==="+xm;
    }
}
