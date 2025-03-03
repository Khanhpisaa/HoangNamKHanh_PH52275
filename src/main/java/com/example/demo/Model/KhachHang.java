package com.example.demo.Model;

public class KhachHang {
    private String ma;
    private String ten;
    private int tuoi;
    private String email;
    private String sdt;

    public KhachHang() {
    }

    public KhachHang(String ma, String ten, int tuoi, String email, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.sdt = sdt;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
