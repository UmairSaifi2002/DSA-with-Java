import java.util.Arrays;
import java.util.Collections;

public class Chocolate_Problem07 {
    public static void main(String[] args) {
        // Problem Statement
        // We are given a bar of chocolate composed mxn square pieces.
        // One Should break the chocolate into single squares. Each break of a part of the
        // cocolate is charged a cost expressed by a positive integer.
        // This cost does not depend on the size of the part that is being broken but only depends
        // on the line the break goes along. Let us denote the costs of breaking along consecutive
        // vertical lines with x1,x2,...,xm-1 and along horizontal lines with y1,y2,...,yn-1.
        // compute the minimal cost of breaking the whole chocolate into single squares.
        int row = 4 , col = 6;

        // Define costs for vertical and horizontal cuts
        Integer VerticulCutCost[] = {2, 1, 3, 1, 4}; // Costs for cutting between columns
        Integer HorizontalCutCost[] = {4, 1, 2}; // Costs for cutting between rows

        // Sorting The Arrays in Decreasing Order.
        Arrays.sort(VerticulCutCost, Collections.reverseOrder());
        Arrays.sort(HorizontalCutCost, Collections.reverseOrder());

        // Initialize variables to track costs and pieces
        int h = 0, v = 0;
        int HorizontalPieces = 1, VerticalPieces = 1; // Initiallize the pieces

        int TotalCostofCutting = 0;

        while (h < HorizontalCutCost.length && v < VerticulCutCost.length) {
            // Case 1 :- Vertical Cost < Horizontal Cost
            if (VerticulCutCost[v] < HorizontalCutCost[h]) {
                // Horizontal Cut
                TotalCostofCutting += (HorizontalCutCost[h]*VerticalPieces);
                HorizontalPieces++;
                h++;
            }
            // Case 2 :- Horizontal Cost < Vertical Cost
            else {
                TotalCostofCutting += (VerticulCutCost[v]*HorizontalPieces);
                VerticalPieces++;
                v++;
            }
        }

        while (h < HorizontalCutCost.length) {
            TotalCostofCutting += (HorizontalCutCost[h]*VerticalPieces);
            HorizontalPieces++;
            h++;
        }

        while (v < VerticulCutCost.length) {
            TotalCostofCutting += (VerticulCutCost[v]*HorizontalPieces);
            VerticalPieces++;
            v++;
        }

        System.out.println("The Minimum Cost of Cutting is : "+TotalCostofCutting);

    }
}
