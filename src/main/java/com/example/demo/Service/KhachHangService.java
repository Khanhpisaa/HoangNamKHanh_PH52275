package com.example.demo.Service;

import com.example.demo.Model.KhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KhachHangService {
    List<KhachHang> listKhachHang = new ArrayList<>();

    public ArrayList<KhachHang> getAllKhachHang(){
        return new  ArrayList<>(listKhachHang);
    }
    public void themKH(KhachHang khachHang){
        listKhachHang.add(khachHang);
    }
    public Optional<KhachHang> timKiemTheoTen(String ten){
        if (ten == null || ten.isEmpty()){
            throw new IllegalArgumentException("ten khong duoc de trong");
        }
        return listKhachHang.stream().filter(khachHang -> khachHang.getTen() == ten ).findFirst();
    }
}
