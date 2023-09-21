package AtividadeConstru;

class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta jogador1 = new Consulta();
		Consulta jogador2 = new Consulta("04/03/1972");
 		Consulta jogador3 = new Consulta("Glodoswalvo");
		Consulta jogador4 = new Consulta ("Ze comedia");
		
		
		System.out.println(jogador2.getData());
		System.out.println(jogador2.getPcnte());
		System.out.println(jogador2.getNomeDents());
		
	

	}

}
