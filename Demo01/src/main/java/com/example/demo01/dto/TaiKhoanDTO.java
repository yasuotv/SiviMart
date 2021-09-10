package com.example.demo01.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.*;

@Getter
@Setter
public class TaiKhoanDTO {
    private String id;

    @NotEmpty(message="Phải nhập địa chỉ email")
    @Email(message= "Phải nhập đúng địa chỉ email")
    private String email;

    @Length(min=8, max=32, message="mật khẩu phải dài 8-32 ký tự")
    private String password;

    private String confirmPassword;

    @NotEmpty(message="Địa chỉ không được trống")
    private String diaChi;

    @NotEmpty(message="Họ tên không được trống")
    private String hoTen;

    @NotEmpty(message="Số điện thoại không được trống")
    private String sdt;
    private String tenVaiTro;
}
