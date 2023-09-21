package AtividadeConstru;



public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal jogador1 = new Animal();
		Animal jogador2 = new Animal(45);
		Animal jogador3 = new Animal("Cinza");
		
		System.out.println(jogador2.getTamanho());
		System.out.println(jogador2.getCor());

	}

}
