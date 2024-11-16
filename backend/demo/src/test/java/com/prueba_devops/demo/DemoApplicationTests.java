package com.prueba_devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.prueba_devops.demo.services.CalculadoraService;

@SpringBootTest
class DemoApplicationTests {

	private final CalculadoraService calculadoraService = new CalculadoraService();

	@Test
	public void testSumar() {
		int resultado = calculadoraService.sumar(2, 3);
		assertEquals(5, resultado, "La suma de 2 y 3 debería ser 5");
	}

	@Test
	public void testSumarNegativos() {
		int resultado = calculadoraService.sumar(-2, -3);
		assertEquals(-5, resultado, "La suma de -2 y -3 debería ser -5");
	}

	@Test
	public void testSumarConCero() {
		int resultado = calculadoraService.sumar(0, 5);
		assertEquals(5, resultado, "La suma de 0 y 5 debería ser 5");
	}
}
