interface Sayable{
    String say();
}

public class LamdaWithOutParameter {
    public static void main(String[] args) {
        Sayable s=()->{return "I have nothing to say";};
        System.out.println(s.say());
    }
}
