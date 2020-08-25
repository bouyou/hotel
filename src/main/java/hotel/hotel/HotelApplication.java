package hotel.hotel;

import hotel.hotel.entities.Chambre;
import hotel.hotel.entities.ChambreRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class HotelApplication {

	@Autowired
	private static ChambreRepository repo;


	public static void main(String[] args) {

		SpringApplication.run(HotelApplication.class, args);
		//List<Chambre> toto = repo.findAll();
		System.out.println("hello");

	}


}
