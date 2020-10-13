import java.util.*;
class Student {
	private String usn;
	private String name;
    private	int cred[];
	private int marks[];
	private int n;

	void accept()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.println("USN of the student:");
		usn=s.next();
		System.out.println("Name of student:");
		name=s.next();
		System.out.println("Enter the number of subjects:");
		n=s.nextInt();
		cred=new int[n];
		marks=new int[n];
		System.out.println("Enter credits and marks attained by the student in each subject(out of 100)");
		for(int i=0;i<n;i++)
		{
			cred[i]=s.nextInt();
			marks[i]=s.nextInt();
		}
	}
	void display()
	{
		System.out.println("Student details:");
		System.out.println("USN:"+usn);
		System.out.println("Name:"+name);
		System.out.println("Marks in each subject:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Subject "+(i+1)+":"+marks[i]);
		}
	}
	double calculate()
	{
		int tcp=0,tc=0;
		for(int i=0;i<n;i++)
		{
			tc=tc+cred[i];
			if(marks[i]>=50)
			{
			tcp=tcp+(((marks[i]/10)+1)*cred[i]);
			}
			else if(marks[i]>=40 && marks[i]<50)
			{
				tcp=tcp+(4*cred[i]);
			}
		}
		return (double)tcp/tc;
	}
}
	class Main
	{
		
	public static void main(String ss[]) {
		Student s1=new Student();
		s1.accept();
		s1.display();
		System.out.println("SGPA: "+s1.calculate());
	}
}
