package com.example.demo01.repository;

import com.example.demo01.model.ChiMucGioHang;
import com.example.demo01.model.GioHang;
import com.example.demo01.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long> {
    ChiMucGioHang findBySanPhamAndGioHang(SanPham sp, GioHang g);

    List<ChiMucGioHang> findByGioHang(GioHang g);
}
