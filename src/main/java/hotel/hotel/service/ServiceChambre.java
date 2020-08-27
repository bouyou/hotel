package hotel.hotel.service;

import hotel.hotel.HotelApplication;
import hotel.hotel.entities.Chambre;
import hotel.hotel.entities.ChambreRepository;
import hotel.hotel.entities.Hotel;
import hotel.hotel.entities.HotelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ServiceChambre {

    final ChambreRepository repo;

    /**
     * Construct
     */
    public ServiceChambre(){
        String args = "";
        ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
        this.repo = context.getBean(ChambreRepository.class);

    }


    public void create(int hotelId,Chambre chambre){

        this.repo.save(chambre);
    }

    public void delete(Chambre chambre){
        this.repo.delete(chambre);
    }

    public void modif(Chambre chambre){
        this.repo.save(chambre);
    }


}
