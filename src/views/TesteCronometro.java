package views;

import model.Cronometro;

import java.util.Scanner;

public class TesteCronometro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cronometro cronometro = new Cronometro();

        System.out.println("Digite os segundos:");
        cronometro.segundos = ler.nextInt();


        System.out.println(cronometro.mostarDados());

    }
}
