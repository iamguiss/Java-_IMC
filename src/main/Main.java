package main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "Hello World!\nhgh" , "" , -1 );    
        //String x = JOptionPane.showInputDialog(null,"Digite um valor");
        //int valor = Integer.parseInt(x);
        //double valor2 =Double.parseDouble(x);
        //JOptionPane.showMessageDialog(null,"O valor digitado foi " + x );
        String Nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        String Alt = JOptionPane.showInputDialog(null, "sua altura");
        double altura = Double.parseDouble(Alt);
        String peso = JOptionPane.showInputDialog(null, "Seu peso");
        double Peso = Double.parseDouble(peso);

        double imc = Peso / (altura * altura);

        if (imc <= 18.5) {
            JOptionPane.showMessageDialog(null, "Olá " + Nome + " você está com o imc de: " + String.format("%.1f", imc) + "\n Voce está atualmente na categoria: " + " Abaixo do Peso" + "\n Precisando comer mais pae ");
        } else if (imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Olá " + Nome + " você está com o imc de: " + String.format("%.1f", imc) + "\n Voce está atualmente na categoria: " + " Peso Normal" + "\n Manter a média pae ");
        } else if (imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Olá " + Nome + " você está com o imc de: " + String.format("%.1f", imc) + "\n Voce está atualmente na categoria: " + " Sobrepeso" + "\n Tá um pouco gordin, mas ta no peso ainda! ");
        } else if (imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Olá " + Nome + " você está com o imc de: " + String.format("%.1f", imc) + "\n Voce está atualmente na categoria: " + " Obsidade Leve" + "\n Ta gordin gostoso ainda KKKKKKKKKKKKKK");
        } else if (imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Olá " + Nome + " você está com o imc de: " + String.format("%.1f", imc) + "\n Voce está atualmente na categoria: " + " Obsidade Moderada" + "\n Só no Mc Donals em lindão ");
        } else if (imc > 39.9) {
            JOptionPane.showMessageDialog(null, "Olá " + Nome + " você está com o imc de: " + String.format("%.1f", imc) + "\n Voce está atualmente na categoria: " + " Obsidade Mórbida" + "\n Tá raul em KKKKKKKKKKK");
        }

    }

}
