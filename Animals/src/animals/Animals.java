/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author thejo
 */
public class Animals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constantes
        final int MAX_ANIMALS = 10000;
        // Variables
        List<quatrePotes> llistaAnimals = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < MAX_ANIMALS; i++) {
            int numAleatori = random.nextInt(4) + 1;

            switch (numAleatori) {
                case 1:
                    llistaAnimals.add(i, new quatrePotes(TIPUS.GOS));
                    break;
                case 2:
                    llistaAnimals.add(i, new quatrePotes(TIPUS.ELEFANT));
                    break;
                case 3:
                    llistaAnimals.add(i, new quatrePotes(TIPUS.GAT));
                    break;
                case 4:
                    llistaAnimals.add(i, new quatrePotes(TIPUS.LLEO));
                    break;
            }
        }
        for (quatrePotes animal : llistaAnimals) {
            System.out.println(animal);
        }
        
        Map<TIPUS, Integer> qtAnimals = new HashMap<>();
        for (quatrePotes animal : llistaAnimals) {
            TIPUS tipo = animal.getTipus(); // Obtener el tipo de animal
            qtAnimals.put(tipo, qtAnimals.getOrDefault(tipo, 0) + 1); // Contar
        }

        // Imprimir resultados
        for (Map.Entry<TIPUS, Integer> entry : qtAnimals.entrySet()) {
            System.out.println("Tipus d'animal: " + entry.getKey() + " , quantitat: " + entry.getValue());
        }
    }

}
