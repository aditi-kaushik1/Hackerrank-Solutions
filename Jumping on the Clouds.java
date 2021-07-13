/* There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. 
The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. 
Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.
For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided. */

public static int jumpingOnClouds(List<Integer> c) {
        int n = c.size();
        int jumps = 0;
        int i = 0;
        while(i < n - 1) {
            if((i + 2) < n && c.get(i + 2) != 1) {
                i += 2;
                jumps++;
            }
            else {
                i += 1;
                jumps++;
            }
        }
        return jumps;
    }
