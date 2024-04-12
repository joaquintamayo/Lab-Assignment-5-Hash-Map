import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeDA {
    
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeDA(String empNo, Double salary) throws FileNotFoundException {
        readEmployeeFromFile(empNo, salary);
    }

    private void readEmployeeFromFile(String empNo, Double salary) throws FileNotFoundException {
        Scanner employeeFile = null;
        try {
            employeeFile = new Scanner(new File("emp.csv"));
            employeeFile.nextLine();

            while (employeeFile.hasNext()) {
                String employeeRow = employeeFile.nextLine();
                String[] employeeRowSpecific = employeeRow.split(",");

                if (empNo.equals(employeeRowSpecific[0])) {
                    employee = new Employee();
                    employee.setEmpNo(employeeRowSpecific[0]);
                    employee.setLastName(employeeRowSpecific[1]);
                    employee.setFirstName(employeeRowSpecific[2]);
                    employee.setSalary(salary);
                    break; 
                }
            }
        } finally {
            if (employeeFile != null) {
                employeeFile.close();
            }
        }
    }
}