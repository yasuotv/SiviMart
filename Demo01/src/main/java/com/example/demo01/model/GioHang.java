package com.example.demo01.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String tong_tien;

    @OneToOne
    @JoinColumn(name = "ma_nguoi_dung")
    private NguoiDung nguoiDung;
}
