package hotel.hotel.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Integer>, JpaSpecificationExecutor<Chambre> {



    List<Chambre> getRoomByIdHotel(int id);
}