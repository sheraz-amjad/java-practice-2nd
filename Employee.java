import java.util.*;

public class Employee {

	private int empno;
	private String ename;
	private int salary;
	
	Employee (int empno, String ename, int salary){
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return empno+ " "+ename+ " " + salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection<Employee> e = new ArrayList<Employee>();
		List<Employee> e = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner (System.in);
		
		int ch;
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			
			System.out.println("Enter your Choice: ");
			
			ch = s.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter Empno =");
				int eno = s.nextInt();
				System.out.print("Enter Emp Name =");
				String ename = ss.nextLine();
				System.out.print("Enter Salary = ");
				int sal = s.nextInt();
				e.add(new Employee(eno,ename,sal));// Anonnymes Object Created
				Iterator i = e.iterator();
				break;
				case 2:
					//System.out.println(e);
					System.out.println("-------------------");
					 i = e.iterator();
				
					while(i.hasNext()) {
						Employee emp = (Employee) i.next();
						System.out.println(emp);
					}
					System.out.println("-------------------");
					break;
				case 3:
					boolean found = false;
					
					//System.out.println(e);
					System.out.println("Enter Employee No : ");
					eno = s.nextInt();
					System.out.println("-------------------");
					i = e.iterator();
					while(i.hasNext()) {
						Employee emp = (Employee) i.next();
						if(emp.getEmpno()==eno)
						{
							System.out.println(emp);
							found = true;
						}
					}
					
					if(!found) {
						System.out.println("Sorry Record Not Found! ");
					}
					System.out.println("-------------------");
					break;
					
				case 4:
					found = false;
					//System.out.println(e);
					System.out.println("Enter Employee No to delete the record: ");
					eno = s.nextInt();
					System.out.println("-------------------");
					i = e.iterator();
					while(i.hasNext()) {
						Employee emp = (Employee) i.next();
						if(emp.getEmpno()==eno)
						{
							i.remove();
							found = true;
						}
					}
					
					if(!found) {
						System.out.println("Sorry Record Not Found! ");
					}else {
						System.out.println("Record Deleted Successfully..! ");
					}
					System.out.println("-------------------");
					break;
				case 5:
					found = false;
					//System.out.println(e);
					System.out.println("Enter Employee No to Update the record: ");
					eno = s.nextInt();
					ListIterator<Employee> li = e.listIterator();
					while(li.hasNext()) {
						Employee emp = (Employee) li.next();
						if(emp.getEmpno()==eno)
						{
							System.out.print("Enter New Name: ");
							ename = ss.nextLine();
							System.out.println("Enter New Salary: ");
							sal = s.nextInt();
							
							li.set(new Employee(eno,ename,sal));
							found = true;
						}
					}
					
					if(!found) {
						System.out.println("Sorry Record Not Found! ");
				}else {
						System.out.println("Record Updated Successfully..! ");
					}
					break;
			}
			
		}while(ch!=0);
	}
}