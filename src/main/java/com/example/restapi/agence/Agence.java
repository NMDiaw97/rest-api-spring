package com.example.restapi.agence;



import com.example.restapi.compte.Compte;

import javax.persistence.*;
import java.util.List;

@Entity
public class Agence {
    @Id
    private String code;
    private String nom;
    private String adresse;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "agence")
    private List<Compte> comptes;


    public Agence(){

    }
    public Agence(String code, String nom, String adresse, String telephone) {
        this.code = code;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
