package com.example.demo01.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchLienHeObject {
    private String trangThaiLienHe;
    private String tuNgay;
    private String denNgay;

    public SearchLienHeObject() {
        trangThaiLienHe = "";
        tuNgay = "";
        denNgay = "";
    }
}

