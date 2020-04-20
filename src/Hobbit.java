/**
 * A Hobbit class used to show off inner classes
 * @author Drew A. Clinkenbeard
 * @version 0.1
 * @since 2019-11-30
 */
public class Hobbit {
    private boolean isVisible = true;
    private int evilness = 0;
    private OneRing precious;


    Hobbit(){
        precious = new OneRing();
    }


    /**
     * wearRing is a method that uses an inner classes to set
     * the visibility state of a Hobbit.
     */
    public void wearRing(){
        if(isVisible){
            precious.turnInvisible();
        }else{
            precious.turnVisisble();
        }
    }

    /**
     * Simple getter.
     * @return boolean that is used to determine if we can see the Hobbit
     */
    public boolean isVisible() {
        return isVisible;
    }

    private class OneRing{

        void turnInvisible(){
            isVisible = false;
            evilness++;
        }
        void turnVisisble(){
            isVisible = true;
        }
    }
}

