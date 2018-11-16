package com.mikolaj;

public class AccountBuilder {

    private String name;
    private String lastName;
    private Integer number;
    private Double initialAmmount;
    private String currency;

    public AccountBuilder withName(String name){
        this.name = name;
        return this;
    }

    public AccountBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder withNumber(Integer number){
        this.number = number;
        return this;
    }

    public AccountBuilder withInitialAmmount(Double initialAmmount){
        this.initialAmmount = initialAmmount;
        return this;
    }

    public AccountBuilder withCurrency(String currency){
        this.currency = currency;
        return this;
    }

    public Account makeAnAccount(){
        return new Account(name, lastName, number, initialAmmount, currency);
    }

}
