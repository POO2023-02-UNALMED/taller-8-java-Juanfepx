public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }


    public String toString() {
        return "El futbolista" + this.nombre + "tiene" + "edad" + this.edad + "y juega de" + this.posicion;
    }

    public boolean equals(Futbolista f) {
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);

    }
    
    public int compareTo(Futbolista o) {
        return 0;

    }

    public abstract void jugarConLasManos();
}
