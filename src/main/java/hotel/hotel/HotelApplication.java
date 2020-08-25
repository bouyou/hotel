package hotel.hotel;

import hotel.hotel.entities.Chambre;
import hotel.hotel.entities.ChambreRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import java.util.List;


@SpringBootApplication
public class HotelApplication {

	public static void main(String[] args) {

		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(HotelApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(HotelApplication.class, args);
		ChambreRepository repo = context.getBean(ChambreRepository.class);

		List<Chambre> toto = repo.findAll();
		System.out.println("hello");

	}


}
