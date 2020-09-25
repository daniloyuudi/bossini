package service;

import java.util.ArrayList;
import java.util.List;

import model.Pais;
import dao.PaisDAO;

public class PaisService {


	PaisDAO dao;
	
	public PaisService() {
		dao = new PaisDAO();
	}
	
	public void criar(Pais to) {
		dao.criar(to);
	}
	
	public void atualizar(Pais to) {
		dao.atualizar(to);
	}
	
	public void excluir(Pais to) {
		dao.excluir(to);
	}
	
	public Pais carregar(int id) {
		Pais to = dao.carregar(id);
		return to;
	}
	
	public Pais maiorPopulacao() {
		return dao.maiorPopulacao();
	}
	
	public Pais menorArea() {
		return dao.menorArea();
	}
	
	public ArrayList<Pais> vetorTresPaises() {
		return dao.vetorTresPaises();
	}
	
	public List<Pais> listar() {
		return dao.listar();
	}
	
}
