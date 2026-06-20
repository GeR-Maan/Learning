package homework7;

public class Main {

    public static void main(String[] args) {
        //Создаем пациента с планом, и терапевта
        HealthPlan plan = new HealthPlan(2);
        Patient patient = new Patient(plan);

        Therapist therapist = new Therapist();
        // Назначаем доктора пациенту
        therapist.setDoctor(patient);

        System.out.println("-".repeat(30));
        System.out.println();


        // Задача 2

        Apple apple = new Apple("Green");
        System.out.println(apple.getColor());
    }


}
