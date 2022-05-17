package Ejercicio1;

public class Persona {
     String nombre;
     String poblacion;
     int edad;

    public Persona(String nuevoNom, String nuevoPob, int nuevoEdad) {
        if(nuevoNom.equals("")){
            this.nombre = "Desconocido";
        }
        else{
            this.nombre = nuevoNom;
        }
        if(nuevoPob.equals("")){
            this.poblacion = "Desconocido";
        }
        else{
            this.poblacion = nuevoPob;
        }
        this.edad = nuevoEdad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public int getEdad() {
        return edad;
    }


}
