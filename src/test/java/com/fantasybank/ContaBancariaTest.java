package com.fantasybank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Teste da classe ContaBancaria")
public class ContaBancariaTest {

    //Teste para checar o metodo sacar()
    @Test
    @DisplayName("Saque de 500 reais com sucesso.")
    public void testSacar() {
        ContaBancaria conta = new ContaBancaria(500, -1000);
        conta.sacar(300);
        assertEquals(200, conta.getSaldo());
    }

    //Teste para checar o metodo depositar()
    @Test
    @DisplayName("Deposito de 400 reais com sucesso.")
    public void testDepositar() {
        ContaBancaria conta = new ContaBancaria(400, 0);
        conta.depositar(500);
        assertEquals(900, conta.getSaldo());
    }

    //Teste para checar se o saldo pode ter um valor negativo
    @Test
    @DisplayName("Saldo com valor negativo")
    public void testSaqueNaoNulo() {
        ContaBancaria contaBancaria = new ContaBancaria(500, -1000);
        contaBancaria.sacar(800);
        assertNotEquals(0, contaBancaria.getSaldo());
    }
}
