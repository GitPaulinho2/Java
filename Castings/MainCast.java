package Castings;

public class MainCast {
    public static void main(String[] args){

        // casting explicito
        // convertendo um double para int
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        // casting implicito
        // convertendo um int para double
        int meuInt = 10;
        double meuDouble = meuInt;

        // convertendo String para int
        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        // convertendo int para String
        String minhaString = String.valueOf(meuInt2);

        System.out.println("Resultado: "+resultadoInt);
        System.out.println("Resultado Double: "+meuDouble);
        System.out.println("Resultado Int2: "+meuInt2);
        System.out.println("Resultado String: "+minhaString);
    }
}
