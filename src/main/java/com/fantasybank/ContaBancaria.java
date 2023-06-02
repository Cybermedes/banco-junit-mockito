package com.fantasybank;

public class ContaBancaria {

    private double saldo;
    private double saldoMinimo;
    private boolean isActive = true;

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

    public boolean isActive() {
        return isActive;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
