package kmeans;

import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

public class KMeans {
    private int k;
    private float matriz;
    private String dados;
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
        String rdados = dados.replace(",", "").trim();
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
        
        //Realizar o calculo novamente  utilizando a media ddos dados como pontos

    }

    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public float getMatriz() {
        return matriz;
    }

    public void setMatriz(float matriz) {
        this.matriz = matriz;
    }
    
    private float[] iniciaCentroide(float[] dados, int k) { 
            Random random = new Random();
            float [] centroides = null;
            for (int i = 0; i < k; i++) {
                centroides[i] = random.nextFloat();
            }
            return centroides;
    }
    
    
    private float[][] populaMatriz(int[] dados, int k){
        float [][] matriz = new float [dados.length][k];
        
       
        
        
        
        return matriz;
    }
    
    private float calculaDistancia (){
        float seila = 0;
        
        
        return seila;
    }
}
