package com.example.demo.Service;

import com.example.demo.Model.Sach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    SachService sachService = new SachService();
    @BeforeEach
    public void setUp(){

    }
    @Test
    public void sua01(){
        Sach sach = new Sach("Sach1","Conan",2000,15000);
        sachService.themSach(sach);
        boolean kq = sachService.suaSach(sach,"Sach3","Kimet",2018,3000);
        assertTrue(kq);
        assertEquals(1,sachService.getAllSach().size());
    }
    @Test
    public void them01(){
        Sach sach = new Sach("Sach1","Conan",2000,15000);
        sachService.themSach(sach);
        assertEquals(1,sachService.getAllSach().size());
    }
    @Test
    public void xoa01(){
        Sach sach = new Sach("Sach1","Conan",2000,15000);
        Sach sach1 = new Sach("Sach01","Conan",2000,15000);
        sachService.themSach(sach);
        sachService.themSach(sach1);
        boolean kq = sachService.xoaSach("Sach1");
        assertTrue(kq);
        assertEquals(1,sachService.getAllSach().size());
    }
    @Test
    public void timkiem01(){
        Sach sach = new Sach("Sach1","Conan",2000,15000);
        Sach sach3 = new Sach("Sach4","Conan",2000,15000);
        sachService.themSach(sach);
        sachService.themSach(sach3);
        Optional<Sach> kq = sachService.timSach("Sach4");
        assertTrue(kq.isPresent(),"khong tim thay ma sach");
        assertEquals("Sach4",kq.get().getMa());
    }

}