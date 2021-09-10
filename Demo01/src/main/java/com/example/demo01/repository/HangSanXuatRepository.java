package com.example.demo01.repository;

import com.example.demo01.model.HangSanXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangSanXuatRepository extends JpaRepository<HangSanXuat, Long>{

}
