package day11.task1;

public class Picker implements Worker{
    private int salary = 0;
    private final int SALARY = 80;
    private boolean isPayed = false;
    Warehouse warehouse;


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


    @Override
    public void doWork() {
        salary = salary + SALARY;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders()+1);
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000) {
            if (isPayed == false) {
                salary = salary + 70000;
                System.out.println("Бонус был выплачен!!!");
            } else {
                System.out.println("Бонус уже был выплачен");
            }
            isPayed = true;
        } else if (warehouse.getCountPickedOrders() > 10000){
            System.out.println("Бонус уже был выплачен");
        }else{
            System.out.println("Бонус пока не доступен");
        }


    }

    @Override
    public String toString() {
        return "Picker{" +
                "SALARY=" + SALARY +
                ", warehouse=" + warehouse +
                '}';
    }
}
