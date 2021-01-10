package main;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	
	public static List<Integer> fibonacci() {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		List<Integer> lista = new ArrayList<>();
		lista.add(n1);
		
		while (n1 < 350) {
			lista.add(n2);
			n3 = n1;
			n1 = n2;
			n2 = n1 + n3;
			}
		return lista;
	}

	public static Boolean isFibonacci(Integer numero) {
		if (fibonacci().contains(numero)) {
			return true;
		} else {
			return false;
		}
	}
}

