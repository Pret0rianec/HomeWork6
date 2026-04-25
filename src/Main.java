//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Task1
    System.out.println("    Task_1:");
    for (int i = 1; i < 11; i++) {
        System.out.println(i);
    }
    // Task2
    System.out.println("    Task_2:");
    for (int i = 10; i > 0; i--) {
        System.out.println(i);
    }
    // Task3
    System.out.println("    Task_3:");
    for (int i = 0; i < 18; i = i + 2) {
        System.out.println(i);
    }
    // Task4
    System.out.println("    Task_4:");
    for (int i = 10; i > -11; i--) {
        System.out.println(i);
    }
    // Task5
    System.out.println("    Task_5:");
    for (int i = 1904; i < 2097; i = i + 4) {
        System.out.println(i + " год является високосным");
    }
    // Task6
    System.out.println("    Task_6:");
    for (int i = 7; i < 99; i = i + 7) {
        System.out.println(i);
    }
    // Task7
    System.out.println("    Task_7:");
    for (int i = 1; i < 513; i = i * 2) {
        System.out.println(i);
    }
    // Task8
    System.out.println("    Task_8:");
    int money = 29000;
    int total = 0;
    for (int i = 1; i < 13; i++) {
        total = total + money;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
    }
    // Task9
    System.out.println("    Task_9:");
    int deposit = 29000;
    int interest = 0;
    for (int i = 1; i < 13; i++) {
        interest = interest + interest / 100;
        interest = interest + deposit;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + interest + " рублей");
    }
    // Task10
    System.out.println("    Task_10:");
    int number = 2;
    for (int i = 1; i < 11; i++) {
        System.out.println("2*" + i + "=" + (i * number));
    }
}