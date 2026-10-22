package Exercicios;

import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // while inteiro
        /*int i = 1;

        while(i != 10){
            System.out.println("Pressione 10 para parar saporra ");
            i=sc.nextInt();
        }

        System.out.println("Você pressionou 10, o programa será encerrado");
        sc.close();*/

        // while string
        /*String resposta = "Sim";

        while(resposta.equalsIgnoreCase("Sim")){
            System.out.println("continuando");

            System.out.println("Deseja continuar o processo? (Sim ou Não)");
            resposta = sc.nextLine();
        }

        System.out.println("Encerrando o programa");
        sc.close();*/


        // while negativos e positivos
        /*int numero = 1;

        while(numero>0){
            System.out.println("Digite um numero positivo: ");
            numero = sc.nextInt();

            if(numero<0){
                System.out.println("Número negativo, encerrando o programa");
            } else if(numero == 0){
                System.out.println("Numero zero, encerrando o programa");
            }

        }
        sc.close();*/

        // while true 
        /*String nome = "";

        while(true){
            System.out.println("Digite o seu nome: ");
            nome = sc.nextLine();
           
            if (nome.equalsIgnoreCase("Anderson")){
                System.out.println("Nome correto, encerrando o programa");
                break;
            }else{
                System.out.println("Nome incorreto, tente novamente");
            }
        }
        System.out.println("Programa encerrado");
        sc.close();*/


            /*int op;

            do{
                System.out.println("1- Cadastrar");
                System.out.println("2- Listar");
                System.out.println("3- Remover");
                System.out.println("4- Sair");
                System.out.println("Digite a opção: ");
                op = sc.nextInt();

                switch(op){
                    case 1:
                        System.out.println("Cadastrar");
                        break;
                    case 2:
                        System.out.println("Listar");
                        break;
                    case 3:
                        System.out.println("Remover");
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            }while(op!=4);
            sc.close();*/
            
            /*
                for(int i = 10;i<=20;i++){
                    System.out.println("Numero "+i)
                }
            
            */

            /*for(int i = 20;i>=10;i--){
                
                System.out.println("Numero "+i);
            }*/

            /*for (int i = 1; i <= 51; i += 2) {
                System.out.println("Numeros Impares: " + i);
            }
            System.out.println();
            for (int i = 52; i <= 100; i += 2) {
                System.out.println("Numeros Pares: " + i);
            }*/

            /* for (int i = 1; i <= 10; i++) {
                System.out.println("\nTabuada do " + i + ":");
                for (int num = 1; num <= 10; num++) {
                    System.out.println(i+ " x " +num+ " = " +(i*num));
                }
            } */

            /* for (int n = 1; n <= 10; n++) {
                System.out.println("Digite um numero para a tabuada desejada: ");
                int operacao = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + " x " + operacao + " = " + (i * operacao));
                }
            }
            sc.close(); */

            int op;
            int numero;

            do{
                System.out.println("1- Calcular Tabuada");
                System.out.println("2- Realizar Contagem Regressiva");
                System.out.println("0- Sair");
                System.out.println("Escolha a opção desejada: ");
                op = sc.nextInt();


                switch (op) {
                    case 1:
                                System.out.println("Digite um numero para a tabuada");
                                numero = sc.nextInt();
                                for(int j = 1;j<=10;j++){
                                    System.out.println(j+ " x " +numero+ " = " +(j*numero));
                                }
                                break;
                            
                    case 2:
                            System.out.println("Bote um numero ai para fazer uma contagem: ");
                            numero=sc.nextInt();

                            for(int s = numero; s>=0;s--){
                                System.out.println(s);
                            }
                            break;
                    default:
                        System.out.println("cabo");
                        break;
                }
            }while(op!=0);
            sc.close();
        }
}
