package tp8;

public class Bourse {

    private long id;
    private String destination;
    private int postesDisponibles;
    private String responsableLocal;

    // Constructeur
    public Bourse(long id, String destination, int postesDisponibles, String responsableLocal) {
        this.id = id;
        this.destination = destination;
        this.postesDisponibles = postesDisponibles;
        this.responsableLocal = responsableLocal;
    }

    // Getters et setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPostesDisponibles() {
        return postesDisponibles;
    }

    public void setPostesDisponibles(int postesDisponibles) {
        this.postesDisponibles = postesDisponibles;
    }

    public String getResponsableLocal() {
        return responsableLocal;
    }

    public void setResponsableLocal(String responsableLocal) {
        this.responsableLocal = responsableLocal;
    }

    // Autres m�thodes si n�cessaire

    @Override
    public String toString() {
        return "Bourse{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", postesDisponibles=" + postesDisponibles +
                ", responsableLocal='" + responsableLocal + '\'' +
                '}';
    }
}
