package kmeans;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.ArrayUtils;

public class KMeans {
    private int k;
    private int atributos;
    private ArrayList<Ponto> pontos;
    private ArrayList<Ponto> centroides;
    //private double centroides;
    private String[] quantdados;
    private double[][] dados;
    
    public KMeans() {
    }
    
    
    
    public static void main(String[] args) {
        KMeans kmeans = new KMeans();
        Tela tela = new Tela();
        //Solicitando ao usuário que informe K
        kmeans.setK(Integer.parseInt(JOptionPane.showInputDialog("Informe o k: ")));
        System.out.println("k = " + kmeans.getK());
        String[] cabecalho = tela.getCabecalho();
        kmeans.setAtributos(tela.getCabecalho().length - 1);
        kmeans.setQuantdados(tela.getItens());
        kmeans.setDados(tela.getDados());
        
        //Solicitando e formatando dados
        tela.setVisible(true);
        kmeans.populaPonto(kmeans.getPontos(), kmeans.getAtributos(), kmeans.getQuantdados().length, kmeans.getDados());
        
        //Criar pontos randomicos dentro da base de dados
        kmeans.iniciarCentroides(kmeans.getCentroides(), kmeans.getK(), kmeans.getAtributos());
        //Comparar todas as distancias
        
        //Atribuir ao cluster mais proximo
        
        //Criacao da matriz de distancias de acordo com K
        
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
    
    public void populaPonto(ArrayList <Ponto> pontos, int atributos, int itens, double[][] dados){
        for (int i = 0; i < itens; i++) {
            Ponto ponto = new Ponto();
            double[] vetorDados = null;
            for (int j = 0; j < atributos; j++) {
                vetorDados[j] = dados[i][j];
            }
            ponto.setId(i);
            ponto.setAtributos(vetorDados);
            pontos.add(i, ponto);
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
    
    public void populaCluster(ArrayList <Ponto> pontos, ArrayList <Ponto> centroides) {
        double[] distancias = null;
        for (int i = 0; i < pontos.size(); i++) {
            for (int j = 0; j < centroides.size(); j++) {
                distancias[j] = calculaDistancia(centroides.get(i), pontos.get(i));
            }
            Double[] dArray = ArrayUtils.toObject(distancias);
            List<Double> dList = Arrays.asList(dArray);
            Double menor = Collections.min(dList);
        }
    
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

    public int getAtributos() {
        return atributos;
    }

    public void setAtributos(int atributos) {
        this.atributos = atributos;
    }

    public ArrayList<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(ArrayList<Ponto> pontos) {
        this.pontos = pontos;
    }

    public ArrayList<Ponto> getCentroides() {
        return centroides;
    }

    public void setCentroides(ArrayList<Ponto> centroides) {
        this.centroides = centroides;
    }

    public String[] getQuantdados() {
        return quantdados;
    }

    public void setQuantdados(String[] quantdados) {
        this.quantdados = quantdados;
    }

    public double[][] getDados() {
        return dados;
    }

    public void setDados(double[][] dados) {
        this.dados = dados;
    }
}
