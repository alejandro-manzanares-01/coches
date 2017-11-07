
public class MiMain
{
	public static void main(String[] args)
	{
		Coche miCoche = new Coche("");
		Coche suCoche = new Coche("violeta");

		System.out.println(miCoche.getColor());
		System.out.println(suCoche.getColor());
		
		suCoche = null;
	}
}
