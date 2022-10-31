package flyweightdesignpattern;

public class FlyWeightDesignPattern {

    // All player types and weapon (used by getRandPlayerType() and getRandWeapon()
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    
    public static void main(String[] args) {
     /* Assume that we have a total of 10 players in the game. */
        for (int i = 0; i < 10; i++){/* getPlayer() is called simply using the class name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandPlayerType());
            p.assignWeapon(getRandWeapon());    /* Assign a weapon chosen randomly uniformly from the weapon array  */
            p.mission();                        // Send this player on a mission
        }
    }
  
    // Utility methods to get a random player type and weapon
    public static String getRandPlayerType(){
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);         // Will return an integer between [0,2)
        return playerType[randInt];                 // return the player stored at index 'randInt'
    }
    public static String getRandWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);     // Will return an integer between [0,5)
        return weapons[randInt];                    // Return the weapon stored at index 'randInt'
    }
}
