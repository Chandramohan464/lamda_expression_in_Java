interface Name{
    String say(String name);
}

public class LamdaExample3 {
    public static void main(String[] args) {
        Name n=(name)->{return "Hello "+name;};//parameter with paranthesis
        System.out.println(n.say("Chandramohan"));

        Name n1=name->{return "Hello "+name;};//parameter with-out paranthesis
        System.out.println(n1.say("Chandramohan"));
    }
}
