package sinif.odev;

public class Employee {
    String name;
    String lastName;
    double salary;
    int workHours;
    int hireYear;

    public Employee(int hireYear, String lastName, String name, int salary, int workHours) {
        this.hireYear = hireYear;
        this.lastName = lastName;
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }
    public double  tax() {
        if (salary <= 1000) {
            System.out.println("Çalışanın maaşı 1000 TL'den az  vergi uygulanmayacaktır.");
        }

        if (salary > 1000) {
           return (salary * 0.03);

        }
        return 0;
    }
    public double bonus(){
        if(workHours>40){
           return (workHours -40)*30;

        }
        return 0;
    }
    public double raiseSalary(){

        int years =2021-hireYear;
        if(years<10){
            return salary*0.05;
        }
        else if (years<20) {
     return salary*0.1;

        }
        else{
   return salary*0.19;
        } }
    public String toString() {

        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus +
                "\nToplam Maaş : " + totalSalary;
    }
}

