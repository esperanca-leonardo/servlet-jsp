package servlet.model;

public class Banda {
	private int id;
  private String nome;
  private Genero genero;
    
  public Banda(int id, String nome, Genero genero) {
		this.id = id;
		this.nome = nome;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}
    
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
