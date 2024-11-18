public class Appointment {


    private String patientName;

    private long patientPhone;

    private String timePeriod;

    private HealthProfessional healthProfessional;


    public Appointment() {
    }

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

    public void print() {
        System.out.println("PatientInfo@timePeriod:'" + timePeriod + '\'' +"  patientName:'" + patientName + '\''+"  patientPhone:" + patientPhone);
        System.out.print("Professional@");
        healthProfessional.print();
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
