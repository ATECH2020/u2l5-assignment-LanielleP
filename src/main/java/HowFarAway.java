import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        //makes new Scanner
        Scanner in = new Scanner(System.in);

        //takes user input
        System.out.print("Enter the latitude of the starting location: ");
        double startLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double startLon = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double endLat = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLon = in.nextDouble();

        //calculations using GeoLocation class
        GeoLocation start = new GeoLocation(startLat,startLon);
        GeoLocation end = new GeoLocation(endLat, endLon);
        double result = start.distanceFrom(end);

        //prints result
        System.out.print("The distance is "+result+" miles.");
        
        in.close();
    }
}