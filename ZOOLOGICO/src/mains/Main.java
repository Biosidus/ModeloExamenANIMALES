package mains;

import java.util.Scanner;
import modelos.Animal;
import utils.GuardaZOO;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuardaZOO guarda = new GuardaZOO();

        Animal animales[] = new Animal[1];

        guarda.bienvenida();
        guarda.registrarAnimales(animales);

        int seleccion;

        do {
            guarda.mostrarMenu();
            seleccion = sc.nextInt();
            guarda.usarMenu(seleccion, animales);
        } while (seleccion != 5);
    }

}
