public class Guerrero extends Personaje {


    public Guerrero(String nombre, int salud, int ataque, int defensa, int habilidadEspecial) {
        super(nombre, salud, ataque, defensa, habilidadEspecial);
    }

    @Override
    public void metodoDefensa(int ataqueRecibido) {
        if (this.getHabilidadEspecial() > 0) {
            int ataque = this.getHabilidadEspecial() * this.getAtaque();
            int ataqueEspecial = this.getHabilidadEspecial() - 1;

            this.setAtaque(ataque);
            this.setHabilidadEspecial(ataqueEspecial);
        }
        this.setSalud((this.getSalud() - ataqueRecibido) + this.getDefensa());

    }
}
