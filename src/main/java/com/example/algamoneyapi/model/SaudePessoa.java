package com.example.algamoneyapi.model;

import java.util.List;

import javax.persistence.Embeddable;

@Embeddable
public class SaudePessoa {
	private boolean diabetes;
	private boolean pressaoAlta;
	private boolean recomendarDoces;
	private boolean recomendarSalgados;
	private boolean restricoesAlimentares; // transformar em lista
	
	public boolean isDiabetes() {
		return diabetes;
	}
	public void setDiabetes(boolean diabetes) {
		this.diabetes = diabetes;
	}
	public boolean isPressaoAlta() {
		return pressaoAlta;
	}
	public void setPressaoAlta(boolean pressaoAlta) {
		this.pressaoAlta = pressaoAlta;
	}
	public boolean isRecomendarDoces() {
		return recomendarDoces;
	}
	public void setRecomendarDoces(boolean recomendarDoces) {
		this.recomendarDoces = recomendarDoces;
	}
	public boolean isRecomendarSalgados() {
		return recomendarSalgados;
	}
	public void setRecomendarSalgados(boolean recomendarSalgados) {
		this.recomendarSalgados = recomendarSalgados;
	}
	public boolean isRestricoesAlimentares() {
		return restricoesAlimentares;
	}
	public void setRestricoesAlimentares(boolean restricoesAlimentares) {
		this.restricoesAlimentares = restricoesAlimentares;
	}
	
	
}
