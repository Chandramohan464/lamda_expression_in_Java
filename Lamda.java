interface Person{
    String say(String message);
}

public class Lamda {
    public static void main(String[] args) {
        Person p=(message)->{String s1="I would like to say, ";String s2=s1+message;return s2;};
        System.out.println(p.say("time is precious"));
    }
}
