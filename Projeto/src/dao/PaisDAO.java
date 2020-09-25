package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pais;

public class PaisDAO {


	public void criar(Pais to) {
		String sqlInsert = "INSERT INTO pais (nome, populacao, area) VALUES (?, ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, to.getNome());
			stm.setLong(2, to.getPopulacao());
			stm.setDouble(3, to.getArea());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					to.setId(rs.getInt(1));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Pais to) {
		String sqlUpdate = "UPDATE pais SET nome=?, populacao=?, area=? WHERE id=?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, to.getNome());
			stm.setLong(2, to.getPopulacao());
			stm.setDouble(3, to.getArea());
			stm.setInt(4, to.getId());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Pais to) {
		String sqlDelete = "DELETE FROM pais WHERE id = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, to.getId());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Pais carregar(int id) {
		Pais to = new Pais();
		String sqlSelect = "SELECT nome, populacao, area FROM pais WHERE id = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, id);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					to.setId(id);
					to.setNome(rs.getString("nome"));
					to.setPopulacao(rs.getLong("populacao"));
					to.setArea(rs.getDouble("area"));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} catch(SQLException el) {
			System.out.print(el.getStackTrace());
		}
		return to;
	}
	
	public Pais maiorPopulacao() {
		Pais to = new Pais();
		String sqlSelect = "SELECT id, MAX(populacao) FROM pais";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				ResultSet rs = stm.executeQuery();) {
			if (rs.next()) {
				to.setId(rs.getInt("id"));
				to.setNome(rs.getString("nome"));
				to.setPopulacao(rs.getLong("populacao"));
				to.setArea(rs.getDouble("area"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return to;
	}
	
	public Pais menorArea() {
		Pais to = new Pais();
		String sqlSelect = "SELECT id, MIN(area) FROM pais";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				ResultSet rs = stm.executeQuery();) {
			if (rs.next()) {
				to.setId(rs.getInt("id"));
				to.setNome(rs.getString("nome"));
				to.setPopulacao(rs.getLong("populacao"));
				to.setArea(rs.getDouble("area"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return to;
	}
	
	public ArrayList<Pais> vetorTresPaises() {
		ArrayList<Pais> array = new ArrayList<Pais>();
		String sqlSelect = "SELECT id FROM pais LIMIT 3";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				ResultSet rs = stm.executeQuery();) {
			if (rs.next()) {
				while (rs.next()) {
					Pais pais = new Pais();
					pais.setId(rs.getInt("id"));
					pais.setNome(rs.getString("nome"));
					pais.setPopulacao(rs.getLong("populacao"));
					pais.setArea(rs.getDouble("area"));
					array.add(pais);
				}
				return array;
			} else {
				return null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return array;
	}
	
	public List<Pais> listar() {
		String sql = "SELECT * FROM pais";
		List<Pais> paises = new ArrayList<>();
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();) {
			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				long populacao = rs.getLong("populacao");
				double area = rs.getDouble("area");
				Pais pais = new Pais();
				pais.setId(id);
				pais.setNome(nome);
				pais.setPopulacao(populacao);
				pais.setArea(area);
				paises.add(pais);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return paises;
	}
	
}
