package hotel.hotel;

import hotel.hotel.entities.Chambre;
import hotel.hotel.entities.ChambreRepository;
import hotel.hotel.entities.Hotel;
import hotel.hotel.service.ServiceHotel;
import hotel.hotel.utils.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.Date;
import java.util.List;


@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {

		//Dont touch !!!!!
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(HotelApplication.class, args);
		//Menu

		Menu.showMainMenu();
		//










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

	}


}
