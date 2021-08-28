package nghienht.sivimartonline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "thukho")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ThuKhoEntity extends StaffEntity {

    private Long staff_id;
    public String staff_name;

    @Column
    public double base_salary;

    @Column
    public double bonus;

    @Column
    public double total_salary;

//    public  static ThuKhoEntity mockData(){
//        ThuKhoEntity thuKhoEntity = new ThuKhoEntity();
//        thuKhoEntity.MaNV= 123;
//        thuKhoEntity.tenNV="Nghien";
//        thuKhoEntity.setPhuCap("1");
//        thuKhoEntity.setLuongCanBan("2");
////        thuKho.tienLuong= thuKho.getPhuCap().toString().+ thuKho.getLuongCanBan();
//        return thuKhoEntity;
//    }

}