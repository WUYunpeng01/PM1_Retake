package W8S5CM;

public class Assistant extends Dentist {
    public void refreshAppointment(String patientName, String timestamp) {
        this.appointment.stream().filter(x -> x.contains(patientName))
                .findFirst().ifPresentOrElse(x -> {
                    int i = this.appointment.indexOf(x);
                    this.appointment.set(i, patientName + " " + timestamp);
                }, () -> {
                });
    }
}
