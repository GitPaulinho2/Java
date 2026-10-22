package Exercicios;

import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {

        /* Scanner sc = new Scanner(System.in);

        // criar array
        String[] nomes = new String[3];

        // CADASTRAR

        System.out.println("=== CADASTRO DE NOMES ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        // LISTAR

        System.out.println("\nLista atual:");
        listar(nomes);

        // ALTERAR

        System.out.print("\nDigite a posição para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.print("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após alteração:");
        listar(nomes);

        // REMOVER

        System.out.print("\nDigite a posição para remover: ");
        int posRemover = sc.nextInt();

        if (posRemover >= 0 && posRemover < nomes.length) {

            // deslocar elementos
            for (int i = posRemover; i < nomes.length - 1; i++) {
                nomes[i] = nomes[i + 1];
            }

            nomes[nomes.length - 1] = null;
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após remoção:");
        listar(nomes);

        sc.close();
    }

    // método para listar
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        } */

//////////////////////////////////////////////////////////////////////////////////////////

        /*Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];

        int qtd = 0; // controla quantos cadastros existem
        int opcao;

        while (true) {
            System.out.println("\n=== CADASTRO PESSOA (String + int) ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar (por nome)");
            System.out.println("4 - Alterar (por nome)");
            System.out.println("5 - Remover (por nome)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1: // CADASTRAR
                    if (qtd == nomes.length) {//VERIFICA SE A LISTA ESTÁ CHEIA
                        System.out.println("Lista cheia! Não é possível cadastrar.");
                        break;
                    }

                    System.out.print("Digite o nome: ");
                    nomes[qtd] = sc.nextLine();

                    System.out.print("Digite a idade: ");
                    idades[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("Cadastrado com sucesso!");
                    break;

                case 2: // LISTAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.println("\nDados cadastrados:");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println(i + " - " + nomes[i] + " - " + idades[i] + " anos");
                    }
                    break;

                case 3: // PESQUISAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();

                    int posBusca = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(busca)) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca == -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        System.out.println("Encontrado: " + nomes[posBusca] + " - " + idades[posBusca] + " anos");
                    }
                    break;

                case 4: // ALTERAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlt = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlt = i;
                            break;
                        }
                    }

                    if (posAlt == -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova idade: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();

                        nomes[posAlt] = novoNome;
                        idades[posAlt] = novaIdade;

                        System.out.println("Alterado com sucesso!");
                    }
                    break;

                case 5: // REMOVER (DESLOCANDO)
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = sc.nextLine();

                    int posRem = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            posRem = i;
                            break;
                        }
                    }

                    if (posRem == -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        // desloca para a esquerda para não deixar buraco
                        for (int i = posRem; i < qtd - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            idades[i] = idades[i + 1];
                        }

                        // limpa última posição (opcional)
                        nomes[qtd - 1] = null;
                        idades[qtd - 1] = 0;

                        qtd--;
                        System.out.println("Removido com sucesso!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();*/


            Scanner sc = new Scanner(System.in);

            int qtdd = 0; 
            int opcao;
            String[] nomes = new String[10];

            do{
                System.out.println("=== Menu Interativo ===");
                System.out.println("1. Cadastrar");
                System.out.println("2. Listar");
                System.out.println("3. Alterar");
                System.out.println("4. Remover");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){
                    case 1:
                        if(qtdd == nomes.length){
                            System.out.println("Lista cheia! Não é possível cadastrar.");
                        }

                        System.out.println("Digite um nome: ");
                        nomes[qtdd] = sc.nextLine();
                        qtdd++;
                        System.out.println("Cadastrado com sucesso!");
                        break;
                    case 2:
                        if(qtdd == 0){
                            System.out.println("Nenhum cadastro.");
                        }

                        System.out.println("Dados Cadastrados!");
                        for(int i = 0; i<qtdd; i++){
                            System.out.println(i + " - " + nomes[i]);
                        }
                        break;
                    case 3:
                        if(qtdd == 0){
                            System.out.println("Nenhum cadastro.");
                            break;
                        }

                        System.out.print("Digite a posição para alterar: ");
                        int posAlterar = sc.nextInt();
                        sc.nextLine();
                        if(posAlterar >= 0 && posAlterar < qtdd){
                            System.out.println("Digite o novo nome: ");
                            nomes[posAlterar] = sc.nextLine();

                            System.out.println("Alterado com sucesso!");
                        }
                        break;
                    case 4:
                        if(qtdd == 0){
                            System.out.println("Nenhum cadastro.");
                            break;
                        }

                        System.out.print("Digite a posição para remover: ");
                        int posRemover = sc.nextInt();
                        sc.nextLine();
                        if(posRemover >= 0 && posRemover < qtdd){
                            for(int i = posRemover; i < qtdd - 1; i++){
                                nomes[i] = nomes[i + 1];
                            }
                            nomes[qtdd - 1] = null;
                            qtdd--;
                        }
                        System.out.println("Removido com sucesso!");
                        break;
                    case 5:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");

                }
            }while (opcao != 5);
            sc.close();
    }
}