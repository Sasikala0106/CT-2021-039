package Q4;

public class BicycleTest {

        public static void main(String[] args) {
            Bicycle myBike = new Bicycle("Sashini", "0710648891");
            System.out.println("owner:" + myBike.getOwner().getOwnerName());
            System.out.println("Phone No: " + myBike.getOwner().getPhoneNo());
        }
    }


