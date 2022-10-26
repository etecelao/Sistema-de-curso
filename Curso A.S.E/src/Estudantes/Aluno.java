package Estudantes;
public class Aluno{
    Turma turma;
    private String nome;
    private int matricula;
    private double mensalidade;

    public Aluno(String nome, Turma turma, int matricula) {
        this.nome = nome;
        this.turma = turma;
        this.matricula = matricula;
    }

    public void calcularMensalidade(int diaPago){
        switch(turma){
            case ESA:
            if(diaPago<=10){
                this.mensalidade = 200.00;
            }else if((diaPago>=11) & (diaPago<=20)){
                this.mensalidade = 230.00;
            }else{
                this.mensalidade = 250.00;
            }
            break;
            case ESPECEX: 
            if(diaPago<=10){
                this.mensalidade = 260.00;
            }else if((diaPago>=10) & (diaPago<=20)){
                this.mensalidade = 305.00;
            }else{
                this.mensalidade = 330.00;
            }
            break;
            case CN:
            if(diaPago<=10){
                this.mensalidade = 160.00;
            }else if((diaPago>=11) & (diaPago<=20)){
                this.mensalidade = 185.00;
            }else{
                this.mensalidade = 200.00;
            }
        }
    }

    public void status(){
        System.out.println("############");
        System.out.println("Nome do aluno: "+this.nome);
        System.out.println("Matícula: "+this.matricula);
        System.out.println("Turma: "+this.turma+", Mensalidade: "+this.mensalidade);
        System.out.println("############");
    }
}
