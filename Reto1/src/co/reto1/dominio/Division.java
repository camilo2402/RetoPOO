package co.reto1.dominio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Division {
    private double division;
    private List<Double> numeros;
    private static final int AGREGAR = 0;
    private static final int DIVIDIR = 1;

    public double dividir() {
        boolean ciclo = true;
        numeros = new ArrayList<>();
        do {
            try{
                double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero: ", "Dividir", JOptionPane.INFORMATION_MESSAGE));
                if (this.numeros.size() >= 1 && num == 0){
                    JOptionPane.showMessageDialog(null, "Ingrese un numero válido.","Dividir", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                this.numeros.add(num);
            }
            catch (NumberFormatException error){
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido.", "Dividir", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (this.numeros.size() < 2) {
                ciclo = true;
            }
            else {
                int opcion = JOptionPane.showOptionDialog(null, "¿Desea agregar otro número?", "Dividir", 0, JOptionPane.INFORMATION_MESSAGE, null, Arrays.asList("Agregar", "Dividir").toArray(), null);
                switch (opcion){
                    case AGREGAR: {
                        ciclo = true;
                        break;
                    }
                    case DIVIDIR: {
                        ciclo = false;
                        break;
                    }
                    case JOptionPane.CLOSED_OPTION: {
                        System.exit(0);
                    }
                }
            }
        } while (ciclo);
        int contador = 1;
        for (double num : this.numeros) {
            if (contador==1){
                division = num;
            }
            else {
                division /= num;
            }
            contador++;
        }
        return division;
    }
}
