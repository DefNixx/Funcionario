
   /**
    * Classe funcionario, superclasse com atributos fixos (nome e salario)
    * @author nicolas andre
    */
   

public class Funcionario
{
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario)
    {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public double getSalario() 
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }

    
    
}
