package com.example.demo01.service;

import com.example.demo01.dto.TaiKhoanDTO;
import com.example.demo01.model.NguoiDung;
import com.example.demo01.model.VaiTro;
import com.example.demo01.repository.NguoiDungRepository;
import com.example.demo01.repository.VaiTroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service

public class NguoiDungService {
    @Autowired
    private NguoiDungRepository nguoiDungRepo;

    @Autowired
    private VaiTroRepository vaiTroRepo;

    /**
     *
     */
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;// hàm xử lý password, ko hiểu bên trong lắm

    public NguoiDung findByEmail(String email) {
        return nguoiDungRepo.findByEmail(email);
    }

    public NguoiDung savaUserForMember(NguoiDung nguoiDung) {
        nguoiDung.setPassword(bCryptPasswordEncoder.encode(nguoiDung.getPassword()));
        Set<VaiTro> setVaiTro = new HashSet<>();
        setVaiTro.add(vaiTroRepo.findByTenVaiTro("ROLE_MEMBER"));
        nguoiDung.setVaiTro(setVaiTro);// đặt vai trò vào 1 cái set với những người có role là member
        return nguoiDungRepo.save(nguoiDung);
    }

    public NguoiDung findById(long id) {
        NguoiDung nguoiDung = nguoiDungRepo.findById(id).get();
        return nguoiDung;
    }

    public NguoiDung updateUser(NguoiDung nguoiDung) {
        return nguoiDungRepo.save(nguoiDung);
    }

    public void changePass(NguoiDung nguoiDung, String newPW) {
        nguoiDung.setPassword(bCryptPasswordEncoder.encode(newPW));
        nguoiDungRepo.save(nguoiDung);
    }

    public Page<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro>vaiTroSet, int page){
        return nguoiDungRepo.findByVaiTro(vaiTroSet, PageRequest.of(0, 6));// lấy ra page đầu tiên
    }
    //overload hàm
    public List<NguoiDung> getNguoiDungByVaiTro(Set<VaiTro> vaiTroSet){
        return nguoiDungRepo.findByVaiTro(vaiTroSet);
    }

    public NguoiDung saveUserForAdmin(TaiKhoanDTO dto) {
        NguoiDung nd = new NguoiDung();
        nd.setHoTen(dto.getHoTen());
        nd.setDiaChi(dto.getDiaChi());
        nd.setEmail(dto.getEmail());
        nd.setSoDienThoai(dto.getSdt());
        nd.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));

        Set<VaiTro> vaiTro  = new HashSet<>();
        vaiTro.add(vaiTroRepo.findByTenVaiTro(dto.getTenVaiTro()));
        nd.setVaiTro(vaiTro);

        return nguoiDungRepo.save(nd);
    }






}
