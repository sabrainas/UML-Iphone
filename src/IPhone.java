public class IPhone{
    private ReprodutorMusical reprodutorMusical;
    private NavegadorInternet navegadorInternet;
    private AparelhoTelefonico aparelhoTelefonico;

    public IPhone(){
        this.reprodutorMusical = new ReprodutorMusical();
        this.navegadorInternet = new NavegadorInternet();
        this.aparelhoTelefonico = new AparelhoTelefonico();
    }

    public ReprodutorMusical getReprodutorMusical(){
        return reprodutorMusical;
    }

    public NavegadorInternet getNavegadorInternet(){
        return navegadorInternet;
    }
    public AparelhoTelefonico getAparelhoTelefonico(){
        return aparelhoTelefonico;
    }

    public void ligar() {
        reprodutorMusical.ligar();
        navegadorInternet.ligar();
        aparelhoTelefonico.ligar();
    }

    public void desligar() {
        reprodutorMusical.desligar();
        navegadorInternet.desligar();
        aparelhoTelefonico.desligar();
    }
}
