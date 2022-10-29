public class JanelaWindows implements JanelaImplementada{
    public String sistema;
    public String janela;
    public String botao;

    public JanelaWindows(String sistema){
        this.sistema = sistema;
    }

    @Override
    public void desenharJanela() {
        janela = " Janela Windows ";
        
    }

    @Override
    public void desenharBotao() {
        botao = " Botao Windows ";
        
    }
    
}
