package ExerciciosPooHeranca;

public class TestaTodos {
//polimorfismo!
	public static void main(String[] args) {

		TestaAnimal t1 = new TestaAnimal(); //testa todos os objetos da classe testa animal

		t1.somAnimal(new Cachorro());
		t1.somAnimal(new Cavalo ());
		t1.somAnimal(new Preguica ());
	
		t1.correr(new Cachorro());
		t1.correr(new Cavalo ());
		t1.subirArvore(new Preguica ());
	}
}