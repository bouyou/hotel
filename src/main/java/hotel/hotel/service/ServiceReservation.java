package hotel.hotel.service;

import hotel.hotel.HotelApplication;
import hotel.hotel.entities.Hotel;
import hotel.hotel.entities.HotelRepository;
import hotel.hotel.entities.Reservation;
import hotel.hotel.entities.ReservationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.LinkedList;
import java.util.List;

public class ServiceReservation {

    final ReservationRepository repo;

    /**
     * Construct
     */
    public ServiceReservation(){
        String args = "";
        ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
        this.repo = context.getBean(ReservationRepository.class);

    }

    public void create(Reservation reservation){

        this.repo.save(reservation);
    }

    public void delete(Reservation reservation) {

        this.repo.delete(reservation);
    }

    public void modif(Reservation reservation) {

        this.repo.save(reservation);
    }


    public List<Reservation>  getReservationByClientId(int idClient){

        List<Reservation> listReservation = new LinkedList<>();
        //je recupere toute les reservations
        List<Reservation> allReservations = this.repo.findAll();
        for (Reservation r : allReservations) {
            if(r.getIdClient()==idClient){
                listReservation.add(r);
            }
        }
        return listReservation;
    }



}
