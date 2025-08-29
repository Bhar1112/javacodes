class WildAnimal{

    void lion() {
        System.out.println("I am a lion");
    }
    void tiger() {
        System.out.println("I am a Tiger");
    }
}
class PetAnimal extends WildAnimal{
    void dog (){
        System.out.println("I am a dog");
    }
    void cow(){
        System.out.println("I am a cow");
    }
    void cat (){
        System.out.println("I am a cat");
    }
}
class BigAnimal extends PetAnimal{
    void elephant (){
        System.out.println("I am a Elephant");
    }
    void bull(){
        System.out.println("I am a Bull");
    }
    void rhinos (){
        System.out.println("I am a Rhinos");
    }

}
public class MultilevelInheritance{
    public static void main (String [] arg){
        BigAnimal call = new BigAnimal();
        call.cat();
        call.cow();
        call.lion();
        call.tiger();
        call.dog();
        call.bull();
        call.rhinos();
        call.elephant();
    }
}

