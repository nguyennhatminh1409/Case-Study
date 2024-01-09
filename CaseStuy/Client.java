public class Client {
    public static void main(String[] args) {
        Employee employee[] = new Employee[3];
        getAvgFulltime(employee);
    }

    private static void getAvgFulltime(Employee[] employee) {
        double sum = 0;
        int count = 0;
        for (Employee employee1: employee) {
            if (employee1 instanceof FullTimeEmployee) {
                count ++;
                sum += employee1.getPaymen();
            }
        }
        double avg = sum/count;
    }
    private static void getAvgParttime(Employee[] employee) {
        double sum = 0;
        int count = 0;
        for (Employee employee1: employee) {
            if (employee1 instanceof ParttimeEmployee) {
                count ++;
                sum += employee1.getPaymen();
            }
        }
        double avg = sum/count;
    }
}