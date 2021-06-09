package ExerciciosPooHeranca;

public class TestaAnimal {

	public void somAnimal(Animal animal) { //o () solicita um parametro (ALL o objeto de uma das classes que criei)
		animal.somAnimal(); //o sistema vai puxar qualquer um dos animais da classe
	}
	public void correr (Animal animal) {
		animal.correr();
	}
	public void subirArvore (Animal animal) {
		animal.subirArvore();
	}
}