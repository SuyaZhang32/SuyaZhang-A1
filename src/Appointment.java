/**
 * Represents an appointment information, including patient name, phone number, time period, and selected medical professional
 */
public class Appointment {

    // Member variables to store patient information and appointment details, which is used to store patient information and appointments with medical professionals
    private String patientName;
    // Patient's phone number
    private long patientPhone;
    // Appointment time period
    private String timePeriod;
    // Associated health professional for the appointment
    private HealthProfessional healthProfessional;


    public Appointment() {
    }

    //A full argument constructor used to initialize the Appointment object
    public Appointment(String patientName, long patientPhone, String timePeriod, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timePeriod = timePeriod;
        this.healthProfessional = healthProfessional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appointment that = (Appointment) o;

        if (patientPhone != that.patientPhone) return false;
        if (patientName != null ? !patientName.equals(that.patientName) : that.patientName != null) return false;
        if (timePeriod != null ? !timePeriod.equals(that.getTimePeriod()) : that.getTimePeriod() != null) return false;
        return healthProfessional != null ? healthProfessional.equals(that.getHealthProfessional()) : that.getHealthProfessional() != null;
    }

    // Print the details of the reservation
    public void print() {
        System.out.println("Patient Info:");
        System.out.println("Name: '" + patientName + "' | Phone: " + patientPhone + " | Time Period: '" + timePeriod + "'");
        System.out.println("Professional:");
        if (healthProfessional != null) {
            healthProfessional.print();
        } else {
            System.out.println("No Health Professional assigned.");
        }
    }


    public long getPatientPhone() {
        return patientPhone;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }
}
