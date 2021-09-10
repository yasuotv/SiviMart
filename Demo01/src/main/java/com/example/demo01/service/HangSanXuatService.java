package com.example.demo01.service;

import com.example.demo01.model.HangSanXuat;
import com.example.demo01.repository.HangSanXuatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HangSanXuatService {
    @Autowired
    private HangSanXuatRepository repo;

    public List<HangSanXuat> getAllHangSanXuat(){
        return repo.findAll();
    }

    public HangSanXuat getHangSXById(long id){
        return repo.findById(id).get();// thư viện trả về dạng optional cho nên phải get ra object
    }

    public HangSanXuat save(HangSanXuat hangSanXuat){
        return repo.save(hangSanXuat);
    }

    public HangSanXuat update(HangSanXuat hangSanXuat){
        return repo.save(hangSanXuat);
    }

    public void deleteById(long id){
        repo.deleteById(id);// để return là sai, phải để kiểu là void mới dc
    }
    public Page<HangSanXuat> getAllHangSanXuat(int page,int size){
        return repo.findAll(PageRequest.of(page,size));
    }

}
