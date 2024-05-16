public class TestEmployee {
    public static void main(String[] args) {
        Employee John = new Employee (1, "John", "Smith", 4500);
        Employee James = new Employee(2,"James", "Bond", 5000);

        //print salaries
        System.out.println("John's salary: $" + John.getSalary());
        System.out.println("James's salary: $" + James.getSalary());

        //20% raise
        John.raiseSalary(20);
        James.raiseSalary(20);


        //print salaries after raise
        System.out.println("John's salary after raise: $" + John.getSalary());
        System.out.println("James's salary after raise: $" + James.getSalary());
    
    }   
}
