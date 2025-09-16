package ejecicios01;

class Inmobiliaria {
	// El valor por defecto de riesgo es 0
	int riesgo;
	
	/**
	 * Calcula los a�o que tiene un piso hasta el 2013.
	 * 
	 * @param anno
	 *            a�o de construccion
	 * @return la antiguedad en a�os del piso. Si el a�o es posterior a 2013 o
	 *         la antiguedad mayor que 20 a�os retorna -1
	 */
	int calculaAntiguedad(int anno) {
		int antiguedad = -1;
		if (anno < 2013)
			antiguedad = 2013 - anno;
		if (antiguedad > 20)
			return -1;
		else
			return antiguedad;
	}

	/**
	 * nos dice el valor que tiene cada metro cuadrado de una vivienda
	 * dependiendo del tipo de barrio
	 * 
	 * @param tipo
	 *            tipo de barrio entre a,b o c
	 * @return el valor del metro o -1 si no pertenece a un tipo de barrio
	 *         correcto
	 */
	double estableceValorMetro(char tipo) {
		if (tipo == 'A')
			return 150.5;
		if (tipo == 'B')
			return 280.5;
		if (tipo == 'C')
			return 532.5;
		return -1;
	}

	/**
	 * Calcula el valor del piso dependiendo de su superficie, antig�edad y tipo
	 * de barrio. Cada barrio valora de forma distinta el metro. Cada a�o de
	 * antiguedad resta un 5% del valor del piso.
	 * 
	 * @param superficie
	 *            valor entre 60 y 120, otro valor retorna -1
	 * @param tipoBarrio
	 *            una letra a, b, o c que define el tipo
	 * @param anno
	 *            numero entre 1993 y 2012, otro numero retorna -1
	 * @return el valor final calculado o -1 si no se cumplen las condiciones
	 *         expuestas
	 */
	double valorarPiso(int superficie, char tipoBarrio, int anno) {
		// Aqui puede haber un error si el numero kilometros==0
		double valorMetro = estableceValorMetro(tipoBarrio);
		if (valorMetro == -1)
			return -1;
		else if (superficie >= 60 && superficie <= 120) {
			int antiguedad = calculaAntiguedad(anno);
			if (antiguedad == -1)
				return -1;
			else {
				double valorPiso = superficie * valorMetro;
				valorPiso -= valorPiso * ((double)(antiguedad * 5) / 100);
				return valorPiso;
			}
		} else
			return -1;
	}

	boolean comprobarSuperficie(int superficie) {
		if (superficie >= 60 && superficie <= 120)
			return true;
		else
			return false;
	}

	/**
	 * Calcula los impuestos que un piso debe pagar dependiendo de su superficie
	 * y tipo de barrio. los tramos de impuestos son: 50� por metro tipo A 1200�
	 * por metro tipo B 5000� por metro tipo C
	 * 
	 * @param tipoBarrio
	 *            A el m�s humilde y C el m�s lujoso
	 * @param superficie
	 *            valor que condiciona el impuesto, debe estar entre 60 y 120
	 * @return el valor del impuesto o -1 si no pertenece a los tres tipos de
	 *         bario
	 */
	double tasarImpuestos(char tipoBarrio, int superficie) {
		double totalImpuestos = -1;
		tipoBarrio = Character.toUpperCase(tipoBarrio);
		if (estableceValorMetro(tipoBarrio) != -1
				&& comprobarSuperficie(superficie)) {
			if (tipoBarrio == 'A') {
				totalImpuestos = superficie * 50;
			}
			if (tipoBarrio == 'B') {
				totalImpuestos = superficie * 1200;
			}
			if (tipoBarrio == 'C') {
				totalImpuestos = superficie * 5000;
			}
		}
		return totalImpuestos;
	}

	/**
	 * Calcula la viabilidad de un prestamo. Divide el piso entre 240. Si el
	 * porcentaje especificado en la propiedad de la clase, riesgo, de la
	 * rentaBruta del comprador es superior a este calculo, el prestamo es
	 * viable
	 * 
	 * @param rentaBruta
	 *            renta bruta mensual del trabajador
	 * @param valorCoche
	 *            valor total del piso
	 * @return true si cumple con los requisitos especificados y con el valor de
	 *         riesgo o false en caso contrario
	 */
	boolean validarPrestamo(double rentaBruta, double valorCoche) {
		System.out
				.println("debe poner el riesgo entre 5 y 50 siendo 5 el riesgo m�s bajo");
		// se paga en veinte a�os 240 cuotas
		double cuota = valorCoche / 240;
		if ((rentaBruta * riesgo) / 100 > cuota)
			return true;
		else
			return false;

	}

	// Getters & Setters
	int getRiesgo() {
		return riesgo;
	}

	void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}
}
