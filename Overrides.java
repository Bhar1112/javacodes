class SuperCon{
   String student_Name;
   int rollNo;
   int std;
   int total;


  SuperCon(String student_Name,int rollNo,int std,int total){
    this.student_Name =student_Name;
    this.rollNo=rollNo;
    this.std =std;
    this.total=total;
}   
 void getMarks(){
  System.out.println("Current Total is  "+total);
}
}
class  Construct extends SuperCon{
    int totalMarks;
    Construct(String student_Name,int rollNo,int std,int total,int totalMarks){
       super(student_Name,rollNo,std,total);
       this.totalMarks=totalMarks;
}
    @Override
    void getMarks(){
       int OverallTotal = this.totalMarks + super.total ;
      super.getMarks();
     System.out.println("Student Name is " +super.student_Name);
     System.out.println("My Total is " + OverallTotal);

} 
}
public class Overrides{
public static void main(String []args){
  Construct call = new Construct("VIJAY",003,10,320,100);
  call.getMarks();


}
}





