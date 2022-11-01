public class JanelaLinux implements JanelaImplementada{
    public String sistema;

    public JanelaLinux(String sistema){
        this.sistema = sistema;
    }

    @Override
    public void desenharJanela(String janela) {
        if(janela == "Dialogo"){
            System.out.println("Janela Dialogo - Janela Linux");
            System.out.println(" ");
        }else if (janela == "Aviso"){
            System.out.println("Janela de Aviso - Janela Linux");
            System.out.println(" ");
        }else{
            System.out.println("Janela nao referenciada pelo sistema.");
            System.out.println(" ");
        }
        
    }

    @Override
    public void desenharBotao(String botao) {
        System.out.println("Botao Sim - Botao Linux");
        System.out.println(" ");

        System.out.println("Botao Nao - Botao Linux");
        System.out.println(" ");

        System.out.println("Botao Cancelar - Botao Linux");
        System.out.println(" ");

        System.out.println("Ok - Botao Linux");
        System.out.println(" ");
    }
    
}
