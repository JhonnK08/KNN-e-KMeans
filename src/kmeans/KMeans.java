package kmeans;

import java.io.File;
import java.io.IOException;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

public class KMeans {
    private int k;
    private int atributos;
    private ArrayList<Ponto> pontos;
    private ArrayList<Ponto> centroides;
    //private double centroides;
    private String quantdados;
    
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
    
    
    public void iniciarCentroides(ArrayList <Ponto> centroide, int k, int atributos) { 
        Random random = new Random();
        for(int i = 0; i < k; i++) {
            Ponto centro = new Ponto();
            double [] coordenadas = new double[atributos];

            //coordenadas aleatórias do ponto
            for(int j = 0; j < k; j++){
                coordenadas[j] = random.nextDouble();
            }
            centro.setAtributos(coordenadas);
            
            //adicionando ao arraylist
            centroide.add(i, centro);
        }
    }
    
    //Calcula a distancia euclidiana entre dois pontos
    public double calculaDistancia(Ponto cluster , Ponto ponto){
        double distancia = 0;
        for(int j = 0; j < atributos; j++){
            distancia += Math.pow(Math.abs(ponto.getAtributos()[j] - cluster.getAtributos()[j]), 2);            
        }     
        return Math.sqrt(distancia);
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
