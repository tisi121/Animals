/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;


/**
 *
 * @author thejo
 */
public class quatrePotes{
    private int idAnimal=1000;
    private TIPUS tipus;
    private static int qt=0;

    public quatrePotes(TIPUS tipus) {
        qt++;
        this.idAnimal = idAnimal*qt;
        this.tipus = tipus;
    }

    //Setters
    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setTipus(TIPUS tipus) {
        this.tipus = tipus;
    }

    //Getters
    public int getIdAnimal() {
        return idAnimal;
    }

    public TIPUS getTipus() {
        return tipus;
    }
    
    //Mètodes

    @Override
    public String toString() {
        return "quatrePotes{" + "idAnimal=" + idAnimal + ", tipus=" + tipus + '}';
    }
    
}
