public class JanelaWindows implements JanelaImplementada{
    public String sistema;


    public JanelaWindows(String sistema){
        this.sistema = sistema;
    }

    @Override
    public void desenharJanela(String janela) {
        if(janela == "Dialogo"){
            System.out.println("Janela Dialogo - Janela Windows");
            System.out.println(" ");
        }else if (janela == "Aviso"){
            System.out.println("Janela de Aviso - Janela Windows");
            System.out.println(" ");
        }else{
            System.out.println("Janela nao referenciada pelo sistema.");
            System.out.println(" ");
        }
        
    }

    @Override
    public void desenharBotao(String botao) {
        System.out.println("Botao Sim - Botao Windows");
        System.out.println(" ");

        System.out.println("Botao Nao - Botao Windows");
        System.out.println(" ");

        System.out.println("Botao Cancelar - Botao Windows");
        System.out.println(" ");

        System.out.println("Ok - Botao Windows");
        System.out.println(" ");        
    }
    
}
