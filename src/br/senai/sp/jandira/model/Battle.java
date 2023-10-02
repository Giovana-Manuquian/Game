package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Battle {
    String selecionarBattle;

    Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy){

        boolean continuar = true;

        while (true) {

            int lifePlayer = player.getVida();
            int lifeEnemy = enemy.getVida();

            if(lifeEnemy <= 0){
                System.out.println("O player " + player.getNome() + " é o vencedor!");
                break;
            } else if (lifePlayer <= 0) {
                System.out.println("O enemy " + enemy.getNome() + " é o vencedor!");
                break;
            }

            System.out.println("Atacar Player [ V ] " + player.getNome() + " Life: " + lifePlayer);
            System.out.println("Atacar Enemy [ A ] " + enemy.getNome() + " Life: " + lifeEnemy);

            String ataque = scanner.nextLine();

            if(ataque.equalsIgnoreCase("V")){
                System.out.println("O Player atacou");

                int danoPlayer = ((int) (Math.random() * 20) + 1);

                enemy.subtrairVida(danoPlayer);
                System.out.println("O dano gerado foi de: " + danoPlayer);

            } else if (ataque.equalsIgnoreCase("A")) {
                System.out.println("O Enemy atacou");

                int danoEnemy = ((int) (Math.random() * 20) + 1);
                player.subtrairVida(danoEnemy);
                System.out.println("O dano gerado foi de: " + danoEnemy);
            } else {
                System.out.println("Digite uma tecla válida");
            }
        }
    }
    public void reniciarVida(Player player, Enemy enemy){

    }
}
