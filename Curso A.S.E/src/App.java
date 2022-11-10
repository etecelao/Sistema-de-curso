import Trabalhadores.Magisterio.Materias;
import Trabalhadores.Magisterio.Professor;
import Trabalhadores.Serventes.Faxineiro;
import Estudantes.*;

public class App {
    public static void main(String[] args) {
        
        Faxineiro faxineiro1 = new Faxineiro("Moacir", 2);
        faxineiro1.calcularSalarioMensal();
        faxineiro1.status();

        Aluno aluno1 = new Aluno("Lucca", Turma.CN, 137);
        aluno1.calcularMensalidade(15);
        aluno1.status();
        
        Professor professor1 = new Professor("Jorge", Materias.GEOGRAFIA, 8, 18);
        Professor professor2 = new Professor("Rodrigo", Materias.MATEMATICA, 7, 13);
        professor1.calculoSalarioMensal();
        professor2.calculoSalarioMensal();
        professor1.status();
        professor2.status();

        System.out.format("O salário do professor %s é maior que do professor %s",professor1.nome, professor2.nome+"? "+professor1.equals(professor2));
    }
}
