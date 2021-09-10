package com.example.demo01.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class SanPhamDTO {
    private String id;

    private String tenSanPham;
    private String donGia;
    private String donViKho;
    private String thongTinBaoHanh;
    private String thongTinChung;


    private long danhMucId;
    private long nhaSXId;

    private MultipartFile hinhAnh;
}
