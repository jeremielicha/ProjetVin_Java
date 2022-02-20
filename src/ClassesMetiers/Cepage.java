/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesMetiers;


public class Cepage
{
    private String nomCepage;
    
    // Constructeur
    public Cepage(String unNom)
    {
        nomCepage = unNom;
    }    

    public String getNomCepage() {
        return nomCepage;
    }

    public void setNomCepage(String nomCepage) {
        this.nomCepage = nomCepage;
    }
}
