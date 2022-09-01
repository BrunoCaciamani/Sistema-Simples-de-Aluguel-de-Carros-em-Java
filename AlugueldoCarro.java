public class AlugueldoCarro{
    
    private int codigoDaReserva;
    private String dataInicio;
    private String dataFinal;
    private Cliente cliente;
    private Carro carro;
    
    public AlugueldoCarro(int c, String dti, String dtf, Cliente cl, Carro crr){
        codigoDaReserva = c;
        dataInicio = dti;
        dataFinal = dtf;
        cliente = cl;
        carro = crr;        
    }
    
    public void exibeDados(){
        System.out.println("*** Reserva realizada com Sucesso ***");
        System.out.println("Código da Reserva: " + codigoDaReserva);
        System.out.println("Data de Início da sua Reserva: " + dataInicio);
        System.out.println("Data Final da sua Reserva: " + dataFinal);
        carro.exibeDados();
        System.out.println("Nome do Cliente: " + cliente.getNome());
    }
    
    
    
}