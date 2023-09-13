package org.contabanco;

public class ContaCorrente extends Account {

    public ContaCorrente(Client client){
        super(client);
    }
    @Override
    public void imprimirInfoComuns() {
        System.out.println("** Extrato Conta Corrente **");
        super.imprimirInfoComuns();
    }
}
