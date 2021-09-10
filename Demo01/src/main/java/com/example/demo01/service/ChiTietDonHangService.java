package com.example.demo01.service;

import com.example.demo01.model.ChiTietDonHang;
import com.example.demo01.repository.ChiTietDonHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietDonHangService {
    @Autowired
    private ChiTietDonHangRepository repo;

    public List<ChiTietDonHang>  save(List<ChiTietDonHang> chiTietDonHangList) {
        return repo.saveAll(chiTietDonHangList);
    }
}
