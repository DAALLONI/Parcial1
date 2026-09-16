package observerMedicine;

public class Main {

    public static void main(String[] args) {

        CentralMonitoreo central =
                new CentralMonitoreo();

        IntensoMedico elena = new IntensoMedico("Elena Ramos");
        JefeMedico andres = new JefeMedico("Andrés Suárez");
        JefeBacterias marta = new JefeBacterias("Marta Gómez");

        elena.suscribirse(central);
        andres.suscribirse(central);
        marta.suscribirse(central);

        Evento evento1 = new Evento (TipoEvento.SignosCriticos,"Paciente P-1","Saturación de oxígeno cayó");
        central.registrarEvento(evento1);


        Evento evento2 = new Evento(TipoEvento.CambioPrioridad,"Paciente P-2","Cambio de prioridad a Código Azul");
        central.registrarEvento(evento2);

        
        Evento evento3 = new Evento(TipoEvento.ExamenUrgente,"Paciente P-3","Homocultivo solicitado con urgencia");
        central.registrarEvento(evento3);
        
        //ejemplo de como sería la desuscripción 
        
        System.out.println("\n>>> Andrés se desuscribe de la central");
        andres.desuscribirse(central);
        
        Evento evento4 = new Evento( TipoEvento.CambioPrioridad,"Paciente P-4","Cambio de prioridad a Código Rojo" );
        central.registrarEvento(evento4);

        // Andrés en teoría ya no recibe esta ultima notificación por lo cual en la salida solo aparece el evento.
    }
}

