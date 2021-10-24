package chapter_9;

public class DisplayRent {
    public static void main(String[] args) {
        int[][] rents = {                       // array of rents
                {400, 450, 510},
                {500, 560, 630},
                {625, 676, 740},
                {1000, 1250, 1600}
        };
        int floor;
        int bdrms;
        for (floor = 0; floor < rents.length; floor++) {
            for (bdrms = 0; bdrms < rents[floor].length; bdrms++) {
                System.out.printf("Floor: [%s] Bedrooms: [%s] Rent is: $%s\n",
                        floor, bdrms, rents[floor][bdrms]);
            }
            System.out.println();
        }
    }
}
