package observerMedicine;

public class IntensoMedico extends Medico {

    public IntensoMedico(String nombre) {
        super(nombre,TipoEvento.SignosCriticos);
    }

    @Override
	public void procesarEvento(Evento evento) {

        System.out.println("Médica intensivista: " + getNombre());
        System.out.println("Paciente crítico: " + evento.getPaciente());
        System.out.println("Acción: evaluar inmediatamente al paciente y ajustar el tratamiento.");
        System.out.println("Detalle: " + evento.getDescripcion());
        
    }
}
