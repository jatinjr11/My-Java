class Employee{
    private int empId;
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public int getEmpId(){
        return empId;
    }
}
public class Company{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        System.out.println(emp1.getEmpId());
    }
}