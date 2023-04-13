package com.sodimac.esb.wkslicalcularcostos.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest{
	
	@NotNull(message = "pMoviCias no puede ser nulo")
	@NotEmpty(message = "pMoviCias no puede estar vacio")
	@Size(max = 200, message = "pMoviCias debe ser de 200 caracteres")
	private String pMoviCias;
	
	@NotNull(message = "pMoviCiasOrig no puede ser nulo")
	@NotEmpty(message = "pMoviCiasOrig no puede estar vacio")
	@Size(max = 200, message = "pMoviCiasOrig debe ser de 200 caracteres")
	private String pMoviCiasOrig;
	
	@NotNull(message = "pMoviOficina no puede ser nulo")
	@NotEmpty(message = "pMoviOficina no puede ser vacio")
	@Size(max = 3, message = "pMoviOficina debe ser de 3 caracteres")
	@Pattern(regexp = "(-?[0-9]+)|()$", message = "El campo pMoviOficina debe ser entero")
	private String pMoviOficina;
	
	@NotNull(message = "pMoviNumero no puede ser nulo")
	@NotEmpty(message = "pMoviNumero no puede ser vacio")
	@Pattern(regexp = "-?([0-9]{01,10}+)|()$", message = "El campo pMoviNumero es numero entero de 10 caracteres")
	private String pMoviNumero;
	
	@NotNull(message = "pMoviApliOrig no puede ser nulo")
	@NotEmpty(message = "pMoviApliOrig no puede estar vacio")
	@Size(max = 3, message = "pMoviApliOrig debe ser de 3 caracteres")
	private String pMoviApliOrig;
	
	@NotNull(message = "pMoviAuxiliar no puede ser nulo")
	@Size(max = 200, message = "pMoviAuxiliar debe ser de 200 caracteres")
	private String pMoviAuxiliar;
 
	@NotNull(message = "pMoviCuenta no puede ser nulo")
	@Size(max = 16, message = "pMoviCuenta debe ser de 16 caracteres")
	private String pMoviCuenta;

	@NotNull(message = "pMoviDescripcion no puede ser nulo")
	@Size(max = 200, message = "pMoviDescripcion debe ser de 200 caracteres")
	private String pMoviDescripcion;

	@NotNull(message = "pMoviFecha no puede ser nulo")
	@Size(max = 10, message = "pMoviFecha debe ser de 10 caracteres")
	@NotEmpty(message = "pMoviFecha no puede estar vacio")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "formato de pMoviFecha incorrecto, debe ser yyyy-MM-dd")
	private String pMoviFecha;

	@NotNull(message = "pMoviFpag no puede ser nulo")
	@Size(max = 10, message = "pMoviFpag debe ser de 10 caracteres")
	private String pMoviFpag;

	@NotNull(message = "pMoviOrpaVigencia no puede ser nulo")
	@Size(max = 10, message = "pMoviOrpaVigencia debe ser de 10 caracteres")
	@Pattern(regexp = "(-?[0-9]+)|()$", message = "El campo pMoviOrpaVigencia es entero")
	private String pMoviOrpaVigencia;

	@NotNull(message = "pMoviUsuaCrea no puede ser nulo")
	@Size(max = 20, message = "pMoviUsuaCrea debe ser de 20 caracteres")
	private String pMoviUsuaCrea;

	@NotNull(message = "pMoviValor no puede ser nulo")
	@NotEmpty(message = "pMoviValor no puede estar vacio")
	@Pattern(regexp = "^(-?[0-9]{01,20}+(\\.[0-9][0-9]?)?)|()$", message = "El campo pMoviValor es numerico de menor o igual a 20 digitos y con maximo dos decimales")
	private String pMoviValor;

	public String getpMoviApliOrig() {
		return pMoviApliOrig;
	}

	public void setpMoviApliOrig(String pMoviApliOrig) {
		this.pMoviApliOrig = pMoviApliOrig;
	}

	public String getpMoviAuxiliar() {
		return pMoviAuxiliar;
	}

	public void setpMoviAuxiliar(String pMoviAuxiliar) {
		this.pMoviAuxiliar = pMoviAuxiliar;
	}

	public String getpMoviCias() {
		return pMoviCias;
	}

	public void setpMoviCias(String pMoviCias) {
		this.pMoviCias = pMoviCias;
	}

	public String getpMoviCiasOrig() {
		return pMoviCiasOrig;
	}

	public void setpMoviCiasOrig(String pMoviCiasOrig) {
		this.pMoviCiasOrig = pMoviCiasOrig;
	}

	public String getpMoviCuenta() {
		return pMoviCuenta;
	}

	public void setpMoviCuenta(String pMoviCuenta) {
		this.pMoviCuenta = pMoviCuenta;
	}

	public String getpMoviDescripcion() {
		return pMoviDescripcion;
	}

	public void setpMoviDescripcion(String pMoviDescripcion) {
		this.pMoviDescripcion = pMoviDescripcion;
	}

	public String getpMoviFecha() {
		return pMoviFecha;
	}

	public void setpMoviFecha(String pMoviFecha) {
		this.pMoviFecha = pMoviFecha;
	}

	public String getpMoviFpag() {
		return pMoviFpag;
	}

	public void setpMoviFpag(String pMoviFpag) {
		this.pMoviFpag = pMoviFpag;
	}

	public String getpMoviNumero() {
		return pMoviNumero;
	}

	public void setpMoviNumero(String pMoviNumero) {
		this.pMoviNumero = pMoviNumero;
	}

	public String getpMoviOficina() {
		return pMoviOficina;
	}

	public void setpMoviOficina(String pMoviOficina) {
		this.pMoviOficina = pMoviOficina;
	}

	public String getpMoviOrpaVigencia() {
		return pMoviOrpaVigencia;
	}

	public void setpMoviOrpaVigencia(String pMoviOrpaVigencia) {
		this.pMoviOrpaVigencia = pMoviOrpaVigencia;
	}

	public String getpMoviUsuaCrea() {
		return pMoviUsuaCrea;
	}

	public void setpMoviUsuaCrea(String pMoviUsuaCrea) {
		this.pMoviUsuaCrea = pMoviUsuaCrea;
	}

	public String getpMoviValor() {
		return pMoviValor;
	}

	public void setpMoviValor(String pMoviValor) {
		this.pMoviValor = pMoviValor;
	}

	}
