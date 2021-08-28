package nghienht.sivimartonline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nguoi_quan_ly")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NguoiQuanLy extends StaffEntity {
    private Long staff_id;
    public String staff_name;




}
