package AtividadeConstru;

public class Consulta {
	private int data;
	private String Pcnte;
	private String nomeDents;
	
	public Consulta() {
		
	}
	public Consulta(int data) {
		this.data = data;
		
	}
	public Consulta (String pcnte, String nomeDents) {
		this.Pcnte = pcnte;
		this.nomeDents = nomeDents;
	
	}
	public int getData() {
		return data;
	}
	public void setData(int Data) {
		this.data = data;
	}
	public String getPcnte() {
		return Pcnte;
	}
	public void setPcnte(String pcnte) {
		this.Pcnte = pcnte;
	}
	public String getNomeDents() {
		return nomeDents;
	}
	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}

}
