package exercicio02;

public class Gerente extends Funcionario{

    // TODO: implemente o código desta classe
    private double percentualBonus;


    public Gerente(String nome, double salarioMensal, double percentualBonus) {
        super(nome, salarioMensal);
        this.percentualBonus = percentualBonus;
    }
    public void calcularSalarioAnual(){
        double salarioAnual = (this.getSalarioMensal() + (percentualBonus/100)) + (getSalarioMensal() * 13);
    }

    public double getBonusAnualVar() {
        return percentualBonus;
    }

    public void setBonusAnualVar(double bonusAnualVar) {
        this.percentualBonus = percentualBonus;
    }

}
