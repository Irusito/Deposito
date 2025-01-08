package cuentas;
/**
 * Esto sería una cuenta bancaria con nombre, saldo y número de cuenta.
 * Para hacer operaciones básicas de ingresar y retirar dinero.
 * @author RubenPerez
 * @version 1.0
 */
public class CCuenta {

	/** Nombre del titular de la cuenta */
    private String nombre;
    /** Número de la cuenta bancaria */
    private String cuenta;
    /** Saldo disponible */
    private double saldo;
    /** Tipo de interés de la cuenta */
    private double tipoInterés;
    
    /**
     * Constructor por defecto para crear una cuenta sin inicializar valores.
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor parametrizado para crear una cuenta con valores específicos.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Ingresa x cantidad de dinero en una cuenta.
     *
     * @param cantidad es la cantidad a ingresar
     * @throws Exception Si la cantidad es negativa dice eso
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira x cantidad de dinero en una cuenta.
     *
     * @param cantidad es la cantidad a ingresar
     * @throws Exception Si la cantidad es negativa dice eso
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Encapsulación de los atributos anteriores.
     */

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
