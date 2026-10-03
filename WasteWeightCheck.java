//3b

import java.util.*;

public class WasteWeightCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of waste collected in kgs: ");
        double Wastekg = sc.nextDouble();
        if(Wastekg>=100){
            System.out.println("Collection target achieved.");
        }
        else{
            System.out.println("More waste collection required");
        }
    }
    
}
