package com.example.demo.Utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tinhTong = new TinhTong();
    @Test
    public void test01(){
        int [] daySo = {1,3,5,7,9};
        assertEquals(25,tinhTong.tinhTong(daySo));
    }
    @Test
    public void test02(){
        int [] daySo = {21,23,25,27,29};
        assertEquals(125,tinhTong.tinhTong(daySo));
    }
    @Test
    public void test03(){
        int [] daySo = {31,33,35,37,39};
        assertEquals(175,tinhTong.tinhTong(daySo));
    }
    @Test
    public void test04(){
        int [] daySo = {41,43,45,47,49};
        assertEquals(225,tinhTong.tinhTong(daySo));
    }
    @Test
    public void test05(){
        int [] daySo = {51,53,55,57,59};
        assertEquals(275,tinhTong.tinhTong(daySo));
    }

}