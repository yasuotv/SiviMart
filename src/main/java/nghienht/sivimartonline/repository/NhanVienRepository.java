package nghienht.sivimartonline.repository;

import nghienht.sivimartonline.model.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository extends JpaRepository<StaffEntity, String> {

}
