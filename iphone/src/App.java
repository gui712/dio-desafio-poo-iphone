import dio.iphone.componentes.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();

        // Testando funcionalidades do aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("---------------------------------");

        // Testando funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Música 1");

        System.out.println("---------------------------------");


        // Testando funcionalidades do navegador da internet
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        System.out.println("---------------------------------");

    }
}
