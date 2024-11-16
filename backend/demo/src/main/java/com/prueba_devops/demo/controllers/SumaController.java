package com.ejemplo.suma;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {

    @GetMapping("/sumar")
    public String sumar(@RequestParam int num1, @RequestParam int num2) {
        int suma = num1 + num2;
        return "La suma de " + num1 + " y " + num2 + " es: " + suma;
    }
}
