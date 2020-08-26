package hotel.hotel.service;
import hotel.hotel.HotelApplication;
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








}
