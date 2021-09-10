package com.example.demo01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
public class HangSanXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message="Tên hãng sản xuất không được trống")
    private String tenHangSanXuat;

    @JsonIgnore
    @OneToMany(mappedBy = "hangSanXuat")
    private List<SanPham> listSanPham;
}
