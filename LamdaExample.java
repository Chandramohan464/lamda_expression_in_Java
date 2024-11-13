interface Drawable{
    void draw();
}

public class LamdaExample {
    public static void main(String[] args) {
        int width=10;

        Drawable d=()->{System.out.println("Draw: "+width);};
        d.draw();
    }
}
