/*1. Criar uma aplicação em Java que tenha uma função recursiva 
 * que calcule o somatório dos N primeiros números NATURAIS 
 * (a função deve retornar zero para números negativos)
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a condição de parada; 
 * O Código deve apresentar, em formato de comentário, 
 * como foi definida a relação de chamada dos passos.
*/

package controller;

public class SomaNaturaisController {

	public SomaNaturaisController() {
		super();
		
	}

	public int somaNaturais(int limite) {
		//Condição de Parada
		//if(limite == 0) {Conforme enunciado do exercício, tem que mudar!
		//Por causa dos negativos! Digitou 0 ou negativo, segue o jogo!
		  if(limite <= 0) {
			return 0;
		} else {
			int proximo = limite - 1;	
			return limite + somaNaturais(proximo);
		}
	}
}
