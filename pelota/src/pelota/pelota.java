package pelota;

public class pelota {
	
	//Atributos
	float radio;
	float peso;
	 //Construtor
	
	public pelota() {
		radio = 100;
		peso = 250;
		
		
	
	}
	public pelota(float radio, float peso) {
		this.radio = radio;
		this.peso = peso;
	}
	
	public float ObtenerRadio() {
		return radio;
	}
		
	public float ObtenerPeso() {
		return peso;
	}
	public void PatearPelota() {
		System.out.println("Haz Pateado la Pelota");
	}
		
	public void AtraparPelota() {
		System.out.println("Haz Atrapado la pelota");
	}
	}



	


