package quiz2;

public class Cat extends Animal{
    private String name;
    @Override
    public void introduceYourself(){
        System.out.printf("Meow. I am a cat. My name is %s.\n", name);
    }
    public Cat(String X){
        name = X;        
    }
}
