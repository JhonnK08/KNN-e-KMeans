
package kmeans;

public class Ponto {
    private int id;
    private double [] atributos;
    private int cluster;

    public Ponto() {
    }

    public Ponto(int id, double[] atributos, int cluster) {
        this.id = id;
        this.atributos = atributos;
        this.cluster = cluster;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double[] getAtributos() {
        return atributos;
    }

    public void setAtributos(double[] atributos) {
        this.atributos = atributos;
    }

    public int getCluster() {
        return cluster;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

}
