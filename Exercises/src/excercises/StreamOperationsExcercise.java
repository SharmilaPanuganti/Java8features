package excercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamOperationsExcercise {
    static List<Player> players = new ArrayList<>();
    static {
        players.add(new Player("David", 200, 5000, 150, "Australia"));
        players.add(new Player("Dhoni", 500, 7500, 150, "India"));
        players.add(new Player("Kohli", 250, 9000, 90, "India"));
        players.add(new Player("Kane", 300, 4000, 90, "Sri lanka"));
    }

    public static void displayPlayers() {
        players.stream().forEach(p -> System.out.println(p.getPlayerName()));

    }

    public static void displayPlayerCountry(String country) {
        List<String> playerCountry = players.stream()
                .filter(p -> (p.getCountry().equalsIgnoreCase(country) && (p.getHighestscore() < 100)))
                .map(Player::getPlayerName).collect(Collectors.toList());
        System.out.println("Players with highest score in " + country);
        playerCountry.forEach(System.out::println);

    }

    public static LinkedList<String> getPlayerNames() {
        return players.stream().filter(p -> p.getRuns() > 5000)
                .map(Player::getPlayerName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedList::new));
    }

    public static int getAverageRuns(String country) {
        return (int) players.stream()
                .filter(p -> p.getCountry().equalsIgnoreCase(country))
                .mapToInt(Player::getRuns)
                .average().orElse(0.0);
    }

    public static List<String> getPlayerNamesSorted() {

        return players.stream()
                .sorted(Comparator.comparing(Player::getCountry)
                        .thenComparing((p1, p2) -> p2.getMatchesPlayed() - p1.getMatchesPlayed()))
                .map(Player::getPlayerName)
                .collect(Collectors.toList());
    }

    public static Map<String, String> getPlayerCountry() {
        Map<String, String> map = players.stream()
                .filter(p -> p.getMatchesPlayed() > 200)
                .collect(Collectors.toMap(Player::getPlayerName, Player::getCountry));
        return map;
    }
    public static String getMaxRunsPlayer(){
        Player p=players.stream().max(Comparator.comparingInt(Player::getRuns)).orElse(null);
        return p.getPlayerName();
    }
    public static Player findPlayer(String name, String country){
    
         Optional<Player> optionalPlayer = players.stream()
                .filter(player -> player.getPlayerName().equals(name) && player.getCountry().equals(country))
                .findFirst();

        return optionalPlayer.orElse(null);
    }
    public static boolean checkHighestScore(String country){
        return players.stream().anyMatch(p->p.getCountry().equals(country)&&p.getRuns()>10000);
    }

    public static void main(String[] args) {
        displayPlayers();
        System.out.println("------------------------------------------");
        displayPlayerCountry("India");
        System.out.println("------------------------------------------");
        LinkedList<String> playershighestRuns = getPlayerNames();
        System.out.println("Players with >5000 runs");
        playershighestRuns.forEach(System.out::println);
        System.out.println("Average runs in India: " + getAverageRuns("India"));
        System.out.println("Players sorted :");
        getPlayerNamesSorted().forEach(System.out::println);
        System.out.println("Players played more than 200 matches");
        System.out.println(getPlayerCountry());
        System.out.println("Player with max runs "+getMaxRunsPlayer());
        System.out.println("Player:"+findPlayer("Kohli", "India"));
        System.out.println("Is a player scored more than 1000 runs "+checkHighestScore("India"));
    }
}
