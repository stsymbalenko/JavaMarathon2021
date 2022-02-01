package day11.task1;

public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();

        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);

        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);

        businessProcess(picker1);
        businessProcess(courier1);
        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println("-------------------Склад №1---------------------");
        System.out.println();
        System.out.println(warehouse1.getCountPickedOrders());
        System.out.println(picker1.getSalary());
        System.out.println();
        System.out.println(warehouse1.getCountDeliveredOrders());
        System.out.println(courier1.getSalary());
        /*System.out.println("--------------------Склад №2--------------------");
        System.out.println();
        System.out.println(warehouse2.getCountPickedOrders());
        System.out.println(picker2.getSalary());
        System.out.println();
        System.out.println(warehouse2.getCountDeliveredOrders());
        System.out.println(courier2.getSalary());*/
    }

    static void businessProcess(Worker worker){
        for (int i=0; i<1000; i++){
            worker.doWork();
        }
        worker.bonus();

    }

}
