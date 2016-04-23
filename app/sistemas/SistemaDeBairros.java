package sistemas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SistemaDeBairros {
	
	private static final SistemaDeBairros INSTANCIA = new SistemaDeBairros();
	private List<String> bairros;
	
	private SistemaDeBairros(){
		bairros = new LinkedList<>();
		inicializaBairros();
	}
	
	public static SistemaDeBairros getInstance() {
		return INSTANCIA;
	}
	
	private void inicializaBairros(){
		bairros.add("Alto Branco");
		bairros.add("Centro");
		bairros.add("Araxá");
		bairros.add("Bairro das Nações");
		bairros.add("Conceição");
		bairros.add("Cidade Juracy Palhano");
		bairros.add("Cuités");
		bairros.add("Jardim Continental");
		bairros.add("Jardim Tavares");
		bairros.add("Jeremias");
		bairros.add("Jenipapo");
		bairros.add("Lauritzen");
		bairros.add("Louzeiro");
		bairros.add("Monte Santo");
		bairros.add("Novo Bodocongó");
		bairros.add("Palmeira");
		bairros.add("Vale dos Poetas");
		bairros.add("Anápolis");
		bairros.add("Belo Monte");
		bairros.add("Castelo Branco");
		bairros.add("Glória");
		bairros.add("Jardim Europa");
		bairros.add("Jardim América");
		bairros.add("Jardim Atalaia");
		bairros.add("Jardim Menezes");
		bairros.add("José Pinheiro");
		bairros.add("Mirante");
		bairros.add("Monte Castelo");
		bairros.add("Nova Brasília");
		bairros.add("Santa Terezinha");
		bairros.add("Santo Antônio");
		bairros.add("Vila Cabral");
		bairros.add("Acácio Figueiredo");
		bairros.add("Bairro das Cidades");
		bairros.add("Catolé");
		bairros.add("Catolé de Zé Ferreira");
		bairros.add("Conjunto Cinza");
		bairros.add("Conjunto Ronaldo Cunha Lima");
		bairros.add("Colinas do Sol");
		bairros.add("Distrito Industrial");
		bairros.add("Distrito dos Mecânicos");
		bairros.add("Estação Velha");
		bairros.add("Itararé");
		bairros.add("Jardim Borborema");
		bairros.add("Jardim Paulistano");
		bairros.add("Jardim Vitória");
		bairros.add("Liberdade");
		bairros.add("Ligeiro");
		bairros.add("Novo Cruzeiro");
		bairros.add("Novo Horizonte");
		bairros.add("Palmeira Imperial");
		bairros.add("Portal Sudoeste");
		bairros.add("Presidente Médici");
		bairros.add("Ressurreição (I e II)");
		bairros.add("Rocha Cavalcante");
		bairros.add("Rosa Cruz");
		bairros.add("Sandra Cavalcante");
		bairros.add("São José");
		bairros.add("Serra da Borborema");
		bairros.add("Tambor");
		bairros.add("Três Irmãs");
		bairros.add("Bela Vista");
		bairros.add("Bodocongó");
		bairros.add("Centenário");
		bairros.add("Dinamérica");
		bairros.add("Jardim Verdejante");
		bairros.add("Malvinas");
		bairros.add("Mutirão do Serrotão");
		bairros.add("Novo Bodocongó");
		bairros.add("Prata");
		bairros.add("Pedregal");
		bairros.add("Jardim Quarenta");
		bairros.add("Ramadinha (I e II)");
		bairros.add("Santa Cruz");
		bairros.add("Santa Rosa");
		bairros.add("Serrotão");
		bairros.add("Sítio Lucas (I e II)");
		bairros.add("Sítio Estreito (I, II e III)");
		bairros.add("Universitário");
		bairros.add("Distrito de Catolé");
		bairros.add("Galante");
		bairros.add("Marinho");
		bairros.add("Santa Terezinha");
		bairros.add("São José da Mata");
		
		Collections.sort(bairros);
	}		
	
	public List<String> getBairrosCadastrados(){
		return bairros;
	}
	
	boolean cadastraNovoBairro(String bairro){
		return bairros.add(bairro);
	}
	
	boolean removeBairro(String bairro){
		return bairros.remove(bairro);
	}

}
