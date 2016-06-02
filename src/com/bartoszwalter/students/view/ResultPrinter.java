package com.bartoszwalter.students.view;

import java.text.DecimalFormat;

import com.bartoszwalter.students.taxes.Umowa;
import com.bartoszwalter.students.taxes.UmowaPrace;

public class ResultPrinter {
	private DecimalFormat df00 = new DecimalFormat("#.00");
	private DecimalFormat df = new DecimalFormat("#");
	private Umowa umowa;

	public ResultPrinter(Umowa umowa) {
		this.umowa = umowa;
	}

	public void print() {
		
		
	 
		 System.out.println(umowa.printType());
	 
		System.out.println("Podstawa wymiaru skĹ‚adek " + umowa.getPodstawa());

		System.out.println("SkĹ‚adka na ubezpieczenie emerytalne " + df00.format(umowa.getS_emerytalna()));
		System.out.println("SkĹ‚adka na ubezpieczenie rentowe    " + df00.format(umowa.getS_rentowa()));
		System.out.println("SkĹ‚adka na ubezpieczenie chorobowe  " + df00.format(umowa.getU_chorobowe()));
		System.out.println("Podstawa wymiaru skĹ‚adki na ubezpieczenie zdrowotne: " + umowa.getoPodstawa());

		System.out.println("SkĹ‚adka na ubezpieczenie zdrowotne: 9% = " + df00.format(umowa.getS_zdrow1()) + " 7,75% = "
				+ df00.format(umowa.getS_zdrow2()));
		System.out.println("Koszty uzyskania przychodu w staĹ‚ej wysokoĹ›ci " + umowa.getKosztyUzyskania());
		System.out.println("Podstawa opodatkowania " + umowa.getPodstawaOpodat() + " zaokrÄ…glona " + df.format(umowa.getPodstawaOpodat0()));
		System.out.println("Zaliczka na podatek dochodowy 18 % = " + umowa.getZaliczkaNaPod());
		System.out.println("Kwota wolna od podatku = " + umowa.getKwotaZmiejsz());
		System.out.println("Podatek potrÄ…cony = " + df00.format(umowa.getPodatekPotracony()));
		System.out.println("Zaliczka do urzÄ™du skarbowego = " + df00.format(umowa.getZaliczkaUS()) + " po zaokrÄ…gleniu = "
				+ df.format(umowa.getZaliczkaUS0()));
		System.out.println();
		System.out.println("Pracownik otrzyma wynagrodzenie netto w wysokoĹ›ci = " + df00.format(umowa.getWynagrodzenie())); 
	}
}
