public class JanelaDialogo extends JanelaAbstrata{
    public JanelaDialogo(JanelaImplementada janela){
        this.janela = janela;
    }

    @Override
    public void desenhar() {
        desenharJanela("Dialogo");

        desenharBotao(null);
    }

}
