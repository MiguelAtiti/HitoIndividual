package cuestion3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Principal {
 
	
	public static void main(String[] args) {
		
		int notas=0;
		
		
		
		// Paso 1: Cargar el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No se ha encontrado el driver para MySQL");
			return; 
		}
		System.out.println("Se ha cargado el Driver de MySQL");
		
		// Paso 2: Establecer conexión con la base de datos
		String cadenaConexion = "jdbc:mysql://localhost:3306/supermercado";
		String user = "root";
		String pass = ""; 
		Connection con;
		try {
			con = DriverManager.getConnection(cadenaConexion, user, pass);
		} catch (SQLException e) {
			System.out.println("Error en la conexión con la BD");
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Se ha establecido la conexión con la Base de datos");
		
		//primero insertamos un producto
		
		try {
	    	con = DriverManager.getConnection(cadenaConexion, user, pass);
	    	
	    	 String sql = "insert into productos(idProducto, nombre, fechaEnvasado, unidades, precio, disponible) values(?,?,?,?,?,?)";   
	    	  PreparedStatement ps = con.prepareStatement(sql);
	       ps.setInt(1, 11);
	       ps.setString(2, "leche");
	       ps.setString(3, "2022-04-03");
	       ps.setInt(4, 2);
	       ps.setDouble(5, 2.9);
	       ps.setBoolean(6, false);
	      

	      
	        ps.executeUpdate();

	        System.out.println("datos insertados");

	    } catch (SQLException e) {

	        System.out.println(e.getMessage());

	    } 
		
		//ahora vemos lo que hay en la BBDD
		
	try {
			Statement sentencia = con.createStatement();
			ResultSet rs = sentencia.executeQuery("SELECT * FROM productos");
			System.out.println("Productos");
			while (rs.next()) {
				System.out.print(rs.getString("idProducto"));
				System.out.print(" - "); 
				System.out.print(rs.getString("nombre"));
				System.out.print(" - "); 
				System.out.print(rs.getString("fechaEnvasado"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("unidades"));
				System.out.print(" - "); 
				System.out.print(rs.getInt("precio"));
				System.out.print(" - "); 
				System.out.print(rs.getBoolean("disponible"));
				System.out.println(); 
			}
		} catch (SQLException e) {
			System.out.println("Error al realizar el listado de productos");
			System.out.println(e.getMessage());
		}

		

    
	
	
		
		
		
		
		
		
		
		
	}
}
