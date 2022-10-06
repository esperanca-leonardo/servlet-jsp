package servlet.model;

public class Integrante {
	private int id;
    private String nome;
    private Banda banda;
    
    public Integrante(int id, String nome, Banda banda) {
		this.id = id;
		this.nome = nome;
		this.banda = banda;
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
	
	public Banda getBanda() {
		return banda;
	}
	
	public void setBanda(Banda banda) {
		this.banda = banda;
	}
}
