package futbol;


public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public String toString() {
        return "El futbolista " + super.getNombre() + " tiene " + super.getEdad() + ", y juega de " + super.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;


    }


    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public int compareTo(Object o) {
        Jugador a = (Jugador) o;
        return Math.abs((this.getEdad() - a.getEdad()));
    }
}
