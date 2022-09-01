public class Carro{
    private String modelo;
    private String marca;
    private int diarias;
    private double valorDiaria;


public Carro(String m, String mm, int d, double v){
    modelo = m;
    marca = mm;
    diarias = d;
    valorDiaria = v;
}

public void exibeDados(){
    System.out.println("Dados do seu veículo :");
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Valor da sua diária: " + valorDiaria);
}

}