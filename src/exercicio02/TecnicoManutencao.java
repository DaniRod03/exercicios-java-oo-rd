package exercicio02;

public class TecnicoManutencao extends Funcionario {
    // TODO: implemente o código desta classe
    private double bonusTM;
    private double valorInsa;

    public TecnicoManutencao(String nome, double salarioMensal, double bonusTM, double valorInsa) {
        super(nome, salarioMensal);
        this.setBonusTM(bonusTM);
        this.setValorInsa(valorInsa);
    }
    public void calcularSalarioAnual(){
        double salarioAnual = getSalarioMensal() * 13 + this.bonusTM + this.valorInsa;
        System.out.println("O valor do salario anual mais o valo do bonus e mais a insalubridade é: " +salarioAnual);
    }

    public double getBonusTM() {
        return bonusTM;
    }

    public void setBonusTM(double bonusTM) {
        this.bonusTM = bonusTM;
    }

    public double getValorInsa() {
        return valorInsa;
    }

    public void setValorInsa(double valorInsa) {
        this.valorInsa = valorInsa;
    }
}
