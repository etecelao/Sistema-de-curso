import Trabalhadores.Magisterio.Materias;
import Trabalhadores.Magisterio.Professor;
import Trabalhadores.Serventes.Faxineiro;
import Estudantes.*;

public class App {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jorge", Materias.GEOGRAFIA, 8, 18);
        professor1.calculoSalarioMensal();
        professor1.status();
        Faxineiro faxineiro1 = new Faxineiro("Moacir", 2);
        faxineiro1.calcularSalarioMensal();
        faxineiro1.status();
        Aluno aluno1 = new Aluno("Lucca", Turma.CN, 137);
        aluno1.calcularMensalidade(15);
        aluno1.status();
    }
}
