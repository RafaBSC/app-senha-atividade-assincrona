package com.app.senha;

import javax.swing.JOptionPane;

public class Senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaração de Variáveis
		String usuario; 
		String senha;
		
		//Recebe os valores do usuário
		usuario = JOptionPane.showInputDialog("Insira seu nome de usuário");
		senha = JOptionPane.showInputDialog("Insira sua senha: ");
		
		//Saber se vai entrar ou não
		if(usuario.equals("RAFAEL") && senha.equals("123")) {
			JOptionPane.showMessageDialog(null, "Acesso liberado com sucesso.");
		}else {
			JOptionPane.showMessageDialog(null, "Acesso restrito.");
		}
	}

}
