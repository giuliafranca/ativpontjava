public class JanelaLinux implements JanelaImplementada{
    public String sistema;
    public String janela;
    public String botao;

    public JanelaLinux(String sistema){
        this.sistema = sistema;
    }

    @Override
    public void desenharJanela() {
        janela = " Janela Linux ";
        
    }

    @Override
    public void desenharBotao() {
        botao = " Botao Linux ";
        
    }
    
}
