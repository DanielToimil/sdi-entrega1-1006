package com.uniovi.services;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniovi.entities.Offer;
import com.uniovi.entities.User;

//Sí quisieramos desactivar el servicio bastaría con eliminar la anotación etiqueta @Service
@Service
public class InsertSampleDataService {
	@Autowired
	private UsersService usersService;

	@Autowired
	private RolesService rolesService;

	@Autowired
	private OffersService offersService;

	@PostConstruct
	public void init() {

		/** ADMINISTRADOR **/
		User admin = new User("admin@gmail.com", "Administrador", "Sistema");
		admin.setPassword("admin");
		admin.setMoney(999.0);
		admin.setRole(rolesService.getRoles()[1]);

		/** USUARIOS **/
		User user1 = new User("usuario1@gmail.com", "Usuario1", "Usuario1");
		user1.setPassword("123456");
		user1.setMoney(100.0);
		user1.setRole(rolesService.getRoles()[0]);
		User user2 = new User("usuario2@gmail.com", "Usuario2", "Usuario2");
		user2.setPassword("123456");
		user2.setMoney(100.0);
		user2.setRole(rolesService.getRoles()[0]);
		User user3 = new User("usuario3@gmail.com", "Usuario3", "Usuario3");
		user3.setPassword("123456");
		user3.setMoney(100.0);
		user3.setRole(rolesService.getRoles()[0]);
		User user4 = new User("usuario4@gmail.com", "Usuario4", "Usuario4");
		user4.setPassword("123456");
		user4.setMoney(100.0);
		user4.setRole(rolesService.getRoles()[0]);
		User user5 = new User("usuario5@gmail.com", "Usuario5", "Usuario5");
		user5.setPassword("123456");
		user5.setMoney(100.0);
		user5.setRole(rolesService.getRoles()[0]);

		/** AÑADIR USUARIOS **/
		usersService.addUser(admin);
		usersService.addUser(user1);
		usersService.addUser(user2);
		usersService.addUser(user3);
		usersService.addUser(user4);
		usersService.addUser(user5);

		/** OFERTAS USER 1 **/
		Offer offer1 = new Offer("Seat Ibiza",
				"Coche de segunda mano con 100k kilometros, gasolina, año 2014 color rojo pasión.",
				6000.0);
		offer1.setDate(new Date());
		offer1.setCreator(user1);

		Offer offer2 = new Offer("Ford fiesta",
				"Coche de segunda mano con 150k kilometros, diesel, año 2009 color blanco.",
				6000.0);
		offer2.setDate(new Date());
		offer2.setCreator(user1);
		offer2.setBuyer(user2);
		offer2.setSold(true);

		Offer offer3 = new Offer("Renault megane",
				"Coche de segunda mano con 200k kilometros, diesel, año 2007 color azul.",
				10.0);
		offer3.setDate(new Date());
		offer3.setCreator(user1);
		offer3.setBuyer(user2);
		offer3.setSold(true);

		/** OFERTAS USER 2 **/
		Offer offer4 = new Offer("Kit de supervivencia de montaña", "Inmejorable kit para la supervivencia para situaciones extremas.",
				100.0);
		offer4.setDate(new Date());
		offer4.setCreator(user2);

		Offer offer5 = new Offer("Mochila de deporte", "Mochila para pensada para todo tipo de deportes.",
				1000.0);
		offer5.setDate(new Date());
		offer5.setCreator(user2);
		offer5.setBuyer(user3);
		offer5.setSold(true);

		Offer offer6 = new Offer("Pistola",
				"Pistola de policia", 12.0);
		offer6.setDate(new Date());
		offer6.setCreator(user2);
		offer6.setBuyer(user3);
		offer6.setSold(true);

		/** OFERTAS USER 3 **/
		Offer offer7 = new Offer("Tekken 8", "Juego ps4 precintado edición coleccionista.", 35.0);
		offer7.setDate(new Date());
		offer7.setCreator(user3);

		Offer offer8 = new Offer("God of war 4", "El mejor juego de sony del 2018.", 69.0);
		offer8.setDate(new Date());
		offer8.setCreator(user3);
		offer8.setBuyer(user4);
		offer8.setSold(true);

		Offer offer9 = new Offer("Fifa 20", "Para que destruyas todos los mandos cuando juegues FutChampions", 45.0);
		offer9.setDate(new Date());
		offer9.setCreator(user3);
		offer9.setBuyer(user4);
		offer9.setSold(true);

		/** OFERTAS USER 4 **/
		Offer offer10 = new Offer("Se vende cachorro de Husky",
				"Tiene solamente un mes",
				180.0);
		offer10.setDate(new Date());
		offer10.setCreator(user4);

		Offer offer11 = new Offer("Labrador",
				"Perfecto para cuidar de tu ganado",
				200.0);
		offer11.setDate(new Date());
		offer11.setCreator(user4);
		offer11.setBuyer(user5);
		offer11.setSold(true);

		Offer offer12 = new Offer("Gato egipcio",
				"Para los que les encantan las mascotas y no quieren tener pelos por toda la casa.",
				10.0);
		offer12.setDate(new Date());
		offer12.setCreator(user4);
		offer12.setBuyer(user5);
		offer12.setSold(true);

		/** OFERTAS USER 5 **/
		Offer offer13 = new Offer("El triciclo rojo",
				"Mejor thriller francés en 2017",
				20.0);
		offer13.setDate(new Date());
		offer13.setCreator(user5);

		Offer offer14 = new Offer("Harry Potter versión del coleccionista",
				"Incluye varita y capa de la invisibilidad",
				27000.0);
		offer14.setDate(new Date());
		offer14.setCreator(user5);
		offer14.setBuyer(user1);
		offer14.setSold(true);

		Offer offer15 = new Offer("Juego de tronos",
				"Para que veas la lucha contra los caminantes blancos",
				19.0);
		offer15.setDate(new Date());
		offer15.setCreator(user5);
		offer15.setBuyer(user1);
		offer15.setSold(true);

		/** AÑADIR TODAS LAS OFERTAS **/
		offersService.addOffer(offer1);
		offersService.addOffer(offer2);
		offersService.addOffer(offer3);
		offersService.addOffer(offer4);
		offersService.addOffer(offer5);
		offersService.addOffer(offer6);
		offersService.addOffer(offer7);
		offersService.addOffer(offer8);
		offersService.addOffer(offer9);
		offersService.addOffer(offer10);
		offersService.addOffer(offer11);
		offersService.addOffer(offer12);
		offersService.addOffer(offer13);
		offersService.addOffer(offer14);
		offersService.addOffer(offer15);

	}
}