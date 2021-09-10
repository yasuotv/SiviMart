package com.example.demo01.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ChiMucGioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "ma_san_pham")
    private SanPham sanPham;

    private int so_luong;

    @ManyToOne
    @JoinColumn(name = "ma_gio_hang")
    private GioHang gioHang;
}
