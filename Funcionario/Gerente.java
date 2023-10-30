 /**
    * Classe gerente, subclasse com atributos fixos (nome e salario) 
    * + atributo adicional Sala
    * @author nicolas andre
    */

public class Gerente extends Funcionario
{
    
    private int sala;

    public Gerente(String nome, double salario, int sala) {
        super(nome, salario);
        this.sala = sala;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println(("Sala: " + this.sala));
    }   

}
