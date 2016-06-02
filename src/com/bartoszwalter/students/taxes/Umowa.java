package com.bartoszwalter.students.taxes;

import java.text.DecimalFormat;

public abstract class Umowa {
	protected double podstawa = 0; 
	// składki na ubezpieczenia społeczne
	protected double s_emerytalna = 0; // 9,76% podstawyy
	protected double s_rentowa = 0; // 1,5% podstawy
	protected double u_chorobowe = 0; // 2,45% podstawy
	// składki na ubezpieczenia zdrowotne
	protected double kosztyUzyskania = 111.25;
	protected double s_zdrow1 = 0; // od podstawy wymiaru 9%
	protected double s_zdrow2 = 0; // od podstawy wymiaru 7,75 %
	protected double zaliczkaNaPod = 0; // zaliczka na podatek dochodowy 18%
	protected double kwotaZmiejsz = 46.33; // kwota zmienjszająca podatek
												// 46,33 PLN
	protected double zaliczkaUS = 0;
	protected double zaliczkaUS0 = 0;
	
	protected double wynagrodzenie;
	protected double podatekPotracony;
	protected double podstawaOpodat;
	protected double podstawaOpodat0;
	protected double oPodstawa;

	
	protected DecimalFormat df00 = new DecimalFormat("#.00");
	protected DecimalFormat df = new DecimalFormat("#");
	
	public Umowa(double podstawa){
		this.podstawa = podstawa;
	}
	
	public abstract void oblicz();
	public abstract String printType();
	
	
	public void obliczZaliczke() {
		zaliczkaUS = zaliczkaNaPod - s_zdrow2 - kwotaZmiejsz;
	}

	public void obliczPodatek(double podstawa) {
		zaliczkaNaPod = (podstawa * 18) / 100;
	}

	public double obliczonaPodstawa(double podstawa) {
		s_emerytalna = (podstawa * 9.76) / 100;
		s_rentowa = (podstawa * 1.5) / 100;
		u_chorobowe = (podstawa * 2.45) / 100;
		return (podstawa - s_emerytalna - s_rentowa - u_chorobowe);
	}

	public void obliczUbezpieczenia(double podstawa) {
		s_zdrow1 = (podstawa * 9) / 100;
		s_zdrow2 = (podstawa * 7.75) / 100;
	}
	
	
	public double getPodstawa() {
		return podstawa;
	}

	public double getS_emerytalna() {
		return s_emerytalna;
	}

	public double getS_rentowa() {
		return s_rentowa;
	}

	public double getU_chorobowe() {
		return u_chorobowe;
	}

	public double getKosztyUzyskania() {
		return kosztyUzyskania;
	}

	public double getS_zdrow1() {
		return s_zdrow1;
	}

	public double getS_zdrow2() {
		return s_zdrow2;
	}

	public double getZaliczkaNaPod() {
		return zaliczkaNaPod;
	}

	public double getKwotaZmiejsz() {
		return kwotaZmiejsz;
	}

	public double getZaliczkaUS() {
		return zaliczkaUS;
	}

	public double getZaliczkaUS0() {
		return zaliczkaUS0;
	}

	public double getWynagrodzenie() {
		return wynagrodzenie;
	}

	public double getPodatekPotracony() {
		return podatekPotracony;
	}

	public double getPodstawaOpodat() {
		return podstawaOpodat;
	}

	public double getPodstawaOpodat0() {
		return podstawaOpodat0;
	}

	public double getoPodstawa() {
		return oPodstawa;
	}

		
}
