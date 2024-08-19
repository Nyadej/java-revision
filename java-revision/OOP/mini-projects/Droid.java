/*
 * A robot workshop to build some droids. 
 * Create instructions on how to create the robots and what they’ll do.
 */

public class Droid {

        String name; 
        int batteryLevel;
      
        public Droid(String droidName) {
          name = droidName;
          batteryLevel = 100;
        }
      
        public void performTask(String task) {
          System.out.println(name + " is performing task: " + task);
          batteryLevel =- 10;
        }

        public void energyReport() {
            System.out.println(name + " has " + batteryLevel + "% battery remaining.");
        }

        public void energyTransfer(Droid otherDroid, int amount) {
            if (amount > batteryLevel) {
                System.out.println("Not enough energy to transfer.");
            } else {
                this.batteryLevel -= amount;
                otherDroid.batteryLevel += amount;
                System.out.println("Transferred " + amount + "% battery from " + name + " to " + otherDroid.name);
            }
        }
      
        public String toString() {
          return "Hello, I'm the droid: " + name;
        }
      
      public static void main (String[] args) {
        Droid codey = new Droid("Codey");
        Droid naomi = new Droid("Naomi");

        System.out.println(codey);
        codey.performTask("Skate");
        codey.energyReport();

        System.out.println(naomi);
        naomi.performTask("Jump");
        naomi.energyReport();

        naomi.energyTransfer(naomi, 50);

        codey.energyReport();
        naomi.energyReport();
      
      }  
}

