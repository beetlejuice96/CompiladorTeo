package org.example;

import java.util.ArrayList;
import java.util.List;

public class Regla {
	private int nroRegla;
	private Object valorRegla;
	private String regla;
	private List<Regla> listaReglas = new ArrayList<>();

	public List<Regla> getListaReglas() {
		return listaReglas;
	}

	public void setListaReglas(List<Regla> listaReglas) {
		this.listaReglas = listaReglas;
	}
	
	public Regla(int nroRegla, Object pro_, String regla){
		this.nroRegla= nroRegla;
		this.valorRegla= pro_;
		this.setRegla(regla);

	}
	
	public int getNroRegla() {
		return nroRegla;
	}
	public void setNroRegla(int nroRegla) {
		this.nroRegla = nroRegla;
	}
	public Object getValorRegla() {
		return valorRegla;
	}
	public void setValorRegla(String valorRegla) {
		this.valorRegla = valorRegla;
	}

	public String getRegla() {
		return regla;
	}

	public void setRegla(String regla) {
		this.regla = regla;
	}

	

}
