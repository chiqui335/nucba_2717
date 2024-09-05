package My_projects.Random_turnos_java;

import java.time.LocalDateTime;

public class Turno {
    private String paciente;
    private LocalDateTime fechaHora;
    private boolean disponible;

    public Turno(String paciente, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.fechaHora = fechaHora;
        this.disponible = true;
    }

    public String getPaciente() {
        return paciente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservarTurno() {
        if (disponible) {
            disponible = false;
            System.out.println("Turno reservado para " + paciente + " el " + fechaHora);
        } else {
            System.out.println("El turno no está disponible.");
        }
    }

    public void cancelarTurno() {
        if (!disponible) {
            disponible = true;
            System.out.println("Turno cancelado para " + paciente);
        } else {
            System.out.println("El turno ya está disponible.");
        }
    }

    @Override
    public String toString() {
        return "Turno para " + paciente + " el " + fechaHora + " - " + (disponible ? "Disponible" : "Reservado");
    }
}
