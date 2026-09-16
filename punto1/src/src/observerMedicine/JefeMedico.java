package observerMedicine;

public class JefeMedico extends Medico{
	
	public JefeMedico(String nombre) {
        super(nombre,TipoEvento.CambioPrioridad);
    }

    @Override
	public void procesarEvento(Evento evento) {

        System.out.println("Jefe Medico: " + getNombre());
        System.out.println("Paciente crítico: "+ evento.getPaciente());
        System.out.println("Acción: evaluar inmediatamente al paciente y ajustar su prioridad para camas.");
        System.out.println("Detalle: " + evento.getDescripcion());
    }
}



