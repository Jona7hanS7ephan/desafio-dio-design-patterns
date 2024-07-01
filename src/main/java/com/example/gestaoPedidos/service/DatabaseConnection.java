package com.example.gestaoPedidos.service;

import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Construtor privado para evitar instância externa
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        // Código para conectar ao banco de dados
        System.out.println("Conectado ao banco de dados.");
    }
}
