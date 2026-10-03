//3c

import java.util.*;

public class FinalWaste {
    static void WasteSum(double point1waste, double point2waste){
        double TotalWaste = point1waste+point2waste;
        System.out.println("Total waste collected at the 2 collection points: "+TotalWaste);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amout of waste collected in point 1: ");
        double i = sc.nextDouble();
        System.out.println("Enter the waste collected in point 2: ");
        double j = sc.nextDouble();
        WasteSum(i,j);
    }

}
