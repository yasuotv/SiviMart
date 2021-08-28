package nghienht.sivimartonline.model;

import lombok.*;

import javax.persistence.*;

//@Entity
//@Table(name = "nhanvien")
@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staff_id;

    @Column
    public String staff_name;

    private double base_salary;

//

}
