package aparelho.model;

import AprelhoTelefonico.Telefone;
import NavegadorInternet.Navegador;
import ReprodutorMusical.ReprodutorDeSom;

public class Dispositivo implements Telefone, Navegador, ReprodutorDeSom{
	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("PAUSANDO MUSICA");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica: " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("PAGINA ABERTA: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("NOVA ABA ADICIONADA");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("PAGINA ATUALIZADA");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("LIGANDO PARA " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("ATENDER LIGAÇÃO");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("GRAVANDO CORREIO DE VOZ");
	}
	
}
