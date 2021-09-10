package com.example.demo01.service;

import com.example.demo01.model.GioHang;
import com.example.demo01.model.NguoiDung;
import com.example.demo01.repository.GioHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GioHangService {
    @Autowired
    private GioHangRepository repo;

    public GioHang getGioHangByNguoiDung(NguoiDung n){
        return repo.findByNguoiDung(n);
    }
    public GioHang save(GioHang g){
        return repo.save(g);
    }
}
