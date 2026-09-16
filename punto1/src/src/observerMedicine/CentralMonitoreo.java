package observerMedicine;

import java.util.ArrayList;
import java.util.List;

public class CentralMonitoreo {

    private final List<Observer> observers = new ArrayList<>();

    public void suscribir(Observer observer) {

        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Profesional suscrito: " + observer.getClass().getSimpleName());
        }
    }

    public void desuscribir(Observer observer) {

        if (observers.remove(observer)) {
            System.out.println("Profesional desuscrito: " + observer.getClass().getSimpleName());
        }
    }

    public void registrarEvento(Evento evento) {

        System.out.println("\n>>> NUEVO EVENTO");
        System.out.println(evento);
        notificarObservadores(evento);
    }

    private void notificarObservadores(Evento evento) {

        // Se utiliza una copia para evitar problemas si un observador se desuscribe durante la notificación.
    	
        List<Observer> copiaObservadores =  new ArrayList<>(observers);
        for (Observer observer : copiaObservadores) {
            observer.update(evento);
        }
    }
}
