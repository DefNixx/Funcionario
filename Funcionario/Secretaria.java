 /**
    * Classe Secretaria, subclasse com atributos fixos (nome e salario) 
    * + atributo adicional Ramal
    * @author nicolas andre
    */

public class Secretaria extends Funcionario 
{
    private String ramal;

    public Secretaria(String nome, double salario, String ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Ramal: " + ramal);
    }

}
