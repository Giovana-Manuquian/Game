package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Scenario {
    Scanner scanner = new Scanner(System.in);
    public String selecionarScenario(){

        System.out.println("Escolha o Cenário: ");
        System.out.println("1- Carapicuíba\n" +
                "2- Itapevi\n" +
                "3- Arabia"
                );

        int optionScenario = scanner.nextInt();

        String scenario = "Senai - Osasco";

        switch (optionScenario){
            case 1:
                scenario = "Carapicuíba";
                break;
            case 2:
                scenario = "Itapevi";
                break;
            case 3:
                scenario = "Arabia";
                break;
        }
        return scenario;
    }

}
