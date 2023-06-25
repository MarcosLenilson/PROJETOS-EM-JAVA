import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

public class Jogo{
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int opcao;
        int escolha_computador;
        int escolha_usuario;

        show.println("Olá! Qual o seu nome? ");
        String nome = scan.nextLine();
        show.println("Prazer em conhece-lo " + nome + "!");
        show.println(nome + ", você quer jogar comigo?");
        show.println("\nInforme o numero da sua opção. \n1 -> Sim \n2 -> Não");
        opcao = scan.nextInt();

        if(opcao == 2){
            show.println("Que pena! mas tudo bem, fica para a próxima!");
        }
        else if (opcao == 1){
            show.println("Ok! o jogo é assim...");
            show.println("Eu vou escolher um número de 0 a 10...");
            show.println("Mas não vou falar pra você qual é...");
            show.println("Se você conseguir adivinhar qual é o número...");
            show.println("Você será o vencedor!");
            show.println("\nInforme o numero da sua opção. \n1 -> Sim \n2 -> Não");
            opcao = scan.nextInt();
            
            escolha_computador = gerador.nextInt(11);

            show.println("\nPREPARADO ?? \n1 -> Sim \n2 -> Não");
            opcao = scan.nextInt();

            show.println("Ok," + nome + ". Eu já escolhi!");
            show.println("Agora tente adivinhar!");

            do{
                escolha_usuario = scan.nextInt();
                if(escolha_usuario != escolha_computador){
                    show.println("Resposta errada!");
                }else{
                    show.println("Parabéns! Você acertou!");
                }
            }while(escolha_computador != escolha_usuario);

        }
    }
}