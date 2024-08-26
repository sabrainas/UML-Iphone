//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar();
        iphone.getNavegadorInternet().exibirPagina("www.google.com");
        iphone.getReprodutorMusical().selecionar("l'amour de ma vie");
        iphone.getAparelhoTelefonico().ligar();
        iphone.getReprodutorMusical().pausar();
    }
}