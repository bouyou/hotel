package hotel.hotel.service;

import hotel.hotel.HotelApplication;
import hotel.hotel.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;


import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ServiceClient {

    public ClientRepository clientRepository;
    final ReservationRepository reservationRepository;

    /**
     * Construct
     */
    public ServiceClient() {
        String args = "";
        ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
        this.clientRepository = context.getBean(ClientRepository.class);
        this.reservationRepository = context.getBean(ReservationRepository.class);
    }

    /**
     * "create" save the client in the bdd
     * @param client
     */
    public void create(Client client) {
        this.clientRepository.save(client);
        if(client.getId() != null){
            System.out.println(" client créé");
        }else{
            System.out.println(" client non créé");
        }
    }

    /**
     * "delete" the client only if he has no reservation else he is archived
     * @param client
     */
    public void delete(Client client) {
        //si le client a des reservation
        if (clientHasReservation(client.getId())){ // on archive le client

            client.setDateDelete(new Date());
            this.clientRepository.save(client);

        }else{//sinon il est supprime

            this.clientRepository.delete(client);
        }

    }

    /**
     * methode qui permet de récupérer un client avec son id
     * @return "Client" le client choisi
     */
    public Client chooseClientById(int id){
        return this.clientRepository.getOne(id);
    }

    /**
     * enregistre les modificatiosn du client
     * @param client
     */
    public void modif(Client client) {
        this.clientRepository.save(client);
    }

    /**
     * clientHasReservation return true if client has reservation
     * @param idClient
     * @return boolean
     */
    public boolean clientHasReservation(int idClient){
        int nbReservation = this.reservationRepository.getReservationByIdClient(idClient).size();

        return nbReservation>0;

    }



}