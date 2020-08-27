package hotel.hotel.service;

import hotel.hotel.HotelApplication;
import hotel.hotel.entities.*;
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

    /**
     * create a reservation in bdd
     * @param reservation
     */
    public void create(Reservation reservation){

        this.repo.save(reservation);
    }

    /**
     * delete a reservation
     * @param reservation
     */
    public void delete(Reservation reservation) {

        this.repo.delete(reservation);
    }

    /**
     * find a reservation with his id
     * @param id
     * @return
     */
    public Reservation chooseReservationById(int id){

        return this.repo.getOne(id);
    }

    /**
     * update a reservation
     * @param reservation
     */
    public void modif(Reservation reservation) {

        this.repo.save(reservation);
    }

    /**
     * return alist of reservation for one client
     * @param id
     * @return list of reservation
     */
    public List<Reservation> getReservationByIdClient(int id){

        List<Reservation> listReservation = new LinkedList<>();
        //je recupere toute les reservations
        List<Reservation> allReservations = this.repo.findAll();
        for (Reservation r : allReservations) {
            if(r.getIdClient() == id){
                listReservation.add(r);
            }
        }
        return listReservation;
    }



}
