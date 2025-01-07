import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> position = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            position.put(players[i], i);
        }
        
        for (String calling: callings) {
            int prev = position.get(calling);
            if (prev > 0) {
                int next = prev - 1;
                
                String temp = players[next];
                players[next] = calling;
                players[prev] = temp;
                
                position.put(calling, next);
                position.put(temp, prev);
            }
        }
        
        return players;
        
        
        // time out
        /*
        String reversal = "";
        
        for (int i = 0; i < callings.length; i++) {
            reversal = callings[i];
            for (int j = 0; j < players.length; j++) {
                if (players[j].equals(reversal)) {
                    players[j] = players[j - 1];
                    players[j - 1] = reversal;
                }
            }
        }
        return players;
        */
    }
}