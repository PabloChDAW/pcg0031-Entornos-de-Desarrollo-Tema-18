public class Pagina {
    // Atributos
    private int numPag;
    private String contenido;

    // Constructor
    public Pagina(int numPag, String contenido) {
        this.numPag = numPag;
        this.contenido = contenido;
    }

    // Métodos de acceso
    public int getNumPag() {
        return this.numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    // Método toString
    @Override
    public String toString() {
        return "Página: " + numPag + ", Contenido: " + contenido;
    }
}
