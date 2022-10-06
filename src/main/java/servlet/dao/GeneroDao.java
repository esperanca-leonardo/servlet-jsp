package servlet.dao;

import java.util.ArrayList;
import java.util.List;

import servlet.model.Genero;

public class GeneroDao {
	public List<Genero> findAll() {
		List<Genero> generoList = new ArrayList<Genero>();
	
		Genero genero1 = new Genero(1, "pagode");
		Genero genero2 = new Genero(2, "sertanejo");
		Genero genero3 = new Genero(3, "samba");
		
		generoList.add(genero1);
		generoList.add(genero2);
		generoList.add(genero3);
		
		return generoList;
	}
}
