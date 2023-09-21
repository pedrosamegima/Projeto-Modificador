package AtividadeConstru;

import ModificadoresDeAcess.Pessoa;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("CFD39831", 25252525);
		Animal cat1 = new Animal(1000,"Cinza");
		Consulta jogador2 = new Consulta("Jose", "Carlos");
	
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getNumChassi());
		System.out.println(cat1.getCor());
		System.out.println(cat1.getTamanho());
		System.out.println(jogador2.getPcnte());
		System.out.println(jogador2.getData());
		System.out.println(jogador2.getNomeDents());
		
	

	}

}
