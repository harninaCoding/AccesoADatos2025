package binarios07facade.PersonaBinarioIII;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdecuadorPersonaBinario implements Adecuador<List<Persona>, Persona, DataInputStream, DataOutputStream> {

    @Override
    public boolean graba(DataOutputStream out, Persona p) {
        try {
            out.writeUTF(p.getNombre());           // String
            out.writeFloat(p.getDioptrias());      // float
            out.writeBoolean(p.isEnfermo());       // boolean
            out.writeInt(p.getEdad());             // int
            return true;
        } catch (IOException e) {
            // opcional: log
            return false;
        }
    }

    @Override
    public List<Persona> recupera(DataInputStream in) throws IOException {
        List<Persona> lista = new ArrayList<>();
        try {
            while (true) { // leer hasta EOF
                String nombre   = in.readUTF();
                float dioptrias = in.readFloat();
                boolean enfermo = in.readBoolean();
                byte edad        = in.readByte();
                // Ajusta el orden del constructor a tu clase Persona
                lista.add(new Persona(nombre, edad, dioptrias, enfermo));
            }
        } catch (EOFException fin) {
            // fin de fichero
        }
        return lista;
    }
}
