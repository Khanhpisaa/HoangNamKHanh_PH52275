package com.example.demo.Model;

public class Sach {
    private String ma;
    private String  ten;
    private int namSacTac;
    private float gia;

    public Sach() {
    }

    public Sach(String ma, String ten, int namSacTac, float gia) {
        this.ma = ma;
        this.ten = ten;
        this.namSacTac = namSacTac;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSacTac() {
        return namSacTac;
    }

    public void setNamSacTac(int namSacTac) {
        this.namSacTac = namSacTac;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", namSacTac=" + namSacTac +
                ", gia=" + gia +
                '}';
    }
}
