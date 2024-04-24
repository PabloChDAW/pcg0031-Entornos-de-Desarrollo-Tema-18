import java.util.ArrayList;

public class Libro {
    // Atributo
    private ArrayList<Pagina> paginas;

    /**
     * Constructor. Forma una composición fuerte entre el objeto libro
     * y el objeto paginas. Si libro se borrase, se borrarían también
     * sus páginas, pues éstas sólo pueden existir dentro de libro.
     */
    public Libro() {
        paginas = new ArrayList<>();
    }

    // Método de acceso
    public ArrayList<Pagina> getPaginas() {
        return this.paginas;
    }

    /**
     * Método para añadir nueva página. Devuelve un boolean para controlar
     * en main el caso de que ya exista una página con ése número. En tal
     * caso, devuelve false y finaliza.
     * @param numPag Número de la nueva página.
     * @param contenido Contenido de la nueva página.
     * @return Booleano de control.
     */
    public boolean anadirPagina(int numPag, String contenido) {
        // Comprueba si ya existe una página con ese número
        for (int i = 0; i < paginas.size(); i++) {
            if (paginas.get(i).getNumPag() == numPag) {
                return false;
            }
        }
        /**
         * Algoritmo que introduce cada nueva página en el lugar que le
         * corresponde. Primero crea un nuevo elemento al final.
         */
        paginas.add(new Pagina(0, null));
        /**
         * Luego desplaza todas las páginas superiores a la nueva machacando
         * las páginas colindantes, empezando por la última siguiendo
         * por la penúltima, y así sucesivamente hasta llegar al número de
         * página de la nueva página, dejando un hueco libre para ésta.
         */
        int i = paginas.size() - 1;
        while (i > 0 && paginas.get(i - 1).getNumPag() > numPag) {
            paginas.set(i, paginas.get(i - 1));
            i--;
        }
        // Finalmente, inserta la nueva página en el lugar que le corresponde.
        paginas.set(i, new Pagina(numPag, contenido));
        return true;
    }

    /**
     * Método para modificar una página. Recorre el ArrayList para encontrar
     * la página por su numPag y modificar su contenido. En caso de no
     * existir la página, devuelve false y finaliza.
     * @param numPag Número de página de la página que se desea modificar.
     * @param modificacion Nuevo contenido de la página.
     * @return Booleano de control.
     */
    public boolean modificarPagina(int numPag, String modificacion) {
        for (int i = 0; i < paginas.size(); i++) 
            if (paginas.get(i).getNumPag() == numPag) {
                paginas.get(i).setContenido(modificacion);
                return true;
            }
        return false;
    }

    /**
     * Método para mostrar el contenido de una página concreta. Recorre
     * el ArrayList buscando la página con el número de página indicado,
     * y si existe, muestra sus datos en consola. Si no, devuelve false
     * y finaliza.
     * @param numPag Número de la página a mostrar
     * @return Muestra en consola el contenido de la página indicada.
     */
    public boolean mostrarPagina(int numPag) {
        for (int i = 0; i < paginas.size(); i++) {
            if (paginas.get(i).getNumPag() == numPag) {
                System.out.println(paginas.get(i).getContenido());
                return true;
            }
        }
        return false;
    }

    /**
     * Procedimiento que concatena llamadas al toString de Pagina para
     *  mostrar los valores de todos los objetos pagina existentes.
     */
    public void concatenarToString() {
        for (int i = 0; i < paginas.size(); i++) {
            System.out.println(paginas.get(i).toString());
        }
    }

    /**
     * Método para borrar una página concreta. Busca la página recorriendo
     * el ArrayList y, si la encuentra, la borra con el método remove.
     * Si no la encuentra, devuelve false y finaliza.
     * @param numPag
     * @return
     */
    public boolean borrarPagina(int numPag) {
        for (int i = 0; i < paginas.size(); i++) 
            if (paginas.get(i).getNumPag() == numPag) {
                paginas.remove(i);
                return true;
            }
        return false;
    }
}
