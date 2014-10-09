package edu.upc.eetac.dsa.csanchez.exercice1;


class arbol{

    int altura = 0;
    String tipo; 

    public  arbol (int Altura){
    	altura = Altura;
   
    }
 
    public arbol(int Altura, String Tipo){
    	altura = Altura;
    	tipo = Tipo;
    }
 
    public arbol(){
    	
    }

    public arbol(String Tipo){
    	tipo= Tipo;
    }
}

