package com.fantasybank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class ContaBancariaAssumptionsTest {

    //
    @Test
    @DisplayName("Teste para checar a conta está vazia")
    public void testAtivarConta() {
        ContaBancaria conta = new ContaBancaria(500, 0);

        assumeFalse(conta == null, "A conta não está vazia");

        assertTrue(conta.isContaAtiva());
    }
}
