package hotel.hotel.service;

import hotel.hotel.HotelApplication;
import hotel.hotel.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class ServiceClient {

    final ClientRepository clientRepository;
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


    public void create(Client client) {

        this.clientRepository.save(client);
    }

    public void delete(Client client) {

        this.clientRepository.delete(client);
    }

    public void modif(Client client) {

        this.clientRepository.save(client);
    }



}