package com.fantasybank;

public class ContaBancaria {

    private double saldo;
    private double saldoMinimo;
    private boolean contaAtiva = true;
    private String cliente;

    public ContaBancaria(double saldo, double saldoMinimo) {
        this.saldo = saldo;
        this.saldoMinimo = saldoMinimo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double sacar(double quantia) {
        if (saldo - quantia > saldoMinimo) {
            saldo -= quantia;
            return quantia;
        } else {
            throw new RuntimeException();
        }
    }

    public double depositar(double quantia) {
        return saldo += quantia;
    }
}
