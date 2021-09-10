package com.example.demo01.service;

import com.example.demo01.model.DanhMuc;
import com.example.demo01.repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucService {
    @Autowired
    private DanhMucRepository repo;

    public DanhMuc save(DanhMuc d){
        return repo.save(d);
    }

    public DanhMuc update(DanhMuc d) {
        return repo.save(d);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }

    public Page<DanhMuc> getAllDanhMucForPageable(int page, int size) {
        return repo.findAll(PageRequest.of(page, size));
    }

    public DanhMuc getDanhMucById(long id) {
        return repo.findById(id).get();
    }

    public List<DanhMuc> getAllDanhMuc() {
        return repo.findAll();
    }
}
