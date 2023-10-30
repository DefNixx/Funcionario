 /**
    * Classe principal, ambiente para execução e debug
    * @author nicolas andre
    */

public class Main {
    public static void main(String[] args) {
        
        Secretaria analine = new Secretaria("Analine", 50.435 , "123");
        Gerente gabriel = new Gerente("Gabriel", 42.327, 7);
        
        analine.exibirDados();
        gabriel.exibirDados();
    }
}
