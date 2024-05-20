package turnbasedrpg;

public class MainGame 
{
    public static void main( String[] args )
    {
        int choice = 1;
        int turn = 1;
        PlayerDay1 player = new PlayerDay1();

        System.out.println("\nThis is the Border Inspection Game.\n");
        String nInput = UserInput.getString("Enter your name:");
        player.name = (nInput.isBlank() ? "Officer" : nInput);  
        System.out.println("Hello, " + player.name + "."); 
        System.out.println("You are a border inspection officer.");

        while(choice!=0){
            System.out.println("Options:");
            System.out.println("1 - learn");
            System.out.println("2 - eat and sleep");
            System.out.println(); 
            choice = UserInput.getInteger("Enter choice");
            
            if(choice ==2 ){
                player.food();
            }
            if(choice ==1){
                player.learn();
            }              
            player.setHealth((player.getHealth()-10));
            
            System.out.println("Health = "+player.getHealth());
            System.out.println("Brain Power = "+player.getBrainP() );

            if(turn ==8){
                player = new PlayerDay2(player);
            } 


if(player.getHealth()<=0){
                System.out.println("You didn't make it");
                choice=0;
            }
            turn += 1;
        }
    }
}
