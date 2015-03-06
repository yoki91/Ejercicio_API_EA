package eetac.upc.edu.ea.yifeige.ejercicio.Ejercicio_Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.*;

import eetac.upc.edu.ea.yifeige.ejercicio.Ejercicio_Api.model.*;

@Path("/message")
public class MessageResource 
{
	Map mapa=Map.getInstance(); //solo existe un unico Hashmap con nombre mapa en MessageResource. 
	
	@POST
	@Consumes(MediaType.EJERCICIO_API_MESSAGE)
	public Message crearM(Message m)
	{
		mapa=(Map) mapa.getM(); //primero invocamos el hashmap guardado
		String s=(String) mapa.get("user"+m.getUserid()); //recuperamos el nombre del usuario desde el id del usuario
		mapa.put(s+"m"+m.getMessageid(), m.getContent());//ponemos el mensaje del usuario dentro del hashmap con esa estructura
		                                                // ej:(yifeim1,hola soy yifei) el primero es el key y el segundo es el mensaje
		
		return m;
	}
	
    @GET
    @Produces(MediaType.EJERCICIO_API_MESSAGE)
    public Message getM(@QueryParam("userid")int userid,@QueryParam("messageid") int messageid)
    {
    	String nombre;
    	Message m=new Message();
    	m.setUserid(userid);
    	m.setMessageid(messageid);
    	nombre=(String) mapa.get("user"+userid);//recuperamos el nombre del usuario con su id
    	
    	String mensaje;
    	mensaje=(String) mapa.get(nombre+"m"+messageid);//recuperamos el mensaje del usuario con su nombre
    	m.setContent(mensaje);
    	
    	return m;   
   	}
	

}
