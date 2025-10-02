package binarios07facade.definitivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AdecuadorPersonaText implements Adecuador<List<Persona>,Persona,BufferedReader,BufferedWriter> {

	private char token=';';
	
	@Override
	public boolean graba(BufferedWriter flujoW, Persona objeto) {
		StringBuilder transformado=transformacion(objeto);
		try {
			flujoW.append(transformado);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Persona> recupera(BufferedReader flujoR) throws IOException {
		List<Persona> lista = new ArrayList<>();
	    String linea;
	    while ((linea = flujoR.readLine()) != null) {
	        String[] partes = linea.split(String.valueOf(token));
	        if (partes.length == 4) {
	            String nombre = partes[0];
	            float dioptrias = Float.parseFloat(partes[1]);
	            boolean enfermo=Boolean.parseBoolean(partes[2]);
	            byte edad = Byte.parseByte(partes[3]);
	            lista.add(new Persona(nombre,edad, dioptrias,enfermo));
	        }
	    }
	    return lista;
	}

	private StringBuilder transformacion(Persona objeto) {
		StringBuilder transformacion=new StringBuilder();
		transformacion.append(objeto.getNombre()+token);
		transformacion.append(String.valueOf(objeto.getDioptrias())+token);
		transformacion.append(String.valueOf(objeto.isEnfermo())+token);
		transformacion.append(String.valueOf(objeto.getEdad())+"\n");
		return transformacion;
	}
	
}
