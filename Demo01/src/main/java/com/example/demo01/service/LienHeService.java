package com.example.demo01.service;

import com.example.demo01.dto.SearchLienHeObject;
import com.example.demo01.model.LienHe;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public abstract class LienHeService {
    public abstract Page<LienHe> getLienHeByFilter(SearchLienHeObject object, int page) throws ParseException;

    public abstract LienHe findById(long id);

    public abstract LienHe save(LienHe lh);

    abstract int countByTrangThai(String trangThai);

}
