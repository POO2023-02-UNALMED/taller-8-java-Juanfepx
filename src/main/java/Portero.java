public class Portero extends Futbolista {
    short golesRecibidos;
    byte dorsal;

    public String toString() {
        return "El futbolista" + super.getNombre() + "tiene" + "edad" + super.getEdad() + "y juega de" + super.getPosicion() + "con el dorsal" + this.dorsal + "Ha marcado" + this.golesRecibidos;

    }

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;

    }

    @Override
    public int compareTo() {
        return super.compareTo();
    }
}
