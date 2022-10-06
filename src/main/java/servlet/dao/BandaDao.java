package servlet.dao;

import java.util.ArrayList;
import java.util.List;

import servlet.model.Banda;
import servlet.model.Genero;

public class BandaDao {
	public List<Banda> findAll() {
		List<Banda> bandaList = new ArrayList<Banda>();
	
		Banda banda1 = new Banda(1, "Banda1", new Genero(1, "pagode"));
		Banda banda2 = new Banda(2, "Banda2", new Genero(2, "sertanejo"));
		Banda banda3 = new Banda(3, "Banda3", new Genero(3, "samba"));
		
		bandaList.add(banda1);
		bandaList.add(banda2);
		bandaList.add(banda3);
		
		return bandaList;
	}
}
