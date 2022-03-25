package ConnectDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import Model.Usuario;

public class UsuarioDao {
	
	
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
	
	public static List<Usuario> getAllUsuarios(){
		Connection connect = null;
		List<Usuario> list = new ArrayList<>();
		try {
			connect = getConnection();
		
			Statement statement = connect.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM usuario");
			
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rs.getInt("idUsuario"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setSenha(rs.getString("senha"));
				list.add(usuario);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
