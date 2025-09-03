public class SimpleInterest{
    double calculateSi(int p,int n,double r) {

        double formu = (p * n * r) / 100;
        return formu;
    }
    double areaCir(double r) {
        double form_l = ( r * r * 22 )/7;
        return form_l;
    }
    double cirCum(double r){
        double f_orm = (2 * r * 22)/7;
        return f_orm;
    }

    public static void main (String[] args){
        SimpleInterest obj = new SimpleInterest();
        double s_in = obj.calculateSi(1000,24,10.5);
        System.out.println("simple interest is  " + s_in);
        double ar_cir= obj.areaCir(14);
        System.out.println("Area of circle is  " + ar_cir);
        double cir_Cum = obj.cirCum(21);
        System.out.println("Circumference of circle is " + cir_Cum);
    }
}
