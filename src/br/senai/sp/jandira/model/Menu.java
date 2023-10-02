package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void executarMenu(){

        Scanner scanner = new Scanner(System.in);

        Player player = new Player();
        Enemy enemy = new Enemy();
        Battle battle = new Battle();
        Scenario scenario = new Scenario();
        Output output = new Output();

        boolean continuar = true;

        while (continuar){
            System.out.println("---------------------------------------");
            System.out.println("|    Seja Bem-Vindo(a) ao FightGame    |");
            System.out.println("---------------------------------------");
            System.out.print("Digite uma opção para seguirmos: \n" +
                    "1- Cadastrar Player\n" +
                    "2- Cadastrar Enemy\n" +
                    "3- Battle\n" +
                    "4- Sair\n"
            );
            System.out.println("_______________________________________");
            System.out.print("Opção: ");

            int optionUser = scanner.nextInt();

            switch (optionUser){
                case 1:
                    player.cadastrarPlayer();
                    output.exebirPlayer(player);
                break;
                case 2:
                    enemy.cadastrarEnemy();
                    output.exebirEnemy(enemy);
                break;
                case 3:
                    battle.selecionarBattle = scenario.selecionarScenario();
                    battle.startBattle(player, enemy);
                    player.setVida(100);
                    enemy.setVida(100);
                break;
                case 4:
                    continuar = false;
                break;
            }
        }
    }
}
