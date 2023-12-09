package encap;

public class AB {
    public static void main(String[] args){
        B b = new B();
        b.name = "B";
        System.out.println(b.name);
        A a = new A();
        a.name = "A";
        System.out.println(a.name);

        b.setLastName("BB");
        System.out.println(b.getLastName());

        a.setLastName("AA");
        System.out.println(a.getLastName());





    }
}
