package com.example.demo.Service;

import com.example.demo.Model.Sach;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SachService {
   public List<Sach> listSach = new ArrayList<>();

   public List<Sach> getAllSach(){
       return new ArrayList<>(listSach);
   }
   public void themSach(Sach sach){
       listSach.add(sach);
   }
   public boolean suaSach(Sach sach, String maMoi, String tenMoi, int namMoi, float giaMoi){
       sach.setMa(maMoi);
       sach.setTen(tenMoi);
       sach.setNamSacTac(namMoi);
       sach.setGia(giaMoi);
       return true;
   }
   public boolean xoaSach(String ma){
       listSach.removeIf(s -> s.getMa().equals(ma));
       return true;
   }
   public Optional<Sach> timSach(String ma){
       return listSach.stream().filter(s -> s.getMa() == ma).findFirst();
   }

}
