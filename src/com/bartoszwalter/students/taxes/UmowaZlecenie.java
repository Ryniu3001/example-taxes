package com.bartoszwalter.students.taxes;

public class UmowaZlecenie extends Umowa {

	public UmowaZlecenie(double podstawa) {
		super(podstawa);
	}

	@Override
	public void oblicz() {
		this.oPodstawa = obliczonaPodstawa(podstawa);
		obliczUbezpieczenia(oPodstawa);
		kwotaZmiejsz = 0;
		kosztyUzyskania = (oPodstawa * 20) / 100;
		this.podstawaOpodat = oPodstawa - kosztyUzyskania;
		this.podstawaOpodat0 = Double.parseDouble(df.format(podstawaOpodat));
		obliczPodatek(podstawaOpodat0);
		this.podatekPotracony = zaliczkaNaPod;
		obliczZaliczke();
		zaliczkaUS0 = Double.parseDouble(df.format(zaliczkaUS));
		this.wynagrodzenie = podstawa - ((s_emerytalna + s_rentowa + u_chorobowe) + s_zdrow1 + zaliczkaUS0);
	}
	@Override
	public String printType() {
	 
		return "Umowa zlecenie";
	}
}
