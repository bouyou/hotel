package hotel.hotel;

import hotel.hotel.entities.*;
import hotel.hotel.service.ServiceClient;
import hotel.hotel.service.ServiceHotel;
import hotel.hotel.utils.Menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.Date;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class HotelApplication {

//	private static Logger logger = LoggerFactory.getLogger("test");

	public static void main(String[] args) {

		//Dont touch !!!!!
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(HotelApplication.class, args);
		//Menu


		Menu.showMainMenu();
		//

	  // logger.info("teststststs");

		//Example


		//ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
		//ChambreRepository repo = context.getBean(ChambreRepository.class);


	   /*
		Hotel myHotel = new Hotel()
		ate myDate = Date();
		myHotel.setDateAjout();
		myHotel.setNbChambre(50);
		myHotel.setDateModif();
		ServiceHotel myServiceHotel = new ServiceHotel();
		myServiceHotel.create(myHotel);
		*/

		//List<Chambre> toto = repo.findAll();

		//System.out.println("===> " + toto.stream().count());
		System.out.println("hello");


		//test de delete client
		/*
		ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
		ClientRepository repoClient = context.getBean(ClientRepository.class);
		Client clientToDelete = repoClient.getOne(12);
		ServiceClient serviceClient = new ServiceClient();
		serviceClient.delete(clientToDelete);
		*/


		//test de create client
		/*
		ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
		ClientRepository repoClient = context.getBean(ClientRepository.class);
		Client newClient = new Client();
		newClient.setNom("TEST2");
		newClient.setPrenom("test2");
		newClient.setDateAjout(new Date());
		newClient.setIdHotel(1);
		newClient.setDateNaissance(new Date());
		newClient.setMail("mail");
		ServiceClient serviceClient = new ServiceClient();
		serviceClient.create(newClient);
		*/

	}


}
