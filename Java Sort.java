import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student x, Student y) {
            if(x.getCgpa() == y.getCgpa()) {
                if(x.getFname().equals(y.getFname())) {
                    return x.getId() - y.getId();
                }
                return x.getFname().compareTo(y.getFname());
            }   
            else {
                double ans = y.getCgpa() - x.getCgpa();
                if(ans == 0)
                    return 0;
                else if(ans > 0)
                    return 1;
                else
                    return -1; 
                }
            }
        });
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
