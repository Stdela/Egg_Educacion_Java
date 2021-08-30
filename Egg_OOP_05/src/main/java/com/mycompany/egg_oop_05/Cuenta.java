package com.mycompany.egg_oop_05;
public class Cuenta {
private int numeroCuenta;
private int documento;
private int saldo;
private int ingresar;
private int retirar;
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int documento, int saldo, int ingresar, int retirar) {
        this.numeroCuenta = numeroCuenta;
        this.documento = documento;
        this.saldo = saldo;
        this.ingresar = ingresar;
        this.retirar = retirar;
    }

    public int getRetirar() {
        return retirar;
    }

    public void setRetirar(int retirar) {
        this.retirar = retirar;
    }

    public int getIngresar() {
    return ingresar;
    }

    public void setIngresar(int ingresar) {
        this.ingresar = ingresar;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", documento=" + documento + ", saldo=" + saldo + '}';
    }

    void getDocumento(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}

