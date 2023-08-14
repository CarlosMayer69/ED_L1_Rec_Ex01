/*1. Criar uma aplica��o em Java que tenha uma fun��o recursiva 
 * que calcule o somat�rio dos N primeiros n�meros NATURAIS 
 * (a fun��o deve retornar zero para n�meros negativos)
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a condi��o de parada; 
 * O C�digo deve apresentar, em formato de coment�rio, 
 * como foi definida a rela��o de chamada dos passos.
*/

package controller;

public class SomaNaturaisController {

	public SomaNaturaisController() {
		super();
		
	}

	public int somaNaturais(int limite) {
		//Condi��o de Parada
		//if(limite == 0) {Conforme enunciado do exerc�cio, tem que mudar!
		//Por causa dos negativos! Digitou 0 ou negativo, segue o jogo!
		  if(limite <= 0) {
			return 0;
		} else {
			int proximo = limite - 1;	
			return limite + somaNaturais(proximo);
		}
	}
}
