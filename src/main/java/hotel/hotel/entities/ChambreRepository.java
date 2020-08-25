package hotel.hotel.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ChambreRepository extends JpaRepository<Chambre, Integer>, JpaSpecificationExecutor<Chambre> {

}