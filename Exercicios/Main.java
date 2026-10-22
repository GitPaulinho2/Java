package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int M = 0;
        int F = 0;
        int sexo = 0;
        double maior = 0;
        double menor = 0;
        double somaH = 0;
        double mediaHomem = 0;
        double altura = 0;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        for(int i=0;i<=10;i++){

            System.out.println("Digite o seu sexo: (1 para masculino, 2 para feminino)");
            sexo = sc.nextInt();

            System.out.println("Digite a sua altura: ");
            altura = sc.nextDouble();

            if(sexo == 1){
                M++;
                somaH = somaH + altura;
            } else if(sexo == 2){
                F++;
            }else{
                System.out.println("Opção sexo Invalida!!");
            }
            
            if(altura>maior){
                maior = altura;
            }else if(altura<menor){
                menor = altura;
            }
            
            mediaHomem = (somaH/M);

            System.out.println("a media da altura dos homens é: "+mediaHomem%2f);
            System.out.println("A maior altura do grupo é de:  "+maior+" a menor altura do grupo é de: "+menor);
            System.out.println("O numero de mulheres é: "+F);
        }
        sc.close();

    }
}