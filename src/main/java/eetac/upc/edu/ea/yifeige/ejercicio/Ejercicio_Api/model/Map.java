package eetac.upc.edu.ea.yifeige.ejercicio.Ejercicio_Api.model;
import java.util.HashMap;

public class Map extends HashMap //Map al mismo tiempo es un Singleton porque solo queremos un unico hashmap para guardar datos
{
	private static Map instance=new Map();
	private HashMap m;
	
	private Map()
	{
		
	}
	
	public static Map getInstance()
	{
		return instance;
		
	}
	
	
	public HashMap getM() {
		return m;
	}

	public void setM(HashMap m) {
		this.m = m;
	}
	

}
