public class Gauge { 
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (this.value < 5) {
            value++;
        }
    }

    public void decrease() {
        if (this.value > 0) {
            value--;
        }
    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        if (this.value == 5) {
            return true;
        } else {
            return false;
        }
    }
}

    /*the above statement can also be written as - 
     public boolean full() {
    return this.value == 5;
    }

    This is more concise and leverages the fact that the expression this.value == 5 already evaluates to a boolean value (true or false)
     */

     public class main {
        public static void main(String[] args) {
            Gauge g = new Gauge();

            while(!g.full()) {
                System.out.println("Not full! Value: " + g.value());
                g.increase();
            }

            System.out.println("Full! Value: " + g.value());
            g.decrease();
            System.out.println("Not full! Value: " + g.value());
        }
     }