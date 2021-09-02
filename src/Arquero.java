public class Arquero extends Personaje {

    public Arquero(String nombre, int salud, int ataque, int defensa, int habilidadEspecial) {
        super(nombre, salud, ataque, defensa, habilidadEspecial);
    }

    @Override
    public void metodoDefensa(int ataqueRecibido) {
        this.setSalud(this.getSalud() - (ataqueRecibido / this.getHabilidadEspecial()));
    }


}
