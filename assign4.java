class Students {
String name;
int roll, reg;

public Students(String name, int roll, int reg) {
this.name = name;
this.roll = roll;
this.reg = reg;
}
public  float markToGrade(float mark){
float gradePoint;
if(mark>=80 && mark<=100)
gradePoint=(float) 5.0;
else if(mark>=75 && mark<=79)
gradePoint=(float) 4.75;
else if(mark>=70 && mark<=74)
gradePoint=(float) 4.50;
else if(mark>=65 && mark<=69)
gradePoint=(float) 4.25;
else if(mark>=60 && mark<=64)
gradePoint=(float) 4.00;
else if(mark>=55 && mark<=59)
gradePoint=(float) 3.75;
else if(mark>=50 && mark<=54)
gradePoint=(float) 3.50;
else if(mark>=45 && mark<=49)
gradePoint=(float) 3.25;
else if(mark>=40 && mark<=44)
gradePoint=(float) 3.00;
else
gradePoint=(float) 0.00;
return gradePoint;
}

interface Result {
float calculateGpa();
void getSubject();
void showResult();
void setMarks(float mark1,float mark2);
}
class FirstSemester extends Students implements Result {
private String sub1, sub2;
private float mark1, mark2, grade1, grade2,credit1,credit2;

public FirstSemester(String name, int roll, int reg) {
super(name, roll, reg);

}
@Override
public void setMarks(float mark1,float mark2) {
this.mark1=mark1;
this.mark2=mark2;
this.grade1=markToGrade(mark1);
this.grade2=markToGrade(mark2);
}

@Override
public float calculateGpa() {
return (grade1* credit1+ grade2*credit2) / (credit1+credit2);
}

@Override
public void getSubject() {
sub1="Introduction to Computer System";
sub2="Structured Programming Language";
credit1=(float)2.0;
credit2=(float)3.0;
}

@Override
public void showResult() {
System.out.println("\nName: " + name + "\nRoll = " + roll + "\nRegistration no: " + reg + "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 + "\nGPA: " + calculateGpa());
}
}

public class ResultProcessing {

	
	public void main(String[] args) {
		
		FirstSemester std1 = new FirstSemester("Elson", 127, 149);
		std1.setMarks(60,70);
		System.out.println("\nEnter First Semester Student's Info:");
		std1.getSubject();
		std1.showResult();

		
		}
		}
}
