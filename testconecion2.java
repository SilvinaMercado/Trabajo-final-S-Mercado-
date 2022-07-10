package cine.repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testconecion2 {
	public static void main(String[] args) {
		conecion2 conexion = new conecion2();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM pelicula");
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String titulo = rs.getString(2);
				String genero = rs.getString(3);
				int duracion = rs.getInt(4);
				String clasificacion = rs.getString(5);
				String sinopsis = rs.getString(6);
				String idioma = rs.getString(7);
				
				System.out.println(id + " - " + titulo + " - " + genero+ " - " + duracion + " - " + clasificacion+" - "+sinopsis+" - "+idioma);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}



