package org.contabanco;

public abstract class Account implements IAccount {
    public static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected int balance;
    protected Client client;

    public Account(Client client){
        this.agency = Account.AGENCIA_PADRAO;
        this.number = SEQUENCIAL++;
        this.client = client;
    }


    @Override
    public void sacar(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, Account accountDestiny) {
        this.sacar(value);
        accountDestiny.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d ", this.agency));
        System.out.println(String.format("Number: %d ", this.number));
        System.out.println(String.format("Balance: %d ", this.balance));
    }


}
