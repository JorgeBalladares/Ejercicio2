package Ejercicio1;


import lombok.Data;
import lombok.Getter;

import java.io.FileReader;
import java.io.IOException;
@Getter
public class Principal {
    public static void main(String[] args) throws IOException {
    leerFichero l = new leerFichero();
    l.leer();
    }
}




