public class Main {
    public static void main(String[] args) {
        Employee employee[] = new Employee[3];
        getSumSalary(employee);

        double sum = 0;
        int count = 0;
        for (Employee employee1 : employee) {
            if (employee1 instanceof FullTimeEmployee) {
                count ++;
                sum += employee1.getPaymen();
            }
        }
        double avg = sum / count;
    }
    private static double getSumSalary(Employee[] employee) {
        double sum = 0;
        for (Employee employee1 : employee) {
            sum += employee1.getPaymen();
        }
        return sum;
    }
}
