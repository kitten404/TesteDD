package br.emprestimo.testeUnitario;

import java.util.ArrayList;
import java.util.List;

import br.emprestimo.modelo.Usuario;

public class ObtemUsuario {
	public static Usuario comDadosValidos() {
		Usuario usuario = new Usuario();
		usuario.setRa("121212");
		usuario.setNome("Carlos Xavier");
		
		return usuario;
	}
	public static List<Usuario> listaUsuario(){
		List <Usuario> lista = new ArrayList<Usuario>();
		Usuario user = new Usuario();
		user.setRa("222222");
		user.setNome("Jose Da Silva");
		lista.add(user);
		user = new Usuario();
		user.setRa("333333");
		user.setNome("Mary Mary Jane");
		lista.add(user);
		user = new Usuario();
		user.setRa("444444");
		user.setNome("July July Honey");
		lista.add(user);
		return lista;
		
	}
}
