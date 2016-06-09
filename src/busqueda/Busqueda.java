package busqueda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Busqueda {

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        //JPanel panel1 = new JPanel();
        JTextField numElArray = new JTextField(5);
        JTextField digito = new JTextField(5);
 
        panel.add(new JLabel("Numero elementos Array:"));
        panel.add(numElArray);
     
        panel.add(new JLabel("Digito:"));
        panel.add(digito);
      
  
        int[] numeros = new int[Integer.parseInt(numElArray.getText())];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, Integer.parseInt(digito.getText()), 0, numeros.length - 1);
        System.out.println("El indice del valor '450' es: " + indice);
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
