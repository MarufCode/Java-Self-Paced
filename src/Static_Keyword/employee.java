package src.Static_Keyword;


public class employee {


    int employee_id;

    String employee_name;

    double employee_salary;


    static String company_name = "Microsoft";

    employee(int employee_id, String employee_name, double employee_salary){
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public static void printCompany_name(){
        System.out.println(company_name);
    }


   public void employee_details(){
       System.out.println(employee_id + " " + employee_name + " " + employee_salary);

   }


}
