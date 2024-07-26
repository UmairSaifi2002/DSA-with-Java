
public class Shortest_Distance{

    public static double coordinates(String str) {
        int coordinate[] = new int[2];
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') x++;
            else if(str.charAt(i) == 'W') x--;
            else if(str.charAt(i) == 'N') y++;
            else y--; 
        }
        coordinate[0] = x;
        coordinate[1] = y;
        System.out.println("The Final Co-Ordinates are -> ("+x+","+y+")");
        double result = Distance(coordinate);
        return result;
    }

    public static double Distance(int arr[]) {
        double intermediate = (arr[0]*arr[0])+(arr[1]*arr[1]);
        double distance = Math.sqrt(intermediate);
        return distance;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN"; 
        // String str = "NS";
        double result = coordinates(str);
        System.out.println("So, the displacement is -> "+result);
    }
}
