package hotel.hotel.service;

import hotel.hotel.HotelApplication;
import hotel.hotel.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.LinkedList;
import java.util.List;

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

    public Chambre chooseRoomById(int id){
        return this.repo.getOne(id);
    }

    public void modif(Chambre chambre){

        this.repo.save(chambre);
    }

    public List<Chambre> getRoomByIdHotel(int id){

        List<Chambre> listChambre = new LinkedList<>();
        //je recupere toute les Chambre
        List<Chambre> allChambre = this.repo.findAll();
        for (Chambre c : allChambre) {
            if(c.getIdHotel() == id){
                listChambre.add(c);
            }
        }
        return listChambre;
    }

}
