public class snake {
    
    public static void main(String[] args) {
        int framex=10;
    int framey=10;
    int playerx = 5;
    int playery = 5;
    int frame[][] = 
    {{0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0,0,0}};
        while(true){
        for(int i=0; i<framex; i++) {
            for(int j=0; j<framey; j++) {
                System.out.print(frame[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\033[H\033[3J");
        }
    }

}