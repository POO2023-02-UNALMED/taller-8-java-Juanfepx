package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public String toString() {
        return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;

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

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    @Override
    public int compareTo(Object o) {
        Portero a = (Portero) o;
        return Math.abs((this.golesRecibidos - a.getGolesRecibidos()));
    }
}