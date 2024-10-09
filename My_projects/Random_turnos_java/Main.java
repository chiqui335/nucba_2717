package My_projects.Random_turnos_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        AgendaMedica agenda = new AgendaMedica();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        boolean continuar = true;
        while (continuar) {
            String[] opciones = {"Agregar Turno", "Reservar Turno", "Cancelar Turno", "Listar Turnos", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Sistema de Turnos Médicos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Agregar Turno
                    String paciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
                    String fechaHoraStr = JOptionPane.showInputDialog("Ingrese la fecha y hora del turno (yyyy-MM-dd HH:mm):");
                    LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraStr, formatter);
                    agenda.agregarTurno(paciente, fechaHora);
                    break;

                case 1: // Reservar Turno
                    paciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
                    fechaHoraStr = JOptionPane.showInputDialog("Ingrese la fecha y hora del turno a reservar (yyyy-MM-dd HH:mm):");
                    fechaHora = LocalDateTime.parse(fechaHoraStr, formatter);
                    agenda.reservarTurno(paciente, fechaHora);
                    break;

                case 2: // Cancelar Turno
                    paciente = JOptionPane.showInputDialog("Ingrese el nombre del paciente:");
                    fechaHoraStr = JOptionPane.showInputDialog("Ingrese la fecha y hora del turno a cancelar (yyyy-MM-dd HH:mm):");
                    fechaHora = LocalDateTime.parse(fechaHoraStr, formatter);
                    agenda.cancelarTurno(paciente, fechaHora);
                    break;

                case 3: // Listar Turnos
                    String turnos = agenda.listarTurnos();
                    JOptionPane.showMessageDialog(null, turnos, "Turnos Disponibles", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 4: // Salir
                    continuar = false;
                    break;

                default:
                    break;
            }
        }
    }
}
