package com.example.demo01.service;

import com.example.demo01.dto.SearchDonHangObject;
import com.example.demo01.model.DonHang;
import com.example.demo01.model.NguoiDung;
import com.example.demo01.repository.DonHangRepository;
import com.querydsl.core.BooleanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service

public class DonHangService {

    @Autowired
    private DonHangRepository donHangRepo;



    public Page<DonHang> getAllDonHangByFilter(SearchDonHangObject object, int page) throws ParseException {
        //hàm xử lý String để tìm trạng thái dơn nằm trong khoảng nào ?
        BooleanBuilder builder = new BooleanBuilder();

        String trangThaiDon = object.getTrangThaiDon();
        String tuNgay = object.getTuNgay();
        String denNgay = object.getDenNgay();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        if (!trangThaiDon.equals("")) {
            // hàm trong booleanbuilder
            builder.and(QDonHang.donHang.trangThaiDonHang.eq(trangThaiDon));
//			builder.and(DonHang.trangThaiDonHang.eq(trangThaiDon));
        }

        if (!tuNgay.equals("") && tuNgay != null) {
            if (trangThaiDon.equals("") || trangThaiDon.equals("Đang chờ giao") || trangThaiDon.equals("Đã hủy")) {
                builder.and(QDonHang.donHang.ngayDatHang.goe(formatDate.parse(tuNgay)));
            } else if (trangThaiDon.equals("Đang giao")) {
                builder.and(QDonHang.donHang.ngayGiaoHang.goe(formatDate.parse(tuNgay)));
            } else { // hoàn thành
                builder.and(QDonHang.donHang.ngayNhanHang.goe(formatDate.parse(tuNgay)));
            }
        }

        if (!denNgay.equals("") && denNgay != null) {
            if (trangThaiDon.equals("") || trangThaiDon.equals("Đang chờ giao") || trangThaiDon.equals("Đã hủy")) {
                builder.and(QDonHang.donHang.ngayDatHang.loe(formatDate.parse(denNgay)));
            } else if (trangThaiDon.equals("Đang giao")) {
                builder.and(QDonHang.donHang.ngayGiaoHang.loe(formatDate.parse(denNgay)));
            } else { // hoàn thành
                builder.and(QDonHang.donHang.ngayNhanHang.loe(formatDate.parse(denNgay)));
            }
        }

        return donHangRepo.findAll(builder, PageRequest.of(page - 1, 6));
    }


    public DonHang update(DonHang dh) {
        return donHangRepo.save(dh);
    }


    public DonHang findById(long id) {
        return donHangRepo.findById(id).get();
    }


    public List<DonHang> findByTrangThaiDonHangAndShipper(String trangThai, NguoiDung shipper) {
        return donHangRepo.findByTrangThaiDonHangAndShipper(trangThai, shipper);
    }


    public DonHang save(DonHang dh) {
        return donHangRepo.save(dh);
    }


    public List<Object> layDonHangTheoThangVaNam() {
        return donHangRepo.layDonHangTheoThangVaNam();
    }


    public List<DonHang> getDonHangByNguoiDung(NguoiDung ng) {
        return donHangRepo.findByNguoiDat(ng);
    }


    public Page<DonHang> findDonHangByShipper(SearchDonHangObject object, int page, int size, NguoiDung shipper) throws ParseException {
        BooleanBuilder builder = new BooleanBuilder();

        String trangThaiDon = object.getTrangThaiDon();
        String tuNgay = object.getTuNgay();
        String denNgay = object.getDenNgay();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        builder.and(QDonHang.donHang.shipper.eq(shipper));

        if (!trangThaiDon.equals("")) {
            builder.and(QDonHang.donHang.trangThaiDonHang.eq(trangThaiDon));
        }

        if (!tuNgay.equals("") && tuNgay != null) {
            if (trangThaiDon.equals("Đang giao")) {
                builder.and(QDonHang.donHang.ngayGiaoHang.goe(formatDate.parse(tuNgay)));
            } else { // hoàn thành
                builder.and(QDonHang.donHang.ngayNhanHang.goe(formatDate.parse(tuNgay)));
            }
        }

        if (!denNgay.equals("") && denNgay != null) {
            if (trangThaiDon.equals("Đang giao")) {
                builder.and(QDonHang.donHang.ngayGiaoHang.loe(formatDate.parse(denNgay)));
            } else { // hoàn thành
                builder.and(QDonHang.donHang.ngayNhanHang.loe(formatDate.parse(denNgay)));
            }
        }

        return donHangRepo.findAll(builder, PageRequest.of(page - 1, size));
    }


    public int countByTrangThaiDonHang(String trangThaiDonHang) {
        return donHangRepo.countByTrangThaiDonHang(trangThaiDonHang);
    }

}

