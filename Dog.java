package quiz2;

public class Dog extends Animal{
    private String name;
    @Override
    public void introduceYourself(){
        System.out.printf("Woof. I am a dog. My name is %s.\n", name);
    }
    public Dog(String X){
        name = X;       
    }
}
