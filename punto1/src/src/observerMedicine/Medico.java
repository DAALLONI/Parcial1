package observerMedicine;

import java.util.EnumSet;
import java.util.Set;

public abstract class Medico implements Observer {

    private String nombre;
    private Set<TipoEvento> eventosInteres;

    public Medico(String nombre, TipoEvento... eventos) {

        this.nombre = nombre;
        this.eventosInteres = EnumSet.noneOf(TipoEvento.class);
        for (TipoEvento evento : eventos) {
            eventosInteres.add(evento);
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void update(Evento evento) {

        if (eventosInteres.contains(evento.getTipo())) {
            System.out.println("\nALERTA para " + nombre);
            procesarEvento(evento);
        }
    }

    public abstract void procesarEvento(Evento evento);

    @Override
    public void suscribirse(CentralMonitoreo central) {
        central.suscribir(this);
    }

    @Override
    public void desuscribirse(CentralMonitoreo central) {
        central.desuscribir(this);
    }
}

