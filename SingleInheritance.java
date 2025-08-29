class Animal{

    void lion() {
        System.out.println("I am a lion");
    }
    void parrot () {
        System.out.println("I am a Parrot");
    }
    void cat (){
        System.out.println("I am a cat");
    }
}
class PetAnimal extends Animal{
    void dog (){
        System.out.println("I am a dog");
    }
    void cow(){
        System.out.println("I am a cow");
    }
}
public class SingleInheritance{
    public static void main (String [] arg){
        PetAnimal call = new PetAnimal();
        call.cat();
        call.cow();
        call.lion();
        call.parrot();
        call.dog();
    }
}






