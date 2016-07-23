
public class Student implements Cloneable, Comparable<Object>
{
	private String Name;
	private int ID;
	
public Student()
{
	Name = "";
	ID = 0;
}
public Student(String StudentName, int StudentID)
{
	Name = StudentName;
	ID = StudentID;
}
public Student(Student CopyStudent)
{
	Name = CopyStudent.Name;
	ID = CopyStudent.ID;
}
public Object clone() 
{
	try
	{
		return super.clone();
	} 
	catch (CloneNotSupportedException e) 
	{
		
		e.printStackTrace();
		return null;
	}
}
public void setName(String NewName)
{
	Name = NewName;
}
public void setID(int NewID)
{
	ID = NewID;
	}
public String getName()
{
	return Name;
}
public int getID()
{
return ID;	
}
public String toString()
{
	return ("Name:\n"+getName()+ "\nID:\n"+getID());
}
public boolean equals(Object ComparedStudent)
{
	if(ComparedStudent == null)
	{
		return false;
	}
	else if(getClass()!=ComparedStudent.getClass())
	{
		return false;
	}
	else{
		Student New = (Student)ComparedStudent;
		return(Name.equals(New.Name )&& ID==New.ID );
	}
}


public int compareTo(Object Other) {
	if(Other == null || getClass() != Other.getClass()){
		return -2;
	}
	else{
	Student New = (Student)Other;
	if(Name.compareTo(New.Name )== -1){ // other goes before 
		return -1;
	}
	else if(Name.compareTo(New.Name )== 1){
		return 1; // other goes after
	}
	else if(Name.compareTo(New.Name )== 0){
		return 0;
			}
	else {
		return -2;
	}
		}
	}

}





