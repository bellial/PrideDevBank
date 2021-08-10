package com.priss.prideDevBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8fbc81ca55580bd50df7c61d9bdcd770c1463673
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

<<<<<<< HEAD
@ComponentScan({ "com.priss.prideDevBank" })
@EntityScan({ "com.priss.prideDevBank.entity" })
@EnableJpaRepositories("com.priss.prideDevBank.repository")
=======
@ComponentScan({"com.priss.prideDevBank"})
@EntityScan({"com.priss.prideDevBank.entity"})
@EnableJpaRepositories("com.priss.prideDevBank.repository")
=======

>>>>>>> 23c38b5009fc485b7681285fe1ef33f88069513a
>>>>>>> 8fbc81ca55580bd50df7c61d9bdcd770c1463673
@SpringBootApplication
public class PrideDevBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrideDevBankApplication.class, args);
	}

}
