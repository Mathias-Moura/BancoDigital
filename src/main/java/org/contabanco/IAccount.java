package org.contabanco;

public interface IAccount {

    public void sacar(double value);
    public void deposit(double value);
    public void transfer(double value, Account contaDestino);

}
