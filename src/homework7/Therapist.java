package homework7;

public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Лечение терапевтом начато");
    }

    // присваиваем доктора пациенту исходя из плана лечения пациента
    public void setDoctor(Patient patient) {
        // Получаем код
        int code =patient.getHealthPlan().getCode();
        Doctor assignedDoctor;

        if(code == 1){
            assignedDoctor = new Surgeon();
        } else if(code == 2){
            assignedDoctor = new Dentist();
        } else {
            // указываем что берем этот экземпляр терапевта
            assignedDoctor = this;
        }
        // Назначаем выбранного доктора
        patient.setDoctor(assignedDoctor);
        System.out.println("Доктор назначен, подбор лечения...");
        // Он лечит
        assignedDoctor.heal();

    }

}



