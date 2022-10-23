/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_datos;

/**
 *
 * @author JENG-PC
 */
public class Tipos_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte a = 1;
       short b =12345;
       int c = 56;
       long d = 45;
       float e = 4.1234567f;
       double f = 4.12345678910111213d;
       char g = 'a';
       boolean h = true;   
       String[] valor = new String[3]; //Arreglo de tipo cadena de caracteres de nombre Valor con tamaño de 3
       String valor1[] = new String[3];//Arreglo de tipo cadena de caracteres de nombre valor1 con tamaño 3 (otra forma de declaracion)
       int valor2[];
       valor2 = new int[2];//Arreglo de tipo Entero de nombre valor2 con tamaño de 2 (Otra manera de declaracion de arreglos)
               
       
       System.out.println("byte: "+a+"\nShort: "+b+"\nint: "+c+"\nlong:"+d+"\nfloat: "+e+"\ndouble: "+f+"\nchar: "+g+"\nboolean: "+h);
       
           
    }
    
}
