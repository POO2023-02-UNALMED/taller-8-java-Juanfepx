public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public String toString() {
        return "El futbolista" + super.getNombre() + "tiene" + "edad" + super.getEdad() + "y juega de" + super.getPosicion()+"con el dorsal"+this.dorsal+"Ha marcado"+this.golesMarcados;


    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }
}
