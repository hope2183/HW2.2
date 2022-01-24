package ru.skypro;

public abstract class MotorTransport extends WheeledTransport{
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void service (){
        super.service();
        checkEngine();
    }
}
