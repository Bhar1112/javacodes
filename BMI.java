class BmiCalc{
   int heightCm;
   int weightKg;
   
  BmiCalc(int heightCm,int weightKg){
      this.heightCm = heightCm;
      this.weightKg = weightKg;

}
void BmiResult(){
    double h = heightCm / 100.0;
    double BMI = weightKg / (h*h);
  System.out.println("My BMI is " + BMI);
}
}
   public class BMI{
   public static void main(String[]args){
         BmiCalc max = new BmiCalc(177,50);
         max.BmiResult();

}
}



