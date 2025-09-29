package cohes04temporal;

public class Bussines {
	private PrinterPool printerPool=new PrinterPool();
	private SesssionPool sesssionPool=new SesssionPool();
	private SGBD sgbd=new SGBD();
	
	public boolean startSystem() {
		//importa que se ejecutan a la vez pero no en secuencia
//		return printerPool.begin()&&sesssionPool.init()&&sgbd.start();
		//ambas hacen lo mismo
		return printerPool.begin()&&sgbd.start()&&sesssionPool.init();
	}
}
