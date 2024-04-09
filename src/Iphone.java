package src;


 interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica();
}


 interface AparelhoTelefonico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}


 interface NavegadorInternet {
    void exibirPagina();
    void adicionarNovaAba();
    void atualizarPagina();
}


public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        // Comando para tocar música.
    }

    @Override
    public void pausar() {
        // Comando para pausar música.
    }

    @Override
    public void selecionarMusica() {
        // Comando para selecionar música.
    }

    @Override
    public void ligar() {
        // Comando para ligar o telefone.
    }

    @Override
    public void atender() {
        // Comando para atender chamadas.
    }

    @Override
    public void iniciarCorreioVoz() {
        // Comando para iniciar correio de voz.
    }

    @Override
    public void exibirPagina() {
        // Comando para exibir páginas da internet.
    }

    @Override
    public void adicionarNovaAba() {
        // Comando para adicionar nova aba no navegador.
    }

    @Override
    public void atualizarPagina() {
        // Comando para atualizar a página no navegador.
    }
}
