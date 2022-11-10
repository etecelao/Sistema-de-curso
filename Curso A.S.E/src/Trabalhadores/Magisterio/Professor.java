package Trabalhadores.Magisterio;

import Trabalhadores.Funcionario;

public class Professor extends Funcionario{
    Materias materias;
    private double horas_trab_dia;
    private int dias_trab_mes;

    public Professor(String nome, Materias materias, double horas_trab_dia, int dias_trab_mes) {
        super(nome);
        this.materias = materias;
        this.horas_trab_dia = horas_trab_dia;
        this.dias_trab_mes = dias_trab_mes;
    }

    public void calculoSalarioMensal(){
        switch(materias){
            case MATEMATICA: this.salario = dias_trab_mes * horas_trab_dia * 20.00;
            break;
            case QUIMICA: this.salario = dias_trab_mes * horas_trab_dia * 18.15;
            break;
            case FISICA: this.salario = dias_trab_mes * horas_trab_dia * 19.50;
            break;
            case BIOLOGIA: this.salario = dias_trab_mes * horas_trab_dia * 18.00;
            break;
            case PORTUGUES: this.salario = dias_trab_mes * horas_trab_dia * 19.00;
            break;
            case LITERATURA: this.salario = dias_trab_mes * horas_trab_dia * 14.00;
            break;
            case GEOGRAFIA: this.salario = dias_trab_mes * horas_trab_dia * 15.35;
            break;
            case HISTORIA: this.salario = dias_trab_mes * horas_trab_dia * 15.00;
            break;
            case INGLES: this.salario = dias_trab_mes * horas_trab_dia * 16.50;
            break;
            case REDACAO: this.salario = dias_trab_mes * horas_trab_dia * 14.70;
        }
    }

    //Verifica qual salário é maior
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return false;
        Professor prof = (Professor) obj;
        return this.salario > prof.salario;
    }

    public void status(){
        System.out.println("############");
        System.out.println("Nome do professor: "+this.nome);
        System.out.println("Matérias lecionada: "+this.materias);
        System.out.println("Horas trabalhadas: "+this.horas_trab_dia+"; Dias trabalhados: "+this.dias_trab_mes);
        System.out.println("Salário: "+this.salario);
        System.out.println("############");
    }
}
