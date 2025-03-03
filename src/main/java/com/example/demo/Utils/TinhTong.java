package com.example.demo.Utils;

public class TinhTong {
    public int tinhTong( int [] daySo){
        int sum = 0;
        for (int so : daySo){
            if (so <= 100 && so % 2 != 0){
                sum+= so;
            }
        }
        return sum;
    }
}
