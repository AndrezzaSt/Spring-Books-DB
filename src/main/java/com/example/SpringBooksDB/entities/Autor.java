package com.example.SpringBooksDB.entities;


import javax.persistence.*;

@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String primeiroNome;
    private String ultimoNome;

    public Autor() {
    }

    public Autor(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }



    public Long getId() {
        return id;
    }


    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}
