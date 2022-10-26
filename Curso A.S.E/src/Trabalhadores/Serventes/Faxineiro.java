package Trabalhadores.Serventes;

import Trabalhadores.Funcionario;

public class Faxineiro extends Funcionario{
    private int tempo_trabalho_anos;

    public Faxineiro(String nome, int tempo_trabalho_anos) {
        super(nome);
        this.tempo_trabalho_anos = tempo_trabalho_anos;
    }

    public void calcularSalarioMensal(){
        switch(tempo_trabalho_anos){
            case 1: this.salario = 1200.00;
            break;
            case 2: this.salario = 1400.00;
            break;
            case 3: this.salario = 1650.00;
            break;
            default : this.salario = 1800.00;
            break; 
        }
    }

    public void status(){
        System.out.println("############");
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
        System.out.println("############");
    }
}
