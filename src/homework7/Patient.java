package homework7;

public class Patient {

    private HealthPlan healthPlan;
    private Doctor doctor;

    public Patient(HealthPlan healthPlan) {
        this.healthPlan = healthPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        System.out.println("Назначаем доктора...");
        this.doctor = doctor;
    }

    public HealthPlan getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(HealthPlan healthPlan) {
        this.healthPlan = healthPlan;
    }
}
