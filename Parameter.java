class Parameter{

public int addTwo(int a , int b){
  int c = a +b ;
  return c;

}
public int addThree(int a , int b,int c){
  int d = a +b +c ;
  return d;

}
public int subTwo(int a , int b){
  int c = a - b ;
  return c;
}
public int subThree(int a , int b,int c){
  int d = a -b -c ;
  return d;

}
public int mulTwo(int a , int b){
  int c = a * b ;
  return c;
}
public int mulThree(int a , int b,int c){
  int d = a *b *c ;
  return d;

}
public int divTwo(int a , int b){
  int c = a/b ;
  return c;
}
public int divThree(int a , int b,int c){
  int d = a /b /c ;
  return d;

}
public int modTwo(int a , int b){
  int c = a%b ;
  return c;
}
public int modThree(int a , int b,int c){
  int d = a %b %c ;
  return d;

}
public static void main (String ab[]){

    Parameter obj = new Parameter(); 
    System.out.println("Addition Two Number 10+20 : " + obj.addTwo(10,20));
   System.out.println("Addition Three Number 10+20+30 : " + obj.addThree(10,20,30));
   System.out.println("Subtraction Two Number 50-20 : " + obj.subTwo(50,20));
System.out.println("Subtraction Three Number 60-10-90 : " + obj.subThree(60,10,90));

System.out.println("Multiply Two Number 98*24 : " + obj.mulTwo(98,24));
System.out.println("Multiply Three Number 23*16*18 : " + obj.mulThree(23,16,18));
System.out.println("Division Two Number 100/5 : " + obj.divTwo(100,5));
System.out.println("Division Three Number 2000/20/5 : " + obj.divThree(2000,20,5));
System.out.println("Modulus Two Number 23%5 : " + obj.modTwo(23,5));
System.out.println("Modulus Three Number 97%2%2 : " + obj.modThree(97,2,2));

}

}
