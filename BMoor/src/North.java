public class North extends Compass {

        double meters;
       String walking;

      public North(double meters, String walking){

            this.meters = meters;
            this.walk = walk();
            this.walking = walking;
        }
        public double getNumber(){

            return 5;
        }

        public double getMeters()
        {
            return meters;
        }

    public String getWalking()
    {
        return walking;
    }

    @Override
        public double walk() {

            return 5;
        }


        @Override
        public String toString(){
            return "North : " + walk;
        }

    }

