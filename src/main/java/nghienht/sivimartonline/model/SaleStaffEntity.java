package nghienht.sivimartonline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sale_staff")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleStaffEntity extends StaffEntity {

    private Long sale_staff_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "saleStaffEntity")// 1 customer chứa 1 set hay list các billentity
    // chỉ ra là map thông qua thuộc tính customerEnity trong class bill Entity
    private List<BillEntity> billEntityList = new ArrayList<>();
    public String staff_name;
    @Column
    public double base_salary;




}
