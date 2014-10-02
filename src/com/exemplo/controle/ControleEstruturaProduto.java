package com.exemplo.controle;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.exemplo.entidade.EstruturaProduto;
import com.exemplo.repositorio.RepositorioEstruturaProduto;

@ManagedBean
@SessionScoped
public class ControleEstruturaProduto {

	private EstruturaProduto estruturaProduto;
	private List<EstruturaProduto> estruturaProdutos;
	private RepositorioEstruturaProduto repositorioEstruturaProduto;

	public ControleEstruturaProduto() {
		repositorioEstruturaProduto = new RepositorioEstruturaProduto();
	}
	
	
	public String novo(){
		estruturaProduto = new EstruturaProduto();
		return "formularioEstruturaProduto";
	}
	
	public String salvar(){
		repositorioEstruturaProduto.salvar(estruturaProduto);
		return "listarEstruturaProdito";
	}

	public String editar(){		
		return "formularioEstruturaProduto";
	}
	
	public String remover(){
		repositorioEstruturaProduto.remover(estruturaProduto);
		return "listarEstruturaProdito";
	}
	
	public String cancelar(){
		return "listarEstruturaProdito";
	}
	
	
	
	
	// Getts and Setts

	public EstruturaProduto getEstruturaProduto() {
		return estruturaProduto;
	}

	public void setEstruturaProduto(EstruturaProduto estruturaProduto) {
		this.estruturaProduto = estruturaProduto;
	}

	public List<EstruturaProduto> getEstruturaProdutos() {
		estruturaProdutos = repositorioEstruturaProduto.listarTodos();
		return estruturaProdutos;
	}

	public void setEstruturaProdutos(List<EstruturaProduto> estruturaProdutos) {
		this.estruturaProdutos = estruturaProdutos;
	}

	public RepositorioEstruturaProduto getRepositorioEstruturaProduto() {
		return repositorioEstruturaProduto;
	}

	public void setRepositorioEstruturaProduto(
			RepositorioEstruturaProduto repositorioEstruturaProduto) {
		this.repositorioEstruturaProduto = repositorioEstruturaProduto;
	}
}
