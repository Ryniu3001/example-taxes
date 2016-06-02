package com.bartoszwalter.students.taxes;

import com.bartoszwalter.students.view.ResultPrinter;

public class TaxCalculatorAfterRefactor {

	public static void main(String[] args) {
	 
		UmowaPrace umowa=new UmowaPrace(5000);
		ResultPrinter printer=new ResultPrinter(umowa);
		printer.print();
	}

}
