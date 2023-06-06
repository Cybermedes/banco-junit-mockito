package com.fantasybank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaBancariaNestedTest {

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

    @Nested
    class CasoSaldoIgualZero {

        @Test
        @DisplayName("Teste saque menor do que o saldo minimo: exception")
        public void testSaqueSaldoMinimoIgualZero() {
            ContaBancaria conta = new ContaBancaria(0, 0);

            assertThrows(RuntimeException.class, () -> conta.sacar(500));
        }

        @Test@DisplayName("Teste saque com saldo negativo")
        public void testSaqueSaldoMinimoNegativo() {
            ContaBancaria conta = new ContaBancaria(0, -1000);

            conta.sacar(500);

            assertEquals(-500, conta.getSaldo());
        }
    }
}
