package com.example.demo01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;

    @JsonIgnore
    private String password;

    @Transient
    @JsonIgnore
    private String confirmPassword;
    private String hoTen;
    private String soDienThoai;
    private String diaChi;

    @ManyToMany
    @JoinTable(name="nguoidung_vaitro",
            joinColumns=@JoinColumn(name="ma_nguoi_dung"),
            inverseJoinColumns=@JoinColumn(name="ma_vai_tro"))
    private Set<VaiTro> vaiTro;

    @Transient
    @JsonIgnore
    private List<DonHang> listDonHang;
}
