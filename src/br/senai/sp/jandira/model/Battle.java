package br.senai.sp.jandira.model;

import br.senai.sp.jandira.model.Enemy;
import br.senai.sp.jandira.model.Player;

import java.util.Scanner;

public class Battle {
    String selecionarBattle;

    Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy) {
        boolean continuar = true;

        while (true) {
            int lifePlayer = player.getVida();
            int lifeEnemy = enemy.getVida();

            if (lifeEnemy <= 0) {
                System.out.println("O player " + player.getNome() + " é o vencedor!");
                break;
            } else if (lifePlayer <= 0) {
                System.out.println("O enemy " + enemy.getNome() + " é o vencedor!");
                break;
            }

            System.out.println("Atacar Player [ V ] " + player.getNome() + " Life: " + lifePlayer);
            System.out.println("Atacar Enemy [ A ] " + enemy.getNome() + " Life: " + lifeEnemy);

            String ataque = scanner.nextLine();

            if (ataque.equalsIgnoreCase("V")) {
                System.out.println("O Player atacou");

                int danoPlayer = ((int) (Math.random() * 20) + 1);


                System.out.println("Digite um número de [1 a 5] para defesa: ");
                int defesaEnemy = scanner.nextInt();
                scanner.nextLine();

                int defesaRandom = ((int) (Math.random() * 5) + 1);

                if (defesaEnemy == defesaRandom) {
                    System.out.println("O Enemy se defendeu com sucesso!");

                    int defesaRandomEnemy = ((int) (Math.random() * 20) + 1);

                    if (defesaRandomEnemy > danoPlayer) {
                        System.out.println("Bloqueou 100%");
                    } else {
                        danoPlayer -= defesaRandomEnemy;
                        enemy.subtrairVida(danoPlayer);
                    }

                } else {
                    System.out.println("Errou a defesa ...");
                    enemy.subtrairVida(danoPlayer);
                }

                System.out.println("O dano gerado foi de: " + danoPlayer);

            } else if (ataque.equalsIgnoreCase("A")) {
                System.out.println("O Enemy atacou");

                int danoEnemy = ((int) (Math.random() * 20) + 1);
                System.out.println("O dano gerado foi de: " + danoEnemy);


                System.out.println("Digite um número de [1 a 5] para defesa: ");
                int defesaPlayer = scanner.nextInt();
                scanner.nextLine();

                int defesaRandom = ((int) (Math.random() * 5) + 1);

                if (defesaPlayer == defesaRandom) {
                    System.out.println("O Player se defendeu com sucesso!");

                    int defesaRandomPlayer = ((int) (Math.random() * 20) + 1);

                    if (defesaRandomPlayer > danoEnemy) {
                        System.out.println("Bloqueou 100%");
                    } else {
                        danoEnemy -= defesaRandomPlayer;
                        player.subtrairVida(danoEnemy);
                    }

                } else {
                    System.out.println("Errou a defesa ...");
                    player.subtrairVida(danoEnemy);
                }


            } else {
                System.out.println("Digite uma tecla válida");
            }

        }
    }
}
