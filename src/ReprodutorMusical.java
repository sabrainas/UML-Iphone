public class ReprodutorMusical implements IDispositivo {
    @Override
    public void ligar() {
        System.out.println("Reprodutor Musical ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Reprodutor Musical desligado");
    }

    public void tocar() {
        System.out.println("Musica tocando");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void selecionar (String musica){
        System.out.println("Musica selecionada");
        tocar();
    }
}
