package W8S5CM;

import java.util.ArrayList;

public class Dentist {
    public ArrayList<String> appointment = new ArrayList<>();

    public String getAppointments() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, appointmentSize = appointment.size(); i < appointmentSize; i++) {
            String s = appointment.get(i);
            sb.append(s);
            if (i < appointmentSize - 1)
                sb.append("\r\n");
        }

        return sb.toString();
    }

    public void newAppointment(String patientName, String timestamp) {
        if (appointment.stream().filter(x -> x.contains(patientName)).findAny().isEmpty())
            appointment.add(patientName + " " + timestamp);
    }

    public void resign(String patientName) {
        appointment.removeIf(x -> x.contains(patientName));
    }
}
