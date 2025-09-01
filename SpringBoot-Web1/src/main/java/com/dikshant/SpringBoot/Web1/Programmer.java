package com.dikshant.SpringBoot.Web1;

public class Programmer {

    private int aid;
    private String a_name;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "aid=" + aid +
                ", a_name='" + a_name + '\'' +
                '}';
    }
}
