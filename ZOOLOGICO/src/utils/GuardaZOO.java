package utils;

import java.util.Scanner;
import modelos.Animal;

public class GuardaZOO {

    Scanner sc = new Scanner(System.in);

    public void bienvenida() {
        System.out.println("Bienvenido al ZOOLOGICO!!!");
        System.out.println("A continuacion debera registrar 5 animales:");
    }

    public void registrarAnimales(Animal animales[]) {
        for (int i = 0; i < animales.length; i++) {
            Animal animalActual = new Animal();
            boolean listo = true;

            System.out.println("Ingrese el animal n° " + (i + 1));

            do {
                System.out.println("Nombre del animal:");
                String nombreIngresado = sc.next();
                if (nombreIngresado.length() > 3) {
                    animalActual.setNombre(nombreIngresado);
                    listo = true;
                } else {
                    System.out.println("El nombre del animal debe tener 4 caracteres minimo.");
                    System.out.println("Vuelva  a ingresarlo.");
                    listo = false;
                }
            } while (!listo);

            do {
                System.out.println("Especie del animal:");
                String especieIngresada = sc.next();
                if (especieIngresada.length() > 3) {
                    animalActual.setEspecie(especieIngresada);
                    listo = true;
                } else {
                    System.out.println("La especie del animal debe tener 4 caracteres minimo.");
                    System.out.println("Vuelva  a ingresarlo.");
                    listo = false;
                }
            } while (!listo);

            do {
                System.out.println("Edad del animal:");
                int edadIngresada = sc.nextInt();
                if (edadIngresada > 0) {
                    animalActual.setEdad(edadIngresada);
                    listo = true;
                } else {
                    System.out.println("El animal no puede tener 0 años.");
                    System.out.println("Vuelva  a ingresarlo.");
                    listo = false;
                }
            } while (!listo);

            do {
                System.out.println("Peso del animal:");
                double pesoIngresado = sc.nextDouble();
                if (pesoIngresado > 0) {
                    animalActual.setPeso(pesoIngresado);
                    listo = true;
                } else {
                    System.out.println("El animal no puede pesar 0 kg.");
                    System.out.println("Vuelva  a ingresarlo.");
                    listo = false;
                }
            } while (!listo);
        }
    }

    public void mostrarTodosLosAnimales(Animal animales[]) {
        for (int i = 0; i < animales.length; i++) {
            Animal animalActual = animales[i];
            System.out.println(animalActual.getNombre() + " - " + animalActual.getEspecie() + " - " + animalActual.getEdad());
        }
    }

    public void mostrarVecesAlimentados(Animal animales[]) {
        for (int i = 0; i < animales.length; i++) {
            Animal animalActual = animales[i];
            System.out.println("Animal: " + animalActual.getEspecie());
            System.out.println("Veces alimentado: " + animalActual.getVecesAlimentado());
        }
    }

    public void menuComida() {
        System.out.println("1 - Lechuga");
        System.out.println("2 - Solomillo");
        System.out.println("3 - Balanceado");
    }

    public void menuAnimales(Animal animales[]) {
        for (int i = 0; i < animales.length; i++) {
            Animal animalActual = animales[i];
            System.out.println((i + 1) + " - " + animalActual.getEspecie());
        }
    }

    public void mostrarMenu() {
        System.out.println("Elija una opcion del menu:");
        System.out.println("1 - Mostrar animales");
        System.out.println("2 - Mostrar veces alimentados");
        System.out.println("3 - Alimentar animales");
        System.out.println("4 - Cumplir años de animal");
        System.out.println("5 - SALIR");
    }

    public void usarMenu(int ingreso, Animal animales[]) {
        int opc = ingreso;
        int indice;
        Animal animalActual;

        switch (opc) {
            case 1://Mostrar Animales
                this.mostrarTodosLosAnimales(animales);
                break;
            case 2://Mostrar veces alimentados
                this.mostrarVecesAlimentados(animales);
                break;
            case 3:
                System.out.println("¿Que animal quiere alimentar?(por su indice)");
                this.menuAnimales(animales);
                indice = sc.nextInt() - 1;
                animalActual = animales[indice];
                int vecesAlimentado = animalActual.getVecesAlimentado();
                if (vecesAlimentado < 3) {
                    System.out.println("¿Con que lo va a alimentar?");
                    this.menuComida();
                    indice = sc.nextInt();
                    animalActual.alimentar(indice);
                } else {
                    System.out.println("El animal comio 3 veces, debe cumplir años para comer de nuevo.");
                }
                break;
            case 4:
                System.out.println("¿Que animal cumple años?(indique por su indice)");
                this.menuAnimales(animales);
                indice = sc.nextInt();
                animalActual = animales[indice];
                animalActual.cumplirAños();
                break;
            case 5:
                System.out.println("Gracias por usar el programa!");
                break;
            default:
                System.out.println("Son solo 5 opciones hermano, 1/2 pila.");
                break;

        }
    }
}
