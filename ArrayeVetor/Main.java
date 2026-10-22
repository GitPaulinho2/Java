package ArrayeVetor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // int[] intArray = {1, 2, 3, 4, 5};
        // int[] meusNumeros = new int[5];

        // System.out.println(meusNumeros.length);

        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Ford");
        carros.add("Fiat");
        carros.add("Chevrolet");

        //System.out.println(carros.get(1));
        
        //carros.remove(0);

        // //System.out.println(carros.get(1));
        // for(int i = 0; i<carros.size();i++){
        //     System.out.println(carros.get(i));

        // for (String i : carros){
        //     System.out.println(i);
        // }

        int contador = 0;
        while(contador < carros.size()){
            System.out.println("Carro: "+carros.get(contador));
            contador+=1;
        }
    }
}
