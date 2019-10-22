/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.util.ArrayList;

/**
 *
 * @author Jhonatan
 */
public class Knn {

    /**
     * @param args the command line arguments
     */
    //Declaração dos 3
    /*private Float distanciaDoisPontos(float[] Elementos1, float[] Elementos2) {
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
    */
    
    
    
    public static int k = 3;
    
    public static double distance(PontoKnn o, PontoKnn ref){
        return (((o.x - ref.x) * (o.x - ref.x)) + ((o.y - ref.y) * (o.y - ref.y)) + ((o.z - ref.z)*(o.z - ref.z)));
    }
    
    
    public static int kNN(PontoKnn o, ArrayList<PontoKnn> p){
        int[] indices = new int[k];
        System.out.println("ind:"+indices);
        double[] mins = new double[k];
        for (int i=0; i<k; i++){
            mins[i] = Double.MAX_VALUE;
        }
        
        for(int i=0; i<p.size(); i++){
            double dist = distance(o, p.get(i));
            double max = Double.MIN_VALUE;
            int maxID = 0;
            for(int j=0; j<k; j++){
                if(max<mins[j]){
                    max=mins[j];
                    maxID = j;
                }
                if(mins[maxID] > dist) {
                    mins[maxID] = dist;
                    indices[maxID] = i;
                }
            }
        }
            
            int a=0;
            int b=0;
            
            for(int i=0; i<k; i++){
                if(p.get(indices[i]).ponto == 0){
                    a++;
                }else{
                    b++;
                }
            }
            
                    
            if(a>b){
                
                return 1;
                /*Amostra nova:
                10,20,30
                Classe: 1 (100%)
                k (3) mais similares:
                10,20,30,1 (100 %)
                10,20,25,1 (90 %)
                5,10,25,1 (50 %)*/
            }else{
                System.out.println("Amostra Nova : "+o.x+","+o.y+","+o.z);
                System.out.println("Classe : "+o.ponto);
                
                return 2;
            }
    }
    /*
    1,10,20,30,1
    2,15,25,30,2
    3,10,20,25,1
    4,5,10,25,1
    */
   /*
    
    */
    public static void main(String[] args) {
        ArrayList<PontoKnn> p = new ArrayList<PontoKnn>();
        
        p.add(new PontoKnn(10,20,30,1));
	p.add(new PontoKnn(15,25,30,2));
	p.add(new PontoKnn(10,20,25,1));
	p.add(new PontoKnn(5,10,25,1));
        
        PontoKnn o = new PontoKnn(10,20,30);
        
        System.out.println(kNN(o, p));
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
