package com.example.demo01.service;

import com.example.demo01.model.ChiMucGioHang;
import com.example.demo01.model.GioHang;
import com.example.demo01.model.SanPham;
import com.example.demo01.repository.ChiMucGioHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ChiMucGioHangService {
    @Autowired
    private ChiMucGioHangRepository repo;

    public ChiMucGioHang getChiMucGioHangBySanPhamAndGioHang(SanPham sp, GioHang gh){
        return repo.findBySanPhamAndGioHang(sp,gh);
    }

    public ChiMucGioHang saveChiMucGioHang(ChiMucGioHang c){
        return repo.save(c);
    }
    public void deleteChiMucGioHang(ChiMucGioHang c){
        repo.delete(c);
    }
    public List<ChiMucGioHang> getChiMucGioHangByGioHang(GioHang g)
    {
        return repo.findByGioHang(g);
    }

    public void deleteAllChiMucGiohang(List<ChiMucGioHang> c)
    {
        repo.deleteAll(c);
    }



}
