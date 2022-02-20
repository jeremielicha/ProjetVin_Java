/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetiers;


public class Vin
{
    private String nomVin;
    private int millesimeVin;
    private Cepage leCepage;
    private Couleur laCouleur;
    private double prixDuVin;
    
    // Constructeur
    public Vin(String unNom, int unMillesime, Cepage unCepage, Couleur uneCouleur,double unPrix)
    {
        nomVin = unNom;
        millesimeVin = unMillesime;
        leCepage = unCepage;
        laCouleur = uneCouleur;
        prixDuVin = unPrix;
    }

    public String getNomVin() {
        return nomVin;
    }

    public void setNomVin(String nomVin) {
        this.nomVin = nomVin;
    }

    public int getMillesimeVin() {
        return millesimeVin;
    }

    public void setMillesimeVin(int millesimeVin) {
        this.millesimeVin = millesimeVin;
    }

    public Cepage getLeCepage() {
        return leCepage;
    }

    public void setLeCepage(Cepage leCepage) {
        this.leCepage = leCepage;
    }

    public Couleur getLaCouleur() {
        return laCouleur;
    }

    public void setLaCouleur(Couleur laCouleur) {
        this.laCouleur = laCouleur;
    }

    public double getPrixDuVin() {
        return prixDuVin;
    }

    public void setPrixDuVin(double prixDuVin) {
        this.prixDuVin = prixDuVin;
    }
}
