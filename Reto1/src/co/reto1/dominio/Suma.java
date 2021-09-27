package co.reto1.dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Suma {
    private List<Double> numeros = new ArrayList<>();
    private static final int AGREGAR = 0;
    private static final int SUMAR = 1;

    public double sumar(){
        double suma = 0;
        boolean ciclo = true;
        do{
            try{
                Double numero = Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese un numero: ", "Sumar", JOptionPane.QUESTION_MESSAGE));
                numeros.add(numero);
            }
            catch(NumberFormatException error){
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido.","Sumar", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (this.numeros.size() < 2){
                ciclo = true;
            }
            else{
                int opcion = JOptionPane.showOptionDialog(null, "¿Desea agregar otro número?", "Sumar", 0, JOptionPane.INFORMATION_MESSAGE, null, Arrays.asList("Agregar", "Sumar").toArray(), null);
                switch (opcion){
                    case AGREGAR:{
                        ciclo = true;
                        break;
                    }
                    case SUMAR:{
                        ciclo = false;
                        break;
                    }
                    case JOptionPane.CLOSED_OPTION:{
                        System.exit(0);
                    }
                }
            }
        }while(ciclo);
        for (double num : this.numeros) {
            suma += num;
        }
        numeros.clear();
        return suma;
    }
}
