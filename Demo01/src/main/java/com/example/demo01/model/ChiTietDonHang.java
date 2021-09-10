package com.example.demo01.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name="ma_san_pham")
    private SanPham sanPham;
    private long donGia;
    private int soLuongDat;

    private int soLuongNhanHang;

    @ManyToOne
    @JoinColumn(name = "ma_don_hang")
    @JsonIgnore
    private DonHang donHang;
}
