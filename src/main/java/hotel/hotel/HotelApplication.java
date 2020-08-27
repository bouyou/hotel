package hotel.hotel;
import hotel.hotel.entities.*;
import hotel.hotel.service.ServiceClient;
import hotel.hotel.utils.Menu;

import hotel.hotel.utils.Validation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class HotelApplication {

	private static Logger logger = LoggerFactory.getLogger("HotelApplication");

	public static void main(String[] args) {

		/******Dont touch !!!!!****/
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(HotelApplication.class, args);
		//Menu
		//Menu.showMainMenu();
		/******* Fin dont touch *****/



		/*****Tests*****/

		//Example
		ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
		ChambreRepository repo = context.getBean(ChambreRepository.class);
		List<Chambre> toto = repo.findAll();
		System.out.println("Salut les tarlouzes !!!");
		System.out.println("=nombre de chambre==> " + toto.size());

		logger.info("Allez on se bouge le cul !! ");
		logger.debug("debugtest:");
		logger.error("error test:");
	    /*
		Hotel myHotel = new Hotel()
		ate myDate = Date();
		myHotel.setDateAjout();
		myHotel.setNbChambre(50);
		myHotel.setDateModif();
		ServiceHotel myServiceHotel = new ServiceHotel();
		myServiceHotel.create(myHotel);
		*/


		//Tests validation

		//System.out.println("value ?");
		//Scanner scanner = new Scanner(System.in);

		/*
		int valuei =  10; //scanner.nextInt();
        System.out.println("-----------------ok");
		Validation.checkInteger( (Integer) valuei, 11, "(int)");
        System.out.println("-----------------egal ok");
        Validation.checkInteger( (Integer) valuei, 10, "(int)");
        System.out.println("-----------------pas ok");
        Validation.checkInteger( (Integer) valuei, 5, "(int)");

        String values = "abcde";
        System.out.println("-----------------ok");
        Validation.checkString( values, 6, "(string)");
        System.out.println("-----------------ok egal");
        Validation.checkString( values, 5, "(string)");
        System.out.println("-----------------pas ok");
        Validation.checkString( values, 2, "(string)");

        System.out.println("-----------------pas ok données");
        Validation.checkInteger( null, 6, "(Null integer)");
		System.out.println("-----------------pas ok 0 données");
		Validation.checkInteger( 0, 6, "(Null integer)");
        System.out.println("-----------------pas ok données");
        Validation.checkString( null, 2, "string null");
        */



	}

    /**
     * Method test rapide ( se lance avant le main )
     */
	private static ChambreRepository  chambreRepository;


	/*
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
		};
	}*/


}
