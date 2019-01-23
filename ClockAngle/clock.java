
/**
Calculate the angle between the Hour and Mintue hand on a clock.
 */
public class clock
{
    private int x;

    /**
     * Constructor for objects of class clock
     */
    public clock(double hour_in, double mint_in)
    {
        System.out.printf ("Angle = " + angleBtween(hour_in, mint_in)+ "%n"); 
    }

    public double angleBtween(double _hour, double _min)
    {

        if (_hour>12 | _hour<0){
            System.out.printf("Please enter an hour which is between 1 and 12. %n");

        }

        if (_min>60 | _min<0){
            System.out.printf("Please enter an mintue which is between 0 and 60. %n");

        }
        double min_ang = (_min)*6;
        double hour_ang = ((_hour )*30)+(_min*30/60);

        double AngleBetween = hour_ang-min_ang;
        System.out.printf ("Hour Angle = "+hour_ang+"%n");
        System.out.printf ("Mint Angle = "+min_ang+"%n"); 
        return (AngleBetween);
    }
}
