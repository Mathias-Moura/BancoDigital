package org.contabanco;

import java.util.List;

public class Bank {

    private String Name;
    private List<Account> accounts;

    public String getName() {
        return Name;
    }

    public void setNome(String name) {
        Name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> contas) {
        this.accounts = contas;
    }
}
