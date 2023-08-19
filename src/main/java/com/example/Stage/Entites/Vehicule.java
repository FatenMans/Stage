package com.example.Stage.Entites;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehicules")
public class Vehicule {
    @Id
    private String id;
    private String matricule;
    private String marque;
    private String modele;
    private String type;
    private int puissanceFiscale;
    private int anneeMiseEnCirculation;
    private String typeCarburant;
    private int quantiteCarburantEnLitre;

    public Vehicule(String id, String matricule, String marque, String modele, String type, int puissanceFiscale, int anneeMiseEnCirculation, String typeCarburant,
                    int quantiteCarburantEnLitre) {
        this.id = id;
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
        this.type = type;
        this.puissanceFiscale = puissanceFiscale;
        this.anneeMiseEnCirculation = anneeMiseEnCirculation;
        this.typeCarburant = typeCarburant;
        this.quantiteCarburantEnLitre = quantiteCarburantEnLitre;
    }
}
