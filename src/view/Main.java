package view;

import controller.Controller;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Controller Control = new Controller();

       String auxA ;
       String auxB ;
       String auxC ;
       JOptionPane.showMessageDialog(null,"Este programa calcula el numero mayor y el numero menor");
       auxA = JOptionPane.showInputDialog(null,"Por favor digite el primer numero");
       auxB = JOptionPane.showInputDialog(null,"Por favor digite el segundo numero");
       auxC = JOptionPane.showInputDialog(null,"Por favor digite el tercer numero");
      JOptionPane.showMessageDialog(null,"El numero mayor es " +Control.Metod(auxA ,auxB ,auxC)+"\nEl numero menor es "+Control.MetodDos(auxA,auxB,auxC));


    }
}