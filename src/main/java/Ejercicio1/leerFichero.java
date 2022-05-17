package Ejercicio1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class leerFichero {
    public ArrayList<Persona> leer() throws IOException {
        BufferedReader lecturaCadena = new BufferedReader(new FileReader("C:\\Users\\jorge.balladares\\IdeaProjects\\Ejercicio1\\src\\main\\java\\Ejercicio1\\FicheroEjercicio1.txt"));
        String linea = lecturaCadena.readLine();
        Persona p;
        ArrayList <Persona> datosPersona = new ArrayList<>();
        String[] cadena;

        while ((linea = lecturaCadena.readLine())!=null) {
            if(linea.equals("")){
                continue;
            }
            cadena = linea.split(":");

            if(cadena.length==3){
                //if (Integer.parseInt(cadena[2])<25){
                    p = new Persona(cadena[0],cadena[1],Integer.parseInt(cadena[2]));
                    datosPersona.add(p);
                //}
            }
        }
        leerDatos(datosPersona);
        return datosPersona;
    }

    public void leerDatos(ArrayList<Persona> lista){
       /* for (int i = 0; i<lista.size(); i++ ){
           System.out.println("Nombre: "+ lista.get(i).getNombre() + ". Población: " + lista.get(i).getPoblacion()+ ". Edad:" + lista.get(i).getEdad());
        } */
        //lista.stream().forEach( p -> System.out.println("Nombre: " + p.nombre + ". Poblacion: " + p.poblacion + ". Edad: " + p.edad));
        lista.stream().filter(persona -> persona.edad<25).forEach( p -> System.out.println("Nombre: " + p.nombre + ". Poblacion: " + p.poblacion + ". Edad: " + p.edad));

    }
}

