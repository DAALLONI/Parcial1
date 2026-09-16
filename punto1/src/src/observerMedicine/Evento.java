package observerMedicine;

import java.time.LocalDateTime;

public class Evento {

    private final TipoEvento tipo;
    private final String paciente;
    private final String descripcion;
    private final LocalDateTime fechaHora;

    public Evento(
            TipoEvento tipo,
            String paciente,
            String descripcion) {

        this.tipo = tipo;
        this.paciente = paciente;
        this.descripcion = descripcion;
        this.fechaHora = LocalDateTime.now();
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    //creacion de el mensaje para ver que pasó
    @Override
    public String toString() {
        return "[" + fechaHora + "] "
                + "Paciente: " + paciente
                + " | " + descripcion;
    }
}
