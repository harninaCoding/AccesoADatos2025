package binarios07facade.PersonaBinarioIII;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class AdecuadorSocioText implements Adecuador<List<Socio>, Socio, BufferedReader, BufferedWriter> {

    private final char token = ';';
    private final String sep = System.lineSeparator();

    @Override
    public boolean graba(BufferedWriter flujoW, Socio socio) {
        try {
            StringBuilder sb = new StringBuilder()
                .append(socio.getId()).append(token)
                .append(Double.toString(socio.getSaldo())).append(token)
                .append(Integer.toString(socio.getAnnoInscripcion()))
                .append(sep);
            flujoW.append(sb);
            return true;
        } catch (IOException e) {
            // Log si procede
            return false;
        }
    }

    @Override
    public List<Socio> recupera(BufferedReader flujoR) throws IOException {
        List<Socio> lista = new ArrayList<>();
        String linea;
        final String splitter = Pattern.quote(Character.toString(token)); // por si el token fuera especial

        while ((linea = flujoR.readLine()) != null) {
            if (linea.isEmpty()) continue;
            String[] p = linea.split(splitter, -1); // -1 conserva vacíos
            if (p.length != 3) continue;            // línea mal formada → se omite

            String id = p[0].trim();
            double saldo = Double.parseDouble(p[1].trim());
            int anno = Integer.parseInt(p[2].trim());

            lista.add(new Socio(id, saldo, anno));
        }
        return lista;
    }
}
