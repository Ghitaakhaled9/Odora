package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String categorie;
    private double prix;
    private String description;
    private int quantityProduct;

    @ManyToMany(mappedBy = "produits")
    private List<Panier> paniers;

    @ManyToMany(mappedBy = "produits")
    private List<Commande> commandes;

    public Produit() {
    }

}
