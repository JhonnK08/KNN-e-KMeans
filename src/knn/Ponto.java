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
public class Ponto {
    
    private int id;
    private double [] atributos;
    private int classe;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the atributos
     */
    public double[] getAtributos() {
        return atributos;
    }

    /**
     * @param atributos the atributos to set
     */
    public void setAtributos(double[] atributos, double[] atributos2, double[] atributos3) {
        this.atributos = atributos;
    }

    /**
     * @return the classe
     */
    public int getClasse() {
        return classe;
    }

    /**
     * @param classe the classe to set
     */
    public void setClasse(int classe) {
        this.classe = classe;
    }
    
}
