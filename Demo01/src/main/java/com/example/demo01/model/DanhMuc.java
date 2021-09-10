package com.example.demo01.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message="Tên danh mục không được trống")
    private String tenDanhMuc;

    @JsonIgnore
    @OneToMany(mappedBy = "danhMuc")
    private List<SanPham> listSanPham;
}
