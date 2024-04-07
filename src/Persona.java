
public class Persona

{
	
	String nombre, ciudad;
	
	int edad;
	
	// Métodos getters y setters.

	public String getNombre() 
	
	{
		
		return nombre;
		
	}

	public void setNombre(String nombre)
	
	{
		
		this.nombre = nombre;
	
	}

	public String getCiudad() 
	
	{
		
		return ciudad;
	
	}

	public void setCiudad(String ciudad) 
	
	{
		
		this.ciudad = ciudad;
	
	}

	public int getEdad()
	
	{
		
		return edad;
	
	}

	public void setEdad(int edad)
	
	{
		
		this.edad = edad;
	
	}

	public Persona(String nombre, String ciudad, int edad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.edad = edad;
	}
	
}
