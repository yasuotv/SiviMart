package com.example.demo01.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchDonHangObject {
    private String trangThaiDon;
    private String tuNgay;
    private String denNgay;

    public SearchDonHangObject() {
        trangThaiDon = "";
        tuNgay = "";
        denNgay = "";
    }
}
