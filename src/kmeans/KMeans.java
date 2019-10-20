package kmeans;

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
        String rdados = dados.replace(",", "");
        System.out.println(rdados);
        
        int ndados[] = new int[rdados.length()];
        
        for(int i = 0;i < rdados.length(); i++){
            char c = rdados.charAt(i);
            Integer.parseInt(String.valueOf(c));
        }
        System.out.println(ndados.toString());
        int ultimo=         ndados[rdados.length()];
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

    public float getMatriz() {
        return matriz;
    }

    public void setMatriz(float matriz) {
        this.matriz = matriz;
    }
    
    
    public float[][][] populaMatriz(String dados, int k){
        float [][][] matriz = null;
        
        
        return matriz;
    }
}
