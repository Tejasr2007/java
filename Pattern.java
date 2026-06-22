public class Pattern
{
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (
                    j == 1 ||                     
                    i == 1 && j < 7 ||           
                    i == 4 && j < 7 ||           
                    j == 7 && i > 1 && i < 4     
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}