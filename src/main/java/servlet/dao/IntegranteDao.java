package servlet.dao;

import java.util.ArrayList;
import java.util.List;

import servlet.model.Banda;
import servlet.model.Genero;
import servlet.model.Integrante;

public class IntegranteDao {
	public List<Integrante> findAll() {
		List<Integrante> integranteList = new ArrayList<Integrante>();
	
		Integrante integrante1 = new Integrante(1, "Jao", new Banda(1, "Banda1", new Genero(1, "pagode")));
		Integrante integrante2 = new Integrante(2, "Bruno", new Banda(2, "Banda2", new Genero(2, "sertanejo")));
		Integrante integrante3 = new Integrante(3, "Matheus", new Banda(3, "Banda3", new Genero(3, "samba")));
		
		integranteList.add(integrante1);
		integranteList.add(integrante2);
		integranteList.add(integrante3);
		
		return integranteList;
	}
}
