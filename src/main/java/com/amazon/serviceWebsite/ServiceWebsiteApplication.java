package com.amazon.serviceWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.amazon.Model.UserDetails;
import com.amazon.Repository.UserRepository;

@SpringBootApplication
public class ServiceWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceWebsiteApplication.class, args);
	}
	
	/*@Autowired
	UserDetails userdetails;
	UserRepository userRepo;
	
	@Bean
    CommandLineRunner init (UserDetails userDetailsRepo){
		
		userdetails.setUserName("admin");
		userdetails.setId(100);
		userdetails.setPassword("admin");
		userdetails.setDoorNo(32);
		userdetails.setStreet("Kamaraj Street");
		userdetails.setCity("Chennai");
		userdetails.setState("TamilNadu");
		userdetails.setPinCode("600107");
		userdetails.setPhoneNumber("9080998866");
		
        return args -> {
            userRepo.saveUser(userdetails);
        };
    }*/

}
