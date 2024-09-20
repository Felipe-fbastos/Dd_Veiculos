public class Segurado  extends Veiculos implements ISeguroService {

    private double seguro;


    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    public double doTotal(){

        double valorEstacionamento = super.doTotal() - doDesconto();

        return valorEstacionamento;
    }

    public String doViewCumpom(){

        return "R$ " + doTotal() + "Desconto aplicado: " + doDesconto();
    }

    @Override
    public double doDesconto() {

        double descontoVeiculos =  super.doTotal() * seguro / 100;

        return descontoVeiculos;
    }
}
