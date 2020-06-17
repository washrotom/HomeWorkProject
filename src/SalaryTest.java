class Employee {
	
	private int id; // ���
	private String name; // �̸�
	private int salary; // ����
	private int comm; // �Ϲݼ���
	private int sum;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	
	int CaluSaraly(int salary, int comm){
		sum = comm + salary; // �ѱ޿�
		return sum;
	}
	
	Employee(int id, String name, int salary, int comm){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.sum = CaluSaraly(salary, comm);
		
		System.out.println(getId() + ":" + getName() + ":" + getSalary() + ":"+ sum);
	}
	
	Employee(){};
}

//*********************************//

class Manager extends Employee {
	
	int ManagerComm;
	int temSum;
	
	int CaluSaraly(int salary, int ManagerComm){
		this.temSum = ManagerComm + salary; // �ѱ޿�
		setSum(temSum); 
		return getSum();
	}
	
	Manager(int id, String name, int salary, int comm, int ManagerComm){
		setId(id);
		setName(name);
		setSalary(salary);
		setComm(comm);
		CaluSaraly(salary, ManagerComm);
		
		System.out.println(getId() + ":" + getName() + ":" + getSalary() + ":"+ CaluSaraly(salary, ManagerComm));
	}
	
	Manager(){};
	
}

//*********************************//

class Engineer extends Employee{
	
	int QcCom;
	int techcomm;
	int temSum;
	
	int CaluSaraly(int salary, int QcComm, int techcomm) {
		this.temSum = QcComm + techcomm + salary; // �ѱ޿�
		setSum(temSum); 
		return getSum();
	}
	
	Engineer(int id, String name, int salary, int comm, int QcComm, int techcomm){
		setId(id);
		setName(name);
		setSalary(salary);
		setComm(comm);
		CaluSaraly(salary, QcComm, techcomm);
		
		System.out.println(getId() + ":" + getName() + ":" + getSalary() + ":"+ CaluSaraly(salary, QcComm, techcomm));
	}
	
	
	Engineer(){};

}

//*********************************//

class Secretary extends Employee{
	
	int SecComm;
	int temSum;
	
	int CaluSaraly(int salary, int SecComm) {
		this.temSum = SecComm + salary; // �ѱ޿�
		setSum(temSum); 
		return getSum();
	}
	
	Secretary (int id, String name, int salary, int comm, int SecComm){
		setId(id);
		setName(name);
		setSalary(salary);
		setComm(comm);
		CaluSaraly(salary, SecComm);
		
		System.out.println(getId() + ":" + getName() + ":" + getSalary() + ":"+ CaluSaraly(salary, SecComm));
	}
	
	Secretary(){};
	
}

//***********************************//


public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e [] = new Employee[4];
		 // ��� / �̸� / ���� / �Ϲݼ���
		 e[0] = new Employee (1000,"�̻��",10000,5000);
		 e[1] = new Manager (2000,"�谣��",20000,10000,10000);
		 e[2] = new Engineer (3000,"�ڱ��",15000,7500,5000,5000);
		 e[3] = new Secretary (4000,"�ֺ�",15000,7000,10000); 
	}

}
