/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

/**
 *
 * @author JVict
 */
public class PontoKnn {
    int id, x, y, z, ponto;
    
    public PontoKnn(int id,int x, int y, int z){
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public PontoKnn(int id,int x, int y, int z, int ponto){
        this.id = id;
        this.x = x;
        this.y = y;
        this.z = z;
        this.ponto = ponto;
    }
}