public class JanelaAviso extends JanelaAbstrata{

    @Override
    public void desenhar() {
        desenharJanela("Aviso");
        
        desenharBotao(null);
        
    }

    public JanelaAviso(JanelaImplementada janela){
        this.janela = janela;
    }
}
