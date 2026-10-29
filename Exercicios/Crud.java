package Exercicios;

import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * // criar array
         * String[] nomes = new String[3];
         * 
         * // CADASTRAR
         * 
         * System.out.println("=== CADASTRO DE NOMES ===");
         * for (int i = 0; i < nomes.length; i++) {
         * System.out.print("Digite um nome: ");
         * nomes[i] = sc.nextLine();
         * }
         * 
         * // LISTAR
         * 
         * System.out.println("\nLista atual:");
         * listar(nomes);
         * 
         * // ALTERAR
         * 
         * System.out.print("\nDigite a posição para alterar: ");
         * int posAlterar = sc.nextInt();
         * sc.nextLine(); // limpar buffer
         * 
         * if (posAlterar >= 0 && posAlterar < nomes.length) {
         * System.out.print("Digite o novo nome: ");
         * nomes[posAlterar] = sc.nextLine();
         * } else {
         * System.out.println("Posição inválida!");
         * }
         * 
         * System.out.println("\nLista após alteração:");
         * listar(nomes);
         * 
         * // REMOVER
         * 
         * System.out.print("\nDigite a posição para remover: ");
         * int posRemover = sc.nextInt();
         * 
         * if (posRemover >= 0 && posRemover < nomes.length) {
         * 
         * // deslocar elementos
         * for (int i = posRemover; i < nomes.length - 1; i++) {
         * nomes[i] = nomes[i + 1];
         * }
         * 
         * nomes[nomes.length - 1] = null;
         * } else {
         * System.out.println("Posição inválida!");
         * }
         * 
         * System.out.println("\nLista após remoção:");
         * listar(nomes);
         * 
         * sc.close();
         * }
         * 
         * // método para listar
         * public static void listar(String[] array) {
         * for (int i = 0; i < array.length; i++) {
         * System.out.println(i + " - " + array[i]);
         * }
         */

        /////////////////////////////////////////////////////////////////////////////////////////

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * String[] nomes = new String[3];
         * int[] idades = new int[3];
         * 
         * int qtd = 0; // controla quantos cadastros existem
         * int opcao;
         * 
         * while (true) {
         * System.out.println("\n=== CADASTRO PESSOA (String + int) ===");
         * System.out.println("1 - Cadastrar");
         * System.out.println("2 - Listar");
         * System.out.println("3 - Pesquisar (por nome)");
         * System.out.println("4 - Alterar (por nome)");
         * System.out.println("5 - Remover (por nome)");
         * System.out.println("0 - Sair");
         * System.out.print("Opção: ");
         * opcao = sc.nextInt();
         * sc.nextLine(); // limpar buffer
         * 
         * if (opcao == 0) {
         * System.out.println("Saindo...");
         * break;
         * }
         * 
         * switch (opcao) {
         * case 1: // CADASTRAR
         * if (qtd == nomes.length) {//VERIFICA SE A LISTA ESTÁ CHEIA
         * System.out.println("Lista cheia! Não é possível cadastrar.");
         * break;
         * }
         * 
         * System.out.print("Digite o nome: ");
         * nomes[qtd] = sc.nextLine();
         * 
         * System.out.print("Digite a idade: ");
         * idades[qtd] = sc.nextInt();
         * sc.nextLine();
         * 
         * qtd++;
         * System.out.println("Cadastrado com sucesso!");
         * break;
         * 
         * case 2: // LISTAR
         * if (qtd == 0) {
         * System.out.println("Nenhum cadastro.");
         * break;
         * }
         * 
         * System.out.println("\nDados cadastrados:");
         * for (int i = 0; i < qtd; i++) {
         * System.out.println(i + " - " + nomes[i] + " - " + idades[i] + " anos");
         * }
         * break;
         * 
         * case 3: // PESQUISAR
         * if (qtd == 0) {
         * System.out.println("Nenhum cadastro.");
         * break;
         * }
         * 
         * System.out.print("Digite o nome para pesquisar: ");
         * String busca = sc.nextLine();
         * 
         * int posBusca = -1;
         * for (int i = 0; i < qtd; i++) {
         * if (nomes[i].equalsIgnoreCase(busca)) {
         * posBusca = i;
         * break;
         * }
         * }
         * 
         * if (posBusca == -1) {
         * System.out.println("Pessoa não encontrada.");
         * } else {
         * System.out.println("Encontrado: " + nomes[posBusca] + " - " +
         * idades[posBusca] + " anos");
         * }
         * break;
         * 
         * case 4: // ALTERAR
         * if (qtd == 0) {
         * System.out.println("Nenhum cadastro.");
         * break;
         * }
         * 
         * System.out.print("Digite o nome para alterar: ");
         * String nomeAlterar = sc.nextLine();
         * 
         * int posAlt = -1;
         * for (int i = 0; i < qtd; i++) {
         * if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
         * posAlt = i;
         * break;
         * }
         * }
         * 
         * if (posAlt == -1) {
         * System.out.println("Pessoa não encontrada.");
         * } else {
         * System.out.print("Novo nome: ");
         * String novoNome = sc.nextLine();
         * 
         * System.out.print("Nova idade: ");
         * int novaIdade = sc.nextInt();
         * sc.nextLine();
         * 
         * nomes[posAlt] = novoNome;
         * idades[posAlt] = novaIdade;
         * 
         * System.out.println("Alterado com sucesso!");
         * }
         * break;
         * 
         * case 5: // REMOVER (DESLOCANDO)
         * if (qtd == 0) {
         * System.out.println("Nenhum cadastro.");
         * break;
         * }
         * 
         * System.out.print("Digite o nome para remover: ");
         * String nomeRemover = sc.nextLine();
         * 
         * int posRem = -1;
         * for (int i = 0; i < qtd; i++) {
         * if (nomes[i].equalsIgnoreCase(nomeRemover)) {
         * posRem = i;
         * break;
         * }
         * }
         * 
         * if (posRem == -1) {
         * System.out.println("Pessoa não encontrada.");
         * } else {
         * // desloca para a esquerda para não deixar buraco
         * for (int i = posRem; i < qtd - 1; i++) {
         * nomes[i] = nomes[i + 1];
         * idades[i] = idades[i + 1];
         * }
         * 
         * // limpa última posição (opcional)
         * nomes[qtd - 1] = null;
         * idades[qtd - 1] = 0;
         * 
         * qtd--;
         * System.out.println("Removido com sucesso!");
         * }
         * break;
         * 
         * default:
         * System.out.println("Opção inválida!");
         * }
         * }
         * 
         * sc.close();
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int qtdd = 0;
         * int opcao;
         * String[] nomes = new String[10];
         * 
         * do{
         * System.out.println("=== Menu Interativo ===");
         * System.out.println("1. Cadastrar");
         * System.out.println("2. Listar");
         * System.out.println("3. Alterar");
         * System.out.println("4. Remover");
         * System.out.println("5. Sair");
         * System.out.print("Escolha uma opção: ");
         * opcao = sc.nextInt();
         * sc.nextLine();
         * 
         * switch (opcao){
         * case 1:
         * if(qtdd == nomes.length){
         * System.out.println("Lista cheia! Não é possível cadastrar.");
         * }
         * 
         * System.out.println("Digite um nome: ");
         * nomes[qtdd] = sc.nextLine();
         * qtdd++;
         * System.out.println("Cadastrado com sucesso!");
         * break;
         * case 2:
         * if(qtdd == 0){
         * System.out.println("Nenhum cadastro.");
         * }
         * 
         * System.out.println("Dados Cadastrados!");
         * for(int i = 0; i<qtdd; i++){
         * System.out.println(i + " - " + nomes[i]);
         * }
         * break;
         * case 3:
         * if(qtdd == 0){
         * System.out.println("Nenhum cadastro.");
         * break;
         * }
         * 
         * System.out.print("Digite a posição para alterar: ");
         * int posAlterar = sc.nextInt();
         * sc.nextLine();
         * if(posAlterar >= 0 && posAlterar < qtdd){
         * System.out.println("Digite o novo nome: ");
         * nomes[posAlterar] = sc.nextLine();
         * 
         * System.out.println("Alterado com sucesso!");
         * }
         * break;
         * case 4:
         * if(qtdd == 0){
         * System.out.println("Nenhum cadastro.");
         * break;
         * }
         * 
         * System.out.print("Digite a posição para remover: ");
         * int posRemover = sc.nextInt();
         * sc.nextLine();
         * if(posRemover >= 0 && posRemover < qtdd){
         * for(int i = posRemover; i < qtdd - 1; i++){
         * nomes[i] = nomes[i + 1];
         * }
         * nomes[qtdd - 1] = null;
         * qtdd--;
         * }
         * System.out.println("Removido com sucesso!");
         * break;
         * case 5:
         * System.out.println("Saindo do programa...");
         * break;
         * default:
         * System.out.println("Opção inválida! Tente novamente.");
         * 
         * }
         * }while (opcao != 5);
         * sc.close();
         */

        /*Scanner sc = new Scanner(System.in);

        int opcao;
        String[] produtos = new String[10];
        int[] estoques = new int[10];
        int qtd = 0;

        do {
            System.out.println("===/ Menu Insano!! /===");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Alterar");
            System.out.println("4- Pesquisar");
            System.out.println("5- Remover");
            System.out.println("6- Sair");
            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 6){
                System.out.println("Saindo do programa...");
                break;
            }
            switch (opcao) {
                case 1:
                    if (qtd == produtos.length) {
                        System.out.println("Lista cheia, Nenhum produto cadastrado!");
                        break;
                    }

                    System.out.println("Digite o nome do produto: ");
                    produtos[qtd] = sc.nextLine();

                    System.out.println("Digite a quantidade em estoque: ");
                    estoques[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("Produto cadastrado!");
                    break;
                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto Cadastrado");
                        break;
                    }

                    System.out.println("Produtos Cadastrados: ");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println("Indice: " + i + " -- " + "Produto: " + produtos[i] + " -- "
                                + "Quantidade Estoque: " + estoques[i]);
                    }
                    break;
                case 3:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado");
                        break;
                    }

                    System.out.println("Digite o produto que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlterar = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlterar = i;
                            break;
                        }
                    }

                    if (posAlterar == -1) {
                        System.out.println("Produto não foi encontrado");
                        break;
                    } else {
                        System.out.println("Digite o novo produto: ");
                        String novoProduto = sc.nextLine();

                        System.out.println("Digite a quantidade nova de estoque: ");
                        int novoEstoque = sc.nextInt();
                        sc.nextLine();

                        produtos[posAlterar] = novoProduto;
                        estoques[posAlterar] = novoEstoque;

                        System.out.println("Produto atualizado com sucesso!");
                    }
                    break;
                case 4:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado");
                        break;
                    }
                    
                    System.out.println("Digite o produto que deseja pesquisar:");
                    String nomePesquisar = sc.nextLine();

                    int posPesquisa = -1;
                    for (int i = 0; i<qtd;i++){
                        if(produtos[i].equalsIgnoreCase(nomePesquisar)){
                            posPesquisa = i;
                            break;
                        }
                    }

                        if(posPesquisa == -1){
                            System.out.println("Produto não encontrado");
                            break;
                        }else{
                            System.out.println("Produto encontrado: "+produtos[posPesquisa]+ " -- " + "Quantidade em estoque: "+estoques[posPesquisa]);
                            
                        }
                    break;
                case 5:
                    if (qtd == 0){
                        System.out.println("nenhum produto cadastrado");
                        break;
                    }

                    System.out.println("Digite o produto que deseja remover: ");
                    String nomeRemover = sc.nextLine();

                    int posRemover = -1;
                    for(int i = 0;i<qtd;i++){
                        if(produtos[i].equalsIgnoreCase(nomeRemover)){
                            posRemover = i;
                            break;
                        }
                    }

                    if(posRemover == -1){
                        System.out.println("Produto não encontrado");
                        break;
                    }

                    for(int i = posRemover; i<qtd-1;i++){
                        produtos[i] = produtos[i+1];
                        estoques[i] = estoques[i+1];
                    }
                    qtd--;
                    System.out.println("Produto removido com sucesso!");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (opcao != 6);
        sc.close();*/
        Scanner sc = new Scanner(System.in);

        // final int é para definir um valor imutavel (que não se altera) para uma
        // variavel
        final int MaxOnibus = 4;
        final int MaxReservas = 20;

        // frota onibus
        int qtdOnibus = 0;
        int[] numerosOnibus = new int[MaxOnibus];
        int[] assentosDisponiveis = new int[MaxReservas];

        // reservas
        String[] nomesPassageiros = new String[MaxReservas];
        int[] onibusReserva = new int[MaxReservas];
        int totalReservas = 0;

        boolean frotaRegistrada = false;
        boolean assentosRegistrados = false;

        int op;
        do {
            System.out.println("=== Onibus foda ===");
            System.out.println("1- Reservar Onibus");
            System.out.println("2- Registrar assentos disponiveis por onibus");
            System.out.println("3- Reservar Passagem");
            System.out.println("4- Consultar reservas por Onibus");
            System.out.println("5- Consultar reservas por Passageiro");
            System.out.println("6- Listar Onibus e Assentos");
            System.out.println("7- Sair");
            System.out.println("Escolha uma opção: ");

            // validação caso o usuario coloque algo que nao seja inteiro
            while (!sc.hasNextInt()) {
                System.out.println("Digite um numero valido: ");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    // solicita a quantidade de onibus ao usuario
                    System.out.print("Informe a quantidade de ônibus (máx. " + MaxOnibus + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Digite um numero valido: ");
                        sc.next(); //descarta a entrada que não era numero
                    }
                    qtdOnibus = sc.nextInt(); //// armazena a quantidade informada 
                    sc.nextLine();// limpa o buffer do teclado

                    // valida se a quantidade infomada está dentro dos intervalos permitido 1 a 20(o 20 no caso é a variavel definida no começo do codigo)
                    if (qtdOnibus < 1 || qtdOnibus > MaxOnibus) {
                        System.out.println("Quantidade inválida! Deve ser entre 1 e " + MaxOnibus + ".");
                        break; // encerra se for invalido
                    }

                    // laço para cadastrar a identificação de cada onibus
                    for (int i = 0; i < qtdOnibus; i++) {
                        boolean duplicado; // guarda o status para saber se o numero digitado ja existe
                        int numeroDigitado; // armazena temporariamente o numero digitado pelo usuario

                        // laço de repetição que exige uma nova digitação enquanto o número informado for repetido
                        do {
                            duplicado = false; // assume inicialmente que o numero não é duplicado
                            System.out.println("Número do onibus [" + (i + 1) + "]");
                            // le o numero do onibus atual e limpa o \n do buffer
                            numeroDigitado = sc.nextInt();
                            sc.nextLine();

                            // percorre apenas os onibus que ja foram cadastrados anteriormente de 0 ate i - 1
                            for (int j = 0; j < i; j++) {
                                // compara o numero recem digitado com os numeros armazenados no vetor
                                if (numerosOnibus[j] == numeroDigitado) {
                                    System.out.println("Já existe um onibus cadastrado com esse numero! Digite outro.");
                                    duplicado = true; // marca que o numero é repetido
                                    break;// interrompe o laço de verificação j
                                }
                            }
                        } while (duplicado); // se for duplicado, volta para o topo do "do" e pede o numero de novo
                        //salva o numero validado e unico na posição 'i' do vetor de onibus
                        numerosOnibus[i] = numeroDigitado;
                    }

                    // atualizações do estado do sistema após o cadastro bem sucedido:
                    frotaRegistrada = true; // marca que a frota de onibus foi cadastrada
                    assentosRegistrados = false; // força o usuario a cadastrar os assentos para esta nova frota
                    totalReservas = 0; // zera as reservas anteriores, pois a frota mudou
                    System.out.println("Frota registrada com sucesso!");
                    break;

                case 2:
                    // verifica se ja foi cadastrada alguma frota na opção 1
                    if(!frotaRegistrada){
                        System.out.println("Registre primeiro os onibus (opção 1)");
                        break;
                    }

                    // percorre todos os onibus previamente cadastrados
                    for (int i = 0;i<qtdOnibus;i++){
                        // exibe o numero do onibus atual armazenado na posição 'i'
                        System.out.println("Assento disponiveis para o onibus "+numerosOnibus[i]+": ");
                        // le a quantidade de assentos do onibus e salva na posição 'i' do vetor de assentos
                        assentosDisponiveis[i] = sc.nextInt();
                        sc.nextLine(); // limpa a quebra de linha (\n) do buffer do teclado
                    }

                    // marca a flag como 'true' para sinalizar que o sistema ja tem frota e assentos prontos
                    assentosRegistrados = true;
                    System.out.println("Assentos registrados com sucesso!");
                    break;
                case 3:
                    //validação de pre requisitos
                    /*verifica se as etapas 1(frota) e 2 (assentos) foram concluidas*/
                    if(!frotaRegistrada || !assentosRegistrados){
                        System.out.println("Registre frota e assentos antes de reservar ");
                        break;// cancela a operação se faltar alguma etapa anterior
                    }

                    // validação de limite global: impede cadastrar mais de 20 reservas no sistema
                    if (totalReservas >= MaxReservas){
                        System.out.println("Limite maximo de "+MaxReservas+" reservas atingido!");
                        break; 
                    }
                    
                    //Solicita o numero do onibus onde o passageiro deseja realizar a reserva
                    System.out.println("Informe o número do onibus para reservar: ");
                    int numBus = sc.nextInt();
                    sc.nextLine(); 

                    // busca do onibus: procura a posição do onibus informado dentro do vetor
                    int idx = -1;// sinalizador: começa em -1 para indicar que ainda não foi encontrado
                    for(int i = 0;i<qtdOnibus;i++){
                        if(numerosOnibus[i] == numBus){
                            idx = i; // guarda o indice onde o onibus foi localizado
                            break;
                        }
                    }

                    // verificações de negocio e efetivação de reserva
                    if(idx == -1){
                        // se o numero digitado não bateu com nenhum cadastrado
                        System.out.println("Este não ônibus não existe!");
                    }else if(assentosDisponiveis[idx]<=0){
                        // se o onibus existe, mas a quantidade de vagas acabou
                        System.out.println("Não há assentos disponiveis para este onibus");
                    }else{
                        // se o onibus existe e possui vagas disponiveis
                        System.out.println("Nome do passageiro: ");
                        nomesPassageiros[totalReservas] = sc.nextLine(); // salva o nome na posição atual de reservas
                        onibusReserva[totalReservas] = numBus; // guarda qual onibus pertence a essa reserva
                        totalReservas++; // incrementa o contador geral de reservas efetuadas
                        assentosDisponiveis[idx]--; // subtrai 1 vaga do total de assentos deste onibus
                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;
                case 4:
                    if(!frotaRegistrada){
                        System.out.println("Registre primeiro os onibus!");
                        break;
                    }

                    System.out.println("Informe o numero do onibus para consulta: ");
                    int consultaBus = sc.nextInt();
                    sc.nextLine();

                    int idxConsulta = -1;
                    for(int i = 0;i<qtdOnibus;i++){
                        if(numerosOnibus[i] == consultaBus){
                            idxConsulta = i;
                            break;
                        }
                    }

                    if(idxConsulta == -1){
                        System.out.println("Este onibus não existe!");
                    }else{
                        boolean encontrou = false;
                        for(int i = 0;i<totalReservas;i++){
                            if(onibusReserva[i] == consultaBus){
                                System.out.println("- "+nomesPassageiros[i]);
                                encontrou = true;
                            }
                        }
                        if(!encontrou){
                            System.out.println("Não há reservas realizadas por este onibus");
                        }
                    }
                    break;
                case 5:
                    if(totalReservas == 0){
                        System.out.println("Não há reservas realizadas para este passageiro!");
                        break;
                    }

                    System.out.println("Informe o nome do passageiro: ");
                    String nomeConsulta = sc.nextLine();

                    boolean achou = false;
                    for(int i = 0;i<totalReservas;i++){
                        if(nomesPassageiros[i].equalsIgnoreCase(nomeConsulta)){
                            System.out.println("-- Onibus "+onibusReserva[i]);
                            achou = true;
                        }
                    }

                    if(!achou){
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;
                case 6:
                    if (qtdOnibus == 0) {
                        System.out.println("Nenhum onibus cadastrado");
                        break;
                    }

                    System.out.println("Assentos Disponiveis: ");
                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.println("Onibus: " + numerosOnibus[i] + " -- " + "Assentos Disponiveis: "
                                + assentosDisponiveis[i]);

                    }
                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Invalida!");
            }
        } while (op != 7);
        sc.close();
    }
}