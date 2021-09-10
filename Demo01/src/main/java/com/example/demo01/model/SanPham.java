package com.example.demo01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tenSanPham;
    private long donGia;
    private int donViKho;
    private int donViBan;
    private String thongTinBaoHanh;
    private String thongTinChung;
//    private String manHinh;
//    private String heDieuHanh;
//    private String cpu;
//    private String ram;
//    private String thietKe;
//    private String dungLuongPin;

    @Transient
    @JsonIgnore
    private MultipartFile hinhAnh;

    @ManyToOne
    @JoinColumn(name = "ma_danh_muc")
    private DanhMuc danhMuc;

    @ManyToOne
    @JoinColumn(name = "ma_hang_sx")
    private HangSanXuat hangSanXuat;
}
