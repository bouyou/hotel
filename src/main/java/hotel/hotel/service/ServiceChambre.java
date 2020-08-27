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

    /**
     * methode qui enregistre une nouvelle chb dans la bdd
     * @param chambre
     */
    public void create(Chambre chambre){

        this.repo.save(chambre);
    }

    /**
     * methodde sui supprime ou archive une chambre selon qu'elle a des reservations ou non
     * @param chambre
     */
    public void delete(Chambre chambre){

        this.repo.delete(chambre);
    }

    /**
     * permet de recuperer une chambre avec son id
     * @param id
     * @return un objet chambre
     */
    public Chambre chooseRoomById(int id){
        return this.repo.getOne(id);
    }

    /**
     * permet de modifier les parametres d'une chambre
     * @param chambre
     */
    public void modif(Chambre chambre){

        this.repo.save(chambre);
    }

    /**
     * permet de recuperer la liste des chambre d'un hotel
     * @param id
     * @return une liste de chambres
     */
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
