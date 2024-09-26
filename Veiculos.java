public class Veiculos {

    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double doTotal() {

        double valorPagar = valorHora + valorAdicional * (horas - 1);

        return valorPagar;


    }

    private String doViewCupom() {

        return "R$" + doTotal();
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
