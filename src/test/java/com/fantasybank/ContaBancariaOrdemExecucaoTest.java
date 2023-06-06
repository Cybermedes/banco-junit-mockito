package com.fantasybank;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ContaBancariaOrdemExecucaoTest {

    static ContaBancaria conta = new ContaBancaria(0, 0);

    /*
    Teste para executar com ordem de execução. O metodo testDepositar() deve ser
    executado primeiro e logo em seguida o metodo testSacar().
    Seguindo essa ordem, ambos devem passar nos testes
     */
    @Test
    @Order(2)
    public void testSacar() {
        conta.sacar(300);

        assertEquals(200, conta.getSaldo());
    }

    @Test
    @Order(1)
    public void testDepositar() {
        conta.depositar(500);

        assertEquals(500, conta.getSaldo());
    }
}
