public class NavegadorInternet implements IDispositivo {

    @Override
    public void ligar() {
        System.out.println("Navegador de Internet ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Navegador de Internet desligado");
    }

    public String exibirPagina(String pagina) {
        return "Página carregada com sucesso " + pagina;
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}
