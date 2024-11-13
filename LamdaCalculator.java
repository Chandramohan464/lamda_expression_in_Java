interface Addable{
    int add(int a,int b);
}

interface Multiple {
    int mul(int x, int y);
}

public class LamdaCalculator {
    public static void main(String[] args) {
        Addable a1=(a,b)->(a+b);//parameters without data type
        System.out.println(a1.add(10, 20));

        Addable a2=(int a,int b)->(a+b);//parameters with data type
        System.out.println(a2.add(10, 20));

        Multiple m=(x,y)->(x*y);
        System.out.println(m.mul(10,2));
    }
}
