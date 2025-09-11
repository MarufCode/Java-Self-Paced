package src.Static_Keyword;

public class employee_RC {
    public static void main(String[] args) {

        employee.printCompany_name(); // because of its static in nature, no need to create object of it


        employee e = new employee(34, "Maruf", 455);
        e.employee_details();


    }
}
