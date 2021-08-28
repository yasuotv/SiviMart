package nghienht.sivimartonline.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;

    private String customer_name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customerEntity")// 1 customer chứa 1 set hay list các billentity
    // chỉ ra là map thông qua thuộc tính customerEnity trong class bill Entity
    private List<BillEntity> billEntityList = new ArrayList<>();

    private String phone_number;
    private String address;


}
