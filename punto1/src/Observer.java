public interface Observer {

    void update(Evento evento);

    void suscribirse(CentralMonitoreo central);

    void desuscribirse(CentralMonitoreo central);
}
