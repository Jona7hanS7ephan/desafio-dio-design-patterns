package com.example.gestaoPedidos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.gestaoPedidos.service.DatabaseConnection;

@SpringBootApplication
public class GestaoPedidosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoPedidosApplication.class, args);

		// Exemplo de uso do Singleton
		DatabaseConnection connection = DatabaseConnection.getInstance();
		connection.connect();
	}

}
