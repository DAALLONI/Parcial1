package observerMedicine;

public class JefeBacterias extends Medico{
	
	public JefeBacterias(String nombre) {
        super(nombre,TipoEvento.ExamenUrgente);
    }
	
	@Override
	public void procesarEvento(Evento evento) {

	    System.out.println("Jefe bacterioglogía: " + getNombre());
	    System.out.println("Paciente crítico: " + evento.getPaciente());
	    System.out.println("Acción: evaluar inmediatamente al paciente y tomar muestras para analisis.");
	    System.out.println("Detalle: " + evento.getDescripcion());
	    
	}
}