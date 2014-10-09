package edu.upc.eetac.dsa.csanchez.exercice1;

import java.lang.String;
class exerciceprueba {
    public static void main(String[] args) {

     
        arbol arbol1 = new arbol(4);
        arbol arbol2 = new arbol("roble");
        arbol arbol3 = new arbol();
        arbol arbol4 = new arbol(5,"pino");
        
        System.out.printf(" Un arbol de %d metros.\n", arbol1.altura );  
        System.out.printf(" Un %s.\n", arbol2.tipo );
        System.out.printf(" Un arbol generico.\n", arbol3 );
        System.out.printf(" Un %s de %d metros.\n", arbol4.tipo,arbol4.altura );
    }
}