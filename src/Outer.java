public class Outer {

    public void show_inner() {
        Inner inner = new Inner();
        inner.print();
    }

    //Inner Class
    private class Inner {
        public void print() {
            System.out.println("this is an inner class");
        }
    }

    //Static inner class?
    public static class StaticInner{

        /**
         * A simple addition method to show off inner classes
         * @param x an integer to add
         * @param y another integer to add
         * @return the sum of x and y
         */
        static int Addition(int x, int y){
            return x+y;
        }
    }
}
