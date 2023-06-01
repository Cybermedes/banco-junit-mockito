package com.fantasybank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ContaBancariaTest {

    //Teste para checar o metodo sacar()
    @Test
    public void testSacar() {
        ContaBancaria conta = new ContaBancaria(500, -1000);
        conta.sacar(300);
        assertEquals(200, conta.getSaldo());
    }

    //Teste para checar o metodo depositar()
    @Test
    public void testDepositar() {
        ContaBancaria conta = new ContaBancaria(400, 0);
        conta.depositar(500);
        assertEquals(900, conta.getSaldo());
    }
}
