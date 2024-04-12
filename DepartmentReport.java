import java.io.FileNotFoundException;

public class DepartmentReport {

    public static void main(String[] args) throws FileNotFoundException {
        new DepartmentDA();
    }
    public DepartmentReport () throws FileNotFoundException {
        DepartmentDA departmentDA = new DepartmentDA();
    }
}