package com.example.demo01.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchSanPhamObject {
    private String danhMucId;
    private String hangSXId;
    private String donGia;

    // sap xep theo gia
    private String sapXepTheoGia;
    private String[] keyword;
    private String sort;

    // sap xep theo danhmuc va hangsx
    private String brand;
    private String manufactor;

    // theo ram, pin, OS
    private String os;
    private String ram;
    private String pin;

    public SearchSanPhamObject() {
        danhMucId = "";
        hangSXId = "";
        donGia = "";
        sapXepTheoGia = "ASC";
    }
}
