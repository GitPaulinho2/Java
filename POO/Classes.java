package POO;

public class Classes {
    public static void main(String[] args) {
        //objeto 
        Carro meuCarro = new Carro("Honda");
        Carro meuCarro1 = new Carro("BMW");
        Carro meuCarro2 = new Carro("Ferrari");
        
        meuCarro.exibirModelo();
        meuCarro1.exibirModelo();
        meuCarro2.exibirModelo();
    }
}

// classe
class Carro{
    String modelo;
    //construtor
    public Carro(String modelo){
        this.modelo = modelo;
    }
    //metodo
    public void exibirModelo(){
        System.out.println("Modelo do carro: "+this.modelo);
    }
}