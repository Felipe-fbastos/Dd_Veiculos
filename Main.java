public class Main {
    public static void main(String[] args) {

        Segurado se = new Segurado(10);
        se.setValorHora(5);
        se.setValorAdicional(2);
        se.setHoras(0);
        //System.out.println(se.doViewCumpom());


        Segurado se1 = new Segurado(10);
        se1.setValorHora(5);
        se1.setValorAdicional(2);
        se1.setHoras(0);
        //System.out.println(se.doViewCumpom());

        BalancoDiario bd = new BalancoDiario();

        bd.doAdd(se);
        bd.doAdd(se1);

        System.out.printf(bd.doGerarRelatorio());


    }
}
