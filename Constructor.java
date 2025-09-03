class Constructor{
    String StudentName;
    int age;
    int Std;
    int T_Marks;
    char Result;

Constructor(String StudentName,int age,int Std,int T_Marks,char Result)
{
      this.StudentName = StudentName;
      this.age = age;
      this.Std = Std;
      this.T_Marks = T_Marks;
      this.Result = Result;

    }
public void GetResult(){
     System.out.println("Name : "+StudentName);
     System.out.println("Result is : " + Result);
} 
public void GetTotal(){
    System.out.println("\nName : "+ StudentName);
    System.out.println("Total mark is : "+ T_Marks);

}
public void GetAge(){

    System.out.println("\nName : "+ StudentName);
    System.out.println("Age is : "+ age);
}


}
