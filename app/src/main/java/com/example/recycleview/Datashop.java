package com.example.recycleview;

public class Datashop {
    private int  hinhanh;
    private String Ten;

    public Datashop(int hinhanh, String ten) {
        this.hinhanh = hinhanh;
        Ten = ten;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
}
