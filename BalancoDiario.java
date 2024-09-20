public class BalancoDiario {

    private static int qtdeCarros;
    private static double total;

    public void doAdd(Veiculos veiculos){
        BalancoDiario.qtdeCarros = BalancoDiario.qtdeCarros +1;

        BalancoDiario.total += veiculos.doTotal();
    }

    public String doGerarRelatorio(){

        return "Total de carros" + BalancoDiario.total;
    }


}
