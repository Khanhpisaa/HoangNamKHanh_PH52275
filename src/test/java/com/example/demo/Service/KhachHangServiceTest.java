package com.example.demo.Service;

import com.example.demo.Model.KhachHang;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class KhachHangServiceTest {
    KhachHangService khachHangService;
    @BeforeEach
    public void setUp(){
        khachHangService = new KhachHangService();
    }
    @Test
    public void timKiemTenRong(){
        KhachHang khachHang = new KhachHang("KH1","NamKhanh",18,"khanh@gmail.com","0987654321");
        KhachHang khachHang1 = new KhachHang("KH2","",18,"khanh@gmail.com","0987654321");
        khachHangService.themKH(khachHang);
        khachHangService.themKH(khachHang1);
        Optional<KhachHang> kq = khachHangService.timKiemTheoTen("");
        assertTrue(kq.isEmpty(),"khong tim thay ten khach hang");
        assertEquals("",kq.get().getTen());
    }
    @Test
    public void timKiem1KiTu(){
        KhachHang khachHang = new KhachHang("KH1","NamKhanh",18,"khanh@gmail.com","0987654321");
        KhachHang khachHang1 = new KhachHang("KH2","N",18,"khanh@gmail.com","0987654321");
        khachHangService.themKH(khachHang);
        khachHangService.themKH(khachHang1);
        Optional<KhachHang> kq = khachHangService.timKiemTheoTen("N");
        assertTrue(kq.isPresent(),"khong tim thay ten khach hang");
        assertEquals("N",kq.get().getTen());
    }
    @Test
    public void timKiemTenTonTai(){
        KhachHang khachHang = new KhachHang("KH1","NamKhanh",18,"khanh@gmail.com","0987654321");
        KhachHang khachHang1 = new KhachHang("KH2","NamKhanh",18,"khanh@gmail.com","0987654321");
        khachHangService.themKH(khachHang);
        khachHangService.themKH(khachHang1);
        Optional<KhachHang> kq = khachHangService.timKiemTheoTen("NamKhanh");
        assertTrue(kq.isPresent(),"khong tim thay ten khach hang");
        assertEquals("NamKhanh",kq.get().getTen());
    }
    @Test
    public void timKiemKhongTonTai(){
        KhachHang khachHang = new KhachHang("KH1","NamKhanh",18,"khanh@gmail.com","0987654321");
        KhachHang khachHang1 = new KhachHang("KH2","NamKhanh",18,"khanh@gmail.com","0987654321");
        khachHangService.themKH(khachHang);
        khachHangService.themKH(khachHang1);
        Optional<KhachHang> kq = khachHangService.timKiemTheoTen("NamKhanh1");
        assertFalse(kq.isEmpty(),"khong tim thay ten khach hang");
        assertEquals("NamKhanh1",kq.get().getTen());
    }
    @Test
    public void timKiemNhieuTenGiongNhau(){
        KhachHang khachHang = new KhachHang("KH1","NamKhanh",18,"khanh@gmail.com","0987654321");
        KhachHang khachHang1 = new KhachHang("","NamKhanh",18,"khanh@gmail.com","0987654321");
        khachHangService.themKH(khachHang);
        khachHangService.themKH(khachHang1);
        Optional<KhachHang> kq = khachHangService.timKiemTheoTen("NamKhanh");
        assertTrue(kq.isPresent(),"khong tim thay ten khach hang");
        assertEquals("NamKhanh",kq.get().getTen());
    }

}