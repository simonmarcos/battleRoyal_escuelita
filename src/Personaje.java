public abstract class Personaje implements Comparable<Personaje> {

    private String nombre;
    private int salud;
    private int ataque;
    private int defensa;
    private int habilidadEspecial;

    public Personaje(String nombre, int salud, int ataque, int defensa, int habilidadEspecial) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidadEspecial = habilidadEspecial;
    }

    public abstract void metodoDefensa(int ataqueRecibido);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(int habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public int compareTo(Personaje c) {
        return Integer.compare(this.getSalud(), c.getSalud());
    }

    @Override
    public String toString() {
        return nombre +
                " [HP=" + salud +
                "][Ataque=" + ataque +
                "][Defensa=" + defensa +
                "][HabilidadEspecial=" + habilidadEspecial + "]";
    }
}
