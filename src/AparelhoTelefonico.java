public class AparelhoTelefonico implements IDispositivo{
    private String numero;

    @Override
    public void ligar() {
        System.out.println("Aparelho telefônico ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Aparelho telefônico desligado");
    }

    public void ligarPara(String numero){
        this.numero = numero;
        System.out.println("Ligando para "+numero);
    }

    public void atender(){
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
}
