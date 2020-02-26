package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    // TODO: implemente o código desta classe
    private double bonusAE;

    public AuxiliarEscritorio(String nome, double salarioMensal, double bonusAE) {
        super(nome, salarioMensal);
        this.bonusAE = bonusAE;
    }
    public void calcularSalarioAno(){
        double salarioAnual = getSalarioMensal() * 13 + this.bonusAE;
        System.out.println("O valor do salario anual com valor do bonus é: " +salarioAnual);
    }
}


