package com.example.demo01.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
public class LienHeDTO {
    @Override
    public String toString() {
        return "LienHeDTO [id=" + id + ", noiDungTraLoi=" + noiDungTraLoi + ", tieuDe=" + tieuDe + ", diaChiDen="
                + diaChiDen + ", ngayTraLoi=" + ngayTraLoi + "]";
    }

    private long id;

    @NotEmpty(message="Nội dung trả lời không được trống")
    private String noiDungTraLoi;

    private String tieuDe;
    private String diaChiDen;
    private Date ngayTraLoi;
}
