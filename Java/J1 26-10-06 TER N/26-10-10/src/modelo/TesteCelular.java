package modelo;

public class TesteCelular {

	public static void main(String[] args) {
		
		Celular celular1 = new Celular("Samsung", "S25");
		
		System.out.println(celular1);
		celular1.assistirVideo();
		System.out.println(celular1.bateria + "%");
		
		Celular celular2 = new Celular("Motorola", "One Fusion");
		
		
		
		

	}

}
