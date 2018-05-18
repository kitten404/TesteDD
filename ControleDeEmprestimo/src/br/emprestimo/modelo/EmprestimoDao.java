package br.emprestimo.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoDao {
	List<Emprestimo> emprestimos=new ArrayList<Emprestimo>();
	public boolean adiciona(Emprestimo umEmprestimo) {
		return emprestimos.add(umEmprestimo);
	}
	public Emprestimo consultar(Emprestimo umEmprestimo) {
		for(Emprestimo emprestimo:emprestimos){
			 if(emprestimos.contains(umEmprestimo)){
				 return emprestimo;
			 }
		}
		return null;
		
	}

}
