package eetac.upc.edu.ea.yifeige.ejercicio.Ejercicio_Api;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ws.rs.*;
import eetac.upc.edu.ea.yifeige.ejercicio.Ejercicio_Api.model.*;

@Path("/user")
public class UserResource 
{
	Map m=Map.getInstance(); //solo existe un unico Hashmap con nombre m en UserResource
	
	
	
	@POST
	@Consumes(MediaType.EJERCICIO_API_USER)
	public User crearUser(User user)
	{
		
		m.put("user"+user.getUserid(),user.getUsername()); //estructura (user1,yifei) user+id es el KEY, username es value
		m.setM(m);
		return user;
	}
	
	
	@GET
	@Produces(MediaType.EJERCICIO_API_USER)
	public User getuser(@QueryParam("userid") int userid)
	{
		String s;
		User user=new User();
		s=(String)m.get("user"+userid); //recupero value con el userid donde se obtiene desde POSTMAN(user1)
		user.setUserid(userid);
		user.setUsername(s);
		return user;
	}

}
