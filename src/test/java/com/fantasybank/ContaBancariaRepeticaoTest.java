package com.fantasybank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ContaBancariaParameterResolver.class)
public class ContaBancariaRepeticaoTest {

    //Teste com repetição
    @RepeatedTest(5)
    @DisplayName("Deposito de 400 reais com sucesso.")
    public void testDepositar(ContaBancaria conta) {

        conta.depositar(500);

        assertEquals(900, conta.getSaldo());
    }
}
