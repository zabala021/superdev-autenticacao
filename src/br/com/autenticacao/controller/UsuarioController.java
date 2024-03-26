package br.com.autenticacao.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.autenticacao.DAO.GenericDAO;
import br.com.autenticacao.DAO.UsuarioDAOImpl;
import br.com.autenticacao.model.Usuario;


public class UsuarioController {
	public List<Usuario> listarTodos() {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			List<Usuario> lista = new ArrayList<Usuario>();

			for (Object object : dao.listarTodos()) {
				lista.add((Usuario) object);
			}

			return lista;

		} catch (Exception ex) {
			System.out.println("Problemas na Controller para listar Produtos " + ex.getMessage());
			ex.printStackTrace();
			return null;
		}
	}
	
	public Usuario listarPorId(int id) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			Usuario produto = (Usuario) dao.listarPorId(id);
			return produto;
		} catch (Exception e) {
			System.out.println("Problemas na Controller para listar Produtos " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	public boolean cadastrar(Usuario usuario) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			dao.cadastrar(usuario);
			return true;
		} catch (Exception e) {
			System.out.println("Problemas na Controller para cadastrar Produto" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public boolean alterar(Usuario usuario) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			dao.alterar(usuario);
			return true;
		} catch (Exception e) {
			System.out.println("Problemas na Controller para alterar Produto" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public void excluir(int id) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			dao.excluir(id);
		} catch (Exception e) {
			System.out.println("Problemas na Controller para excluir Produto" + e.getMessage());
			e.printStackTrace();
		}
	}
}