package hotel.hotel.service;
import hotel.hotel.HotelApplication;
import hotel.hotel.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;
import java.util.List;

public class ServiceHotel {

    final HotelRepository repo;
    final ChambreRepository repochambre;

    /**
     * Construct
     * @param repochambre
     */
    public ServiceHotel(ChambreRepository repochambre){

        String args = "";
        ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
        this.repo = context.getBean(HotelRepository.class);
        this.repochambre = context.getBean(ChambreRepository.class);;
    }



    /**
     * "create" save the hotel in the bdd
     * @param hotel
     */
    public void create(Hotel hotel) {
        this.repo.save(hotel);
        if(hotel.getId() != null){
            System.out.println(" hotel créé");
        }else{
            System.out.println(" hotel non créé");
        }
    }

    /**
     * "delete" the hotel only if he has no room else he is archived
     * @param hotel
     */
    public void delete(Hotel hotel) {
        //si l'hotel a des chambres'
        if (hotelHasChambres(hotel.getId())){ // on archive l'hotel'
            Date currentdate = new Date();
            hotel.setDateDelete((java.sql.Date) currentdate);
            this.repo.save(hotel);

        }else{//sinon il est supprime

            this.repo.delete(hotel);
        }

    }

    /**
     * methode qui permet de récupérer un hotel avec son id
     * @return "Hotel"
     */
    public Hotel chooseHotelById(int id){
        return this.repo.getOne(id);
    }

    /**
     * enregistre les modificatiosn de l'hotel
     * @param hotel
     */
    public void modif(Hotel hotel) {
        this.repo.save(hotel);
    }

    /**
     * hotelHasChambres return true if hotel have rooms
     * @param idHotel
     * @return boolean
     */
    public boolean hotelHasChambres(int idHotel){
        List<Chambre> nbRooms = this.repochambre.getRoomByIdHotel(idHotel);

        return nbRooms.size()>0;

    }
}
