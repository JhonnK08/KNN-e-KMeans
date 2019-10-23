/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan, João Victor
 */
public class Knn {
    
    public static int k = 3;
    
  
    //calculo distância euclidiana
    public static double distance(PontoKnn o, PontoKnn ref){
        return (((o.getX() - ref.getX()) * (o.getX() - ref.getX())) + ((o.getY() - ref.getY()) * (o.getY() - ref.getY())) + ((o.getZ() - ref.getZ())*(o.getZ() - ref.getZ())));
    }
    
    
    public static int kNN(PontoKnn o, ArrayList<PontoKnn> p){
        
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
        System.out.println(kNN(o,p));
    }
    
    
}
