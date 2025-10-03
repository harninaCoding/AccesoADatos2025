package serializacion08.inicio1;


public class Principal {
	//Esta pensado para grabar solo un objeto en cada fichero
	public static void main(String[] args) {
		Cliente federico=new Cliente(10, "fede", true, 34f);
		Cliente current=null;
		Persistencia almacen=new Persistencia("fede.data");
		if(almacen.isEstado()){
			almacen.grabar(federico);
			current=(Cliente) almacen.leer();
			System.out.println(current.getNombre());
			System.out.println(current.vivo);
		}
	}
}
