package nghienht.sivimartonline.model;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "bill")
@Inheritance(strategy = InheritanceType.JOINED)// chiến lực ánh xạ joined
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bill_id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    // chỉ ra rằng mapping qua trường nào: chính là trường customer-id trong table bill entity
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "sale_staff_id", nullable = false)
    // chỉ ra rằng mapping qua trường nào: chính là trường customer-id trong table bill entity
    private SaleStaffEntity saleStaffEntity;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "bill_detail",
            joinColumns = {@JoinColumn(name = "bill_id")},
            inverseJoinColumns = {@JoinColumn(name="item_id")})
    private List<ItemEntity> itemEntityList = new ArrayList<>();


            private Date created_day;

    private double total_cost;



}
