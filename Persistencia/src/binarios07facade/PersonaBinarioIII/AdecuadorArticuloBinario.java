package binarios07facade.PersonaBinarioIII;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdecuadorArticuloBinario
		implements Adecuador<List<Articulo>, Articulo, DataInputStream, DataOutputStream> {

	@Override
	public boolean graba(DataOutputStream out, Articulo p) {
		try {
			out.writeInt(p.getId()); // int
			out.writeUTF(p.getNombre()); // String
			out.writeFloat(p.getPrecio()); // float
			return true;
		} catch (IOException e) {
			// opcional: log
			return false;
		}
	}

	@Override
	public List<Articulo> recupera(DataInputStream in) throws IOException {
		List<Articulo> lista = new ArrayList<>();
		try {
			while (true) { // TODO leer hasta EOF
				int id = in.readInt();
				String nombre = in.readUTF();
				Float precio = in.readFloat();
				// Ajusta el orden del constructor a tu clase Persona
				lista.add(new Articulo(id, nombre, precio));
			}
		} catch (EOFException fin) {
			in.close();
			// fin de fichero
		}
		return lista;
	}

}
