public class Mago extends Personaje {

    public Mago(String nombre, int salud, int ataque, int defensa, int habilidadEspecial) {
        super(nombre, salud, ataque, defensa, habilidadEspecial);
    }

    @Override
    public void metodoDefensa(int ataqueRecibido) {

        if (this.getHabilidadEspecial() >= ataqueRecibido) {
            int habilidadEspecial = this.getHabilidadEspecial() - ataqueRecibido;
            this.setHabilidadEspecial(habilidadEspecial);
        } else {
            this.setSalud((this.getSalud() - ataqueRecibido) + this.getDefensa());
        }
    }
}
