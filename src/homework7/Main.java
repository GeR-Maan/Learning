package homework7;

public class Main {

    public static void main(String[] args) {
        //Создаем пациента с планом, и терапевта
        HealthPlan plan = new HealthPlan(2);
        Patient patient = new Patient(plan);

        Therapist therapist = new Therapist();
        // Назначаем доктора пациенту
        therapist.setDoctor(patient);

    }


}
