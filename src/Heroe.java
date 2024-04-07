
public class Heroe extends Persona

{
	
	String nombreHeroe, poderes, franquicia;
	
	// Constructor.
	
	public Heroe(String nombre, String ciudad, int edad, String nombreHeroe, String poderes, String franquicia) {
		super(nombre, ciudad, edad);
		this.nombreHeroe = nombreHeroe;
		this.poderes = poderes;
		this.franquicia = franquicia;
	}

	public void mostrar_poderes()
	
	{
		
		System.out.println("Poderes de: " + this.nombreHeroe);
		
		/*for (int i = 0; i < poderes.length; i++)
			
		{
			
			System.out.println((i + 1) + poderes[i]);
			
		}
		*/
	}
	
}
