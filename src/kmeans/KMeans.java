package kmeans;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

public class KMeans {
    private int k;
    private ArrayList<Ponto> pontos;
    private String dados;
    private double centroides;
    public KMeans() {
    }
    
    
    
    public static void main(String[] args) {
        KMeans kmeans = new KMeans();
        String dados;
        
        //Solicitando ao usuário que informe K
        kmeans.setK(Integer.parseInt(JOptionPane.showInputDialog("Informe o k: ")));
        System.out.println("k = " + kmeans.getK());
        
        //Solicitando e formatando dados
        dados = JOptionPane.showInputDialog("Informe os dados separados em vírgula: ");
        System.out.println("Dados = " + dados);
        String rdados = dados.replace(",", "");
        System.out.println(rdados);
        
        int ndados[] = new int[rdados.length()];
        
        for(int i = 0;i < rdados.length(); i++){
            char c = rdados.charAt(i);
            ndados[i] = Integer.parseInt(String.valueOf(c));
        }
        //System.out.println(ndados.toString());
        int ultimo=ndados.length;
        System.out.println(ultimo);

        //Criacao da matriz de distancias de acordo com K
        
        //Criar pontos randomicos dentro da base de dados
        
        
        //Comparar todas as distancias
        
        //Atribuir ao cluster mais proximo
        
        //Fazer a media de distancia entre os pontos
        
        //Realizar o calculo novamente  utilizando a media dos dados como pontos

    }

    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public double getMatriz() {
        return matriz;
    }

    public void setMatriz(float matriz) {
        this.matriz = matriz;
    }
    
    private double[] iniciaCentroide(double[] dados, int k) { 
            Random random = new Random();
            double [] centroides = null;
            for (int i = 0; i < k; i++) {
                centroides[i] = random.nextDouble();
            }
            return centroides;
    }

    

    
//    private double calculaDistancia (){
//        float seila = 0;
//        double resp = 0;
//        
//        for(int j = 0; j < dimensao; j++){
//            resp += Math.pow(Math.abs(p1.getCoordenadas()[j] - p2.getCoordenadas()[j]), 2);            
//        }     
//        return Math.sqrt(resp);
//        
//        return seila;
//    }
}
