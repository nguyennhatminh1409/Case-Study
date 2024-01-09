public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String id, String name, int age, String phonenumber, String email) {
        super(id, name, age, phonenumber, email);
    }

    private String id;
    private String name;
    private int age;
    private String phonenumber;
    private String email;

    public FullTimeEmployee(String id, String name, int age, String phonenumber, String email, double premium, double fineamount, double hardsalary) {
        super(id, name, age, phonenumber, email);
    }

    private double fixedSalary;
    private double bonus;
    private double fine;
    public FullTimeEmployee (double fixedSalary, double bonus, double hardsalary) {
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
        this.fine = fine;
    }
    public double getPremium() {
        return fixedSalary;
    }
    public void setPremium(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public double getFineamount() {
        return bonus;
    }
    public void setFineamount(double bonus) {
        this.bonus = bonus;
    }
    public double getHardsalary() {
        return fine;
    }
    public void setHardsalary(double fine) {
        this.fine = fine;
    }

    @Override
    public double getPaymen() {
        return (fixedSalary + bonus) - fine;
    }
}
