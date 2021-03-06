package com.bartoszwalter.students.taxes;

import org.junit.Assert;
import org.junit.Test;

public class TaxCalculatorTest {

	@Test
	public void test(){
		TaxCalculator calc = new TaxCalculator();
		calc.umowa = 'P';
		double podstawa = 5000;
		calc.podstawa = podstawa;		
		
		Umowa umowaPraca = new UmowaPrace(podstawa);
		umowaPraca.oblicz();
		Assert.assertEquals(umowaPraca.getWynagrodzenie(), calc.main(null), 0);
	}
	
	@Test
	public void test2(){
		TaxCalculator calc = new TaxCalculator();
		calc.umowa = 'Z';
		calc.podstawa = 5500;
		
		Umowa umowaZlecenie = new UmowaZlecenie(5500);
		umowaZlecenie.oblicz();
		Assert.assertEquals(umowaZlecenie.getWynagrodzenie(), calc.main(null), 0);
	}
}
