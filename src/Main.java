import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Personaje guerrero = new Guerrero("Leónidas", 100, 5, 5, 3);
        Personaje arquero = new Arquero("Robin Hood", 50, 15, 10, 2);
        Personaje mago = new Mago("Merlín", 75, 10, 5, 15);

        List<Personaje> listPersonajes = new ArrayList<>();
        listPersonajes.add(guerrero);
        listPersonajes.add(arquero);
        listPersonajes.add(mago);


        battleRoyal(listPersonajes);
    }

    private static void battleRoyal(List<Personaje> listPersonajes) {

        int personaje = listPersonajes.size();
        int ronda = 1;

        while (personaje > 1) {
            Collections.sort(listPersonajes);
            boolean saludOK = false;
            Personaje atacante = null;

            while (!saludOK) {
                atacante = atacante(listPersonajes);
                saludOK = chequearSalud(atacante);
                if (!saludOK) {
                    listPersonajes.remove(0);
                    personaje--;
                    System.out.println("El personaje: " + atacante + " no puede continuar!");
                }
            }

            System.out.println("Ronda nro " + ronda);

            List<Personaje> defesores = defensores(listPersonajes);

            for (Personaje p : defesores) {
                System.out.println("El personaje: " + atacante.toString() + " atacará a: " + p.toString());
                p.metodoDefensa(atacante.getAtaque());
            }
            ronda++;
        }

        System.out.println("El ganador del torneo es: " + listPersonajes.get((0)).toString());
    }

    private static List<Personaje> defensores(List<Personaje> listPersonajes) {
        List<Personaje> listDefensores = new ArrayList<>(listPersonajes);
        listDefensores.remove(0);
        listDefensores = listDefensores.stream().sorted((o1, o2) -> Integer.compare(o2.getSalud(), o1.getSalud())).collect(Collectors.toList());

        return listDefensores;
    }

    private static Personaje atacante(List<Personaje> listPersonajes) {
        return listPersonajes.get(0);
    }

    private static boolean chequearSalud(Personaje personaje) {
        return (personaje.getSalud() <= 0) ? false : true;
    }
}
