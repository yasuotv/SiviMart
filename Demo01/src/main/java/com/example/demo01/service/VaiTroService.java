package com.example.demo01.service;

import com.example.demo01.model.VaiTro;
import com.example.demo01.repository.VaiTroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaiTroService {
    @Autowired
    private VaiTroRepository repo;

    public VaiTro findByTenVaiTro(String tenVaiTro){
        return repo.findByTenVaiTro(tenVaiTro);
    }
    public List<VaiTro> findAllVaiTro(){
        return repo.findAllVaiTro();
    }
}
