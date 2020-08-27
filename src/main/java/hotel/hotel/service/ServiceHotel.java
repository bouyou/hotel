package hotel.hotel.service;
import hotel.hotel.HotelApplication;
import hotel.hotel.entities.Chambre;
import hotel.hotel.entities.Client;
import hotel.hotel.entities.Hotel;
import hotel.hotel.entities.HotelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ServiceHotel {

    final HotelRepository repo;

    /**
     * Construct
     */
    public ServiceHotel(){
        String args = "";
        ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
        this.repo = context.getBean(HotelRepository.class);

    }


    public void create(Hotel hotel){
        this.repo.save(hotel);
    }

    public void delete(int hotelID) {
        //on ne peut supprimer un hotel que si il n'a pas de chambres
       /* Hotel myHotel = this.repo.getOne(hotelID);
        if(myHotel.){//si l'hotel n'a pas de chambre
            this.repo.delete(myHotel);
        }else{//si l'hotel a des chambre on l'archive
            myHotel.
            this.repo.save(myHotel);
        }*/

    }

    public void modif(Hotel hotel) {
        this.repo.save(hotel);
    }

}
