package testes_heranca;

public class Principal {
public static void main(String[] args) {
	
	Animal a = new Animal("Cachorro");
	Planta p = new Planta("Coqueiro", true);
	Planta s = new Planta("Samambaia", false);
	PlantaTropical pt = new PlantaTropical("Cajazeira", true, "Brasileira");
	PlantaTropical pt2 = new PlantaTropical("Mangueira", true, "Indiana");
	System.out.println("Nome do Animal: " + a.nome);
	System.out.println("Nome do Animal: " + a.nome);
	SerVivo sv = new SerVivo("Bactéria");
	a.emitirSom();
	//p.emitirSom();
	//sv.emitirSom();
	
	
}
}
