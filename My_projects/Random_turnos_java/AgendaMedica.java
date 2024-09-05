package My_projects.Random_turnos_java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AgendaMedica {
    private List<Turno> turnos;

    public AgendaMedica() {
        this.turnos = new ArrayList<>();
    }

    public void agregarTurno(String paciente, LocalDateTime fechaHora) {
        Turno turno = new Turno(paciente, fechaHora);
        turnos.add(turno);
        System.out.println("Turno agregado: " + turno);
    }

    public String listarTurnos() {
        StringBuilder listado = new StringBuilder();
        for (Turno turno : turnos) {
            listado.append(turno.toString()).append("\n");
        }
        return listado.toString();
    }

    public void reservarTurno(String paciente, LocalDateTime fechaHora) {
        for (Turno turno : turnos) {
            if (turno.getPaciente().equals(paciente) && turno.getFechaHora().equals(fechaHora) && turno.isDisponible()) {
                turno.reservarTurno();
                return;
            }
        }
        System.out.println("Turno no disponible o no encontrado.");
    }

    public void cancelarTurno(String paciente, LocalDateTime fechaHora) {
        for (Turno turno : turnos) {
            if (turno.getPaciente().equals(paciente) && turno.getFechaHora().equals(fechaHora) && !turno.isDisponible()) {
                turno.cancelarTurno();
                return;
            }
        }
        System.out.println("Turno no encontrado o ya estaba disponible.");
    }
}
