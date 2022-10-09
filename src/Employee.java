public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax() {
        int tax = 0;
        if (this.salary <= 1000) {
           return  tax =0;
        }else {
            return tax = (this.salary / 100) * 3;
        }
    }

    public int bonus() {
        int overtime;
        if (this.workHours >= 40) {
            return overtime = (this.workHours - 40) * 30;
        }else {
            return overtime = 0;
        }
    }
    public int raiseSalary(){
        int raiseSalary = 2021;
        int interest;
        if(raiseSalary -this.hireYear >9 && raiseSalary-this.hireYear < 20){
            return interest = ((this.salary / 100) * 10) ;
        }
        if(raiseSalary - this.hireYear > 19){
            return interest = ((this.salary /100 ) * 15);
        }else
            return interest= ((this.salary / 100) * 5);
    }
    public void run(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergiler ve bonuslar ile birlikte maaş:" + ((this.salary + bonus()) - tax()));
        System.out.println("Toplam Maaş: " + ((this.salary + bonus() + raiseSalary() - tax())));
    }


}
