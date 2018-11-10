package com.mikolaj;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String name;
    private String lastName;
    private Integer number;
    private Double initialAmmount;
    private String currency;

    public Account(String name, String lastName, Integer number, Double initialAmmount, String currency) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.initialAmmount = initialAmmount;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getInitialAmmount() {
        return initialAmmount;
    }

    public void setInitialAmmount(Double initialAmmount) {
        this.initialAmmount = initialAmmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", number=").append(number);
        sb.append(", initialAmmount=").append(initialAmmount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

