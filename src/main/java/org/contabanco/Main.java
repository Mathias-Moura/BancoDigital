package org.contabanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client1 = new Client();
        Client client2 = new Client();
        
        client1.setName("Mathias");
        client2.setName("Matheus");

        Account contaCorrente = new ContaCorrente(client1);
        contaCorrente.deposit(100);

        Account contaPoupanca = new ContaPoupanca(client2);
        contaPoupanca.deposit(150);

        contaCorrente.transfer(50, contaPoupanca);

        contaCorrente.imprimirInfoComuns();
        contaPoupanca.imprimirInfoComuns();


    }
}
