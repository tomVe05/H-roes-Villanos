
public class Main 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		System.out.println("Héroe:\r");
		
		Heroe Hulk = new Heroe("Hulk\n", "Dayton\n", 56, "\nBruce Banner\n", "Superfuerza\n", "MARVEL");
		
		System.out.println(Hulk.poderes + Hulk.ciudad + Hulk.franquicia);
		
		Persona Bruce_Banner = new Persona("Bruce Banner\n", "Dayton\n", 56);
		
		Bruce_Banner.setEdad(56);
		
		System.out.println("\r");
		
		System.out.println("Alias:\r");
		
		System.out.println(Bruce_Banner.nombre + Bruce_Banner.edad + "\n" + Bruce_Banner.ciudad);
		
		Villano Venom = new Villano("Eddie Brock\n", "San Francisco\n", 38, "\nVenom\n", "Simbiote\n", "MARVEL");
		
		System.out.println("\r");
		
		System.out.println("Villano:\r");
		
		System.out.println(Venom.poderes + Venom.ciudad + Venom.franquicia);
		
		System.out.println("\r");
		
		System.out.println("Alias:\r");
		
		Persona Eddie_Brock = new Persona("Eddie Brock\n", "San Francisco\n", 38);
		
		Eddie_Brock.setEdad(38);
		
		System.out.println(Eddie_Brock.nombre + Eddie_Brock.edad + "\n" + Eddie_Brock.ciudad);
		
		

	}

}
