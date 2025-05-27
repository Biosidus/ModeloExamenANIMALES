package modelos;

public class Animal {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private int vecesAlimentado;
    private int solomillosComidos;

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodos
    public void cumplirAños() {
        this.edad++;
        this.vecesAlimentado = 0;
    }

    public void alimentar(int refAlimento) {
        switch (refAlimento) {
            case 1 -> {//Lechuga
                this.peso -= 2;
                this.vecesAlimentado++;
            }
            case 2 -> { //Solomillo
                this.peso += 5;
                this.vecesAlimentado++;
                this.solomillosComidos++;
            }
            case 3 -> {//Balanceado
                this.peso++;
                this.vecesAlimentado++;
            }
            default -> {
            }
        }

    }
}
