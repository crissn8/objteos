package edu.upc.eetac.dsa.csanchez.exercice2;

public class PruebaFormas {
	public static void main(String[] args){
		
		Forma[] s = new Forma[3];
		s[0] = new Forma();
	
		
		//circulo
		s[1] = new Circulo();
	
		//cuadrado
		
		s[2] = new Cuadrado();
	
		
		for(int i = 0; i<s.length;i++ )
			s[i].queES();
	}

}
