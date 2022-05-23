package com.example.hoabt4;

public class ThongBao {
    int hinhanhthongbao;
    String ngay;
    String tieude;

    public ThongBao(int hinhanhthongbao, String ngay, String tieude) {
        this.hinhanhthongbao = hinhanhthongbao;
        this.ngay = ngay;
        this.tieude = tieude;
    }

    public int getHinhanhthongbao() {
        return hinhanhthongbao;
    }

    public void setHinhanhthongbao(int hinhanhthongbao) {
        this.hinhanhthongbao = hinhanhthongbao;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }
}
