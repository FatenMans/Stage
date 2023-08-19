package com.example.Stage.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@NoArgsConstructor

@Data

@Document(collection = "appareils")
public class Appreil {
    @Id
    private String id;
    private String numeroSerie;
    private String type;
    private int quantiteEnStock;

    public Appreil(String id, String numeroSerie, String type, int quantiteEnStock) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.type = type;
        this.quantiteEnStock = quantiteEnStock;
    }
}

