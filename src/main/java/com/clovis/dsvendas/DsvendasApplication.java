package com.clovis.dsvendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsvendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsvendasApplication.class, args);
		System.out.println("Conectado com sucesso");
	}

}
