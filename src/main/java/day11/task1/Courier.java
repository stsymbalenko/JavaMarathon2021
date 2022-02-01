package day11.task1;

public class Courier implements Worker{
    private final int SALARY = 100;
    private int salary = 0;
    private boolean isPayed = false;

    Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() +1);
        bonus();

    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() == 10000){
            if (isPayed == false){
                salary = salary + 50000;
                System.out.println("Бонус был выплачен!!!");
                System.out.println("--------------------------------------------------------");
            }else{
                System.out.println("Бонус уже был выплачен");
            }
            isPayed = true;
        }else if(warehouse.getCountDeliveredOrders() > 10000){
            System.out.println("Бонус уже был выплачен");
        }else{
            System.out.println("Бонус пока не доступен");
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "SALARY=" + SALARY +
                ", warehouse=" + warehouse +
                '}';
    }
}
