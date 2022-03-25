package ConnectDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Motorista;
import Model.Usuario;

public class MotoristaDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conect = null;
		
			Class.forName("org.postgresql.Driver");
			conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Transportadora", "postgres", "admin");
			if(conect != null) {
				System.out.print("Conexão feita com Sucesso!!");
				return conect;
			}
		return null;
	}
	
	public static int cadastrarMotorista(Motorista u) {
		int status = 0;
		try {
			Connection conect = getConnection();
			PreparedStatement ps = conect.prepareStatement("INSERT INTO motorista (nome, cpf, telefone, dataNascimento, endereco, porcComissao, observacao) VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, u.getNome());
			ps.setString(2, u.getCpf());
			ps.setString(3, u.getTelefone());
			ps.setString(4, u.getDataNascimento());
			ps.setString(5, u.getEndereco());
			ps.setFloat(6, u.getPorcComissao());
			ps.setString(7, u.getObservacao());
			
			status = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public static List<Motorista> getAllMotoristas(){
		Connection connect = null;
		List<Motorista> list = new ArrayList<>();
		try {
			connect = getConnection();
		
			Statement statement = connect.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM motorista");
			
			while(rs.next()) {
				Motorista motorista = new Motorista();
				motorista.setIdMotorista(rs.getInt("idmotorista"));
				motorista.setNome(rs.getString("nome"));
				motorista.setCpf(rs.getString("cpf"));
				motorista.setTelefone(rs.getString("telefone"));
				motorista.setDataNascimento(rs.getString("datanascimento"));
				motorista.setEndereco(rs.getString("endereco"));
				motorista.setPorcComissao(rs.getFloat("porccomissao"));
				motorista.setObservacao(rs.getString("observacao"));
				list.add(motorista);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static int deletarMotorista(Motorista u) {
		int status = 0;
		try {
			Connection conect = getConnection();
			PreparedStatement ps = conect.prepareStatement("DELETE FROM motorista WHERE idMotorista=?");
			ps.setInt(1, u.getIdMotorista());
			status = ps.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updateMotorista(Motorista u) {
		int status = 0;
		try {
			Connection conect = getConnection();
			PreparedStatement ps = conect.prepareStatement("UPDATE motorista SET (nome, cpf, telefone, dataNascimento, endereco, porcComissao, observacao) VALUES(?,?,?,?,?,?,?)");
			ps.setString(1, u.getNome());
			ps.setString(2, u.getCpf());
			ps.setString(3, u.getTelefone());
			ps.setString(4, u.getDataNascimento());
			ps.setString(5, u.getEndereco());
			ps.setFloat(6, u.getPorcComissao());
			ps.setString(7, u.getObservacao());
			
			status = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	public static Motorista getEditId(int idMotorista) {
		Motorista motorista = null;
		
		try {
			Connection conect = getConnection();
			PreparedStatement ps = conect.prepareStatement("SELECT * FROM motorista WHERE idMotorista=?");
			ps.setInt(1, idMotorista);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				motorista = new Motorista();
				motorista.setIdMotorista(rs.getInt("idmotorista"));
				motorista.setNome(rs.getString("nome"));
				motorista.setCpf(rs.getString("cpf"));
				motorista.setTelefone(rs.getString("telefone"));
				motorista.setDataNascimento(rs.getString("datanascimento"));
				motorista.setEndereco(rs.getString("endereco"));
				motorista.setPorcComissao(rs.getFloat("porccomissao"));
				motorista.setObservacao(rs.getString("observacao"));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return motorista;
	}

}
