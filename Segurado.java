public class Segurado extends Veiculos implements ISeguroService {

    private double seguro;


    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    public double doTotal() {

        double valorEstacionamento = super.doTotal() - doDesconto();

        return valorEstacionamento;
    }

    public String doViewCumpom() {

        return "Valor sem desconto " + super.doTotal() + "\nDesconto aplicado: " + doDesconto() + "\nTotal R$ " + doTotal();
    }

    @Override
    public double doDesconto() {

        double descontoVeiculos = super.doTotal() * seguro / 100;


        return descontoVeiculos;
    }
}
