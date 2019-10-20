/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.util.Scanner;

/**
 *
 * @author Jhonatan
 */
public class Knn {

    /**
     * @param args the command line arguments
     */
    //Declaração dos 3
    int XCoordenada = 0;
    int YCoordenada = 1;
    int ZCoordenada = 2;
    private Float distanciaDoisPontos(float[] Elementos1, float[] Elementos2) {
    int x1 =  Math.round(Elementos1[XCoordenada]);
    int y1 =  Math.round(Elementos1[YCoordenada]);
    int z1 =  Math.round(Elementos1[ZCoordenada]);
    int x2 =  Math.round(Elementos2[XCoordenada]);
    int y2 =  Math.round(Elementos2[YCoordenada]);
    int z2 =  Math.round(Elementos2[ZCoordenada]);
    int t1 = (x2 - x1) * (x2 - x1);
    int t2 = (y2 - y1) * (y2 - y1);
    int t3 = (z2 - z1) * (z2 - z1);
    int soma = t1 + t2 + t3;
    String somaConv = Integer.toString(soma);
    double somaConvD = Double.parseDouble(somaConv);
    double distancia = Math.abs (Math.sqrt (somaConvD) );
    String distanciaConv = Double.toString(distancia);
    return Float.parseFloat(distanciaConv);
    }
    
    private int achaK () {
    tam = data.tam();
    String tamString = Integer.toString( tam ) ;
    double tamDouble = Double.parseDouble( tamString );
    double distDouble = Math.sqrt( tamDouble );
    double rawK = distDouble / 2 ;
    int num = Math.round( ( float )rawK ) ;
    if ( num%2 != 0 ) {
        return num ;
    }
    else {
        return num - 1 ;
    }
    }
    
    public static void main(String[] args) {
        float[] El1 = 
    }
        /*double x1,y1,x2,y2;
        double p1,p2, distancia;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o x1: ");
        x1 = leitor.nextDouble();
        System.out.println("Digite o y2: ");
        y1 = leitor.nextDouble();
        System.out.println("Digite o x2: ");
        x2 = leitor.nextDouble();
        System.out.println("Digite o y2: ");
        y2 = leitor.nextDouble();
        
        p1 = Math.pow(x2 - x1, 2);
        p2 = Math.pow(y2 - y1, 2);
        
        distancia = Math.sqrt(p1+p2);*/
    
}
