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

    //Teste para checar se a conta está ativa após a instância
    @Test
    @DisplayName("Teste para confirmar se conta está ativa")
    public void testAtiva() {
        ContaBancaria contaBancaria = new ContaBancaria(500, 0);
        assertTrue(contaBancaria.isActive());
    }

    //Teste para checar se o campo do cliente está null ou não
    @Test
    @DisplayName("Teste para definir o nome do cliente")
    public void testNomeCliente() {
        ContaBancaria contaBancaria = new ContaBancaria(500, 0);
        contaBancaria.setCliente("Bryan");
        assertNotNull(contaBancaria.getCliente());
    }

    //Testa para verificar se pode sacar menos do que o saldo minimo
    @Test
    @DisplayName("Teste se valor do saque pode ultrapassar saldo minimo")
    public void testSaqueMenorMinimo() {
        ContaBancaria contaBancaria = new ContaBancaria(500, -1000);
        assertThrows(RuntimeException.class, () -> contaBancaria.sacar(2000));
    }

    //Testa para verificar se metodos não irão lançar nenhuma exception
    @Test
    @DisplayName("Testa se não há exception ao usar metodo sacar e depositar")
    public void testSaqueDespositoNoException() {
        ContaBancaria contaBancaria = new ContaBancaria(500, -1000);
        assertAll(() -> contaBancaria.depositar(200), () -> contaBancaria.sacar(450));
    }
}
