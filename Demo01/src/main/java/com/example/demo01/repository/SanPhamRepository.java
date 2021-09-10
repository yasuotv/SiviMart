package com.example.demo01.repository;

import com.example.demo01.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Long>, QuerydslPredicateExecutor<SanPham>{

	
	List<SanPham> findFirst12ByDanhMucTenDanhMucContainingIgnoreCaseOrderByIdDesc(String dm);//dai vl :)))
	List<SanPham> findByIdIn(Set<Long> idList);
}
