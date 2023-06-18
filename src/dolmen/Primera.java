package dolmen;

public class Primera {
	private void  goliar() 
	{}
		public double homero()
		{
			goliar();
			
		}
		protected void jureste () 
		{}
		String salustio() {}
}
	
	public class Segunda
	{
		public void balsas()
		{
			Primera p =new Primera();
			p.goliar(); //error, el metodo goliar es privado
			p.salustio(); //correcto, esta en el mismo paquete		
		}
	}
	