package view;

import javax.swing.JOptionPane;

import controller.SomaNaturaisController;

public class Principal {

	public static void main(String[] args) {
		int limite =
		    Integer.parseInt(JOptionPane.showInputDialog
		    		(null, "Digite um número: "));
		
		SomaNaturaisController snCont = new SomaNaturaisController();
		int soma = snCont.somaNaturais(limite);
		System.out.println(soma);
	}

}
