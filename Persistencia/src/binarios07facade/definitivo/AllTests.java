package binarios07facade.definitivo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**********************************************
 * 
 * EL motivo de separar Grabar es porque cada vez que grabamos un objeto cerramos el flujo
 * 
 * 
 * 
 */
@Suite
@SelectClasses({ AdaptadorBinarioPersonaTest.class, AdaptadorTextTest.class })
public class AllTests {

}
