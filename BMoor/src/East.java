public class East extends Compass {


    double meters;
        String reWalk;

        //ReWalk = Restricted walking
        public East( double meters, String reWalk){

            this. meters = meters;
            this.walk = walk();
            this.reWalk = reWalk;
        }





        @Override
        public double walk() {
            return 1;
        }

    @Override
    public String getWalking() {
        return "more walking";
    }

    @Override
        public String toString(){
            return "East : " + walk;
        }

}
