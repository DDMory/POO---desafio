package iphone;

import aparelho.model.Dispositivo;

public class MyIphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dispositivo m1 = new Dispositivo();
		
		
		m1.atender();
		m1.ligar("61 123456789");
		m1.iniciarCorreioVoz();
		System.out.println("###########################");
		m1.adicionarNovaAba();
		m1.exibirPagina("https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo");
		m1.atualizarPagina();
		System.out.println("###########################");
		m1.tocar();
		m1.pausar();
		m1.selecionarMusica("Phonk");
	}

}
