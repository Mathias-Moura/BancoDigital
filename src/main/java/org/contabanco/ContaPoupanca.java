package org.contabanco;

public class ContaPoupanca extends Account {

    public ContaPoupanca(Client client){
        super(client);
    }

    @Override
    public void imprimirInfoComuns() {
        System.out.println("** Extrato Conta Poupança **");
        super.imprimirInfoComuns();
    }
}
