public class Main {

    /**
     *The Main method of this package
     * @param args unused
     *
     */
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show_inner();

        System.out.println(
                Outer.StaticInner.Addition(4,10)
        );

        Hobbit bilbo = new Hobbit();

        bilbo.wearRing();

        System.out.println("can we see Bilbo? " + bilbo.isVisible() );

        System.out.println(Outer.StaticInner.Addition(6,7));

        AbstractOuter anon = new AbstractOuter(){
          public void myMethod(){
              System.out.println("well this is weird.");
          }
        };
        anon.myMethod();
    }
}
