package com.prueba_devops.demo.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int sumar(int a, int b) {
        return a + b;
    }
}
