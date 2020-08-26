package hotel.hotel;
import hotel.hotel.entities.*;
import hotel.hotel.utils.Menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;


@SpringBootApplication
public class HotelApplication {

	private static Logger logger = LoggerFactory.getLogger("HotelApplication");



	public static void main(String[] args) {

		//Dont touch !!!!!
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(HotelApplication.class, args);
		//Menu
		Menu.showMainMenu();
		//

	   logger.info("teststststs");

		//Example
		ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
		ChambreRepository repo = context.getBean(ChambreRepository.class);



	   /*
		Hotel myHotel = new Hotel()
		ate myDate = Date();
		myHotel.setDateAjout();
		myHotel.setNbChambre(50);
		myHotel.setDateModif();
		ServiceHotel myServiceHotel = new ServiceHotel();
		myServiceHotel.create(myHotel);
		*/

		List<Chambre> toto = repo.findAll();

		System.out.println("===> " + toto.stream().count());
		System.out.println("hello");

	}

	private static ChambreRepository  chambreRepository;


	//Validation
	@Bean
	public CommandLineRunner run(ChambreRepository chambreRepository) throws Exception {

		return (String[] args) -> {

			Chambre c = new Chambre();
					c.setNbPax(1);
					c.setDateAjout(new Date());
					c.setDateModif(new Date());
					c.setIdHotel(1);
					c.setNumero("1245");

					Chambre a  = chambreRepository.save(c);

				    chambreRepository.findAll().forEach(System.out::println);



					//NULL,'1', 3, d, NULL ,NULL , 1);
			/*
			User user2 = new User("Jenny", "jenny@domain.com");
			userRepository.save(user1);
			userRepository.save(user2);
			userRepository.findAll().forEach(System.out::println);*/
		};
	}

}
