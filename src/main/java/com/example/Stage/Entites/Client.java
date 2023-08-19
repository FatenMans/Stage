package com.example.Stage.Entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "clients")
public class Client {
    @Id
    private String id;
    private String raisonSociale;
    private String matriculeSociale;
    private String siegeSociale;
    private String email;
    private String telephone;
    private String secteurActivite;
    private String nomComplet;
    private boolean blacklisted;
    private String username ;


    private String password ;


    public Client(String id, String raisonSociale, String matriculeSociale, String siegeSociale, String email, String telephone, String secteurActivite, String nomComplet) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.matriculeSociale = matriculeSociale;
        this.siegeSociale = siegeSociale;
        this.email = email;
        this.telephone = telephone;
        this.secteurActivite = secteurActivite;
        this.nomComplet = nomComplet;
    }


    @DBRef
    private List<Vehicule> vehicules;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getMatriculeSociale() {
        return matriculeSociale;
    }

    public void setMatriculeSociale(String matriculeSociale) {
        this.matriculeSociale = matriculeSociale;
    }

    public String getSiegeSociale() {
        return siegeSociale;
    }

    public void setSiegeSociale(String siegeSociale) {
        this.siegeSociale = siegeSociale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }


    public boolean isBlacklisted() {
        return blacklisted;
    }

    public void setBlacklisted(boolean blacklisted) {
        this.blacklisted = blacklisted;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

