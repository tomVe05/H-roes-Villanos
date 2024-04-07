
public class Villano extends Persona 

{
	
	String nombreVillano, poderes, franquicia;


	
	

	public Villano(String nombre, String ciudad, int edad, String nombreVillano, String poderes, String franquicia) {
		super(nombre, ciudad, edad);
		this.nombreVillano = nombreVillano;
		this.poderes = poderes;
		this.franquicia = franquicia;
	}

	public void mostrar_poderes()
	
	{
		
		System.out.println("Poderes de: " + this.nombreVillano);
		
		/*for (int i = 0; i < poderes.length; i++)
			
		{
			
			System.out.println((i + 1) + poderes);
			
		}
		*/
		
	}

}
