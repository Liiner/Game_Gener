import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String rpgList = "/home/liiner/IdeaProjects/Game_Gener/src/main/resources/RPG";
        String gameList = "/home/liiner/IdeaProjects/Game_Gener/src/main/resources/GameList";
        PrintWriter pw = new PrintWriter(rpgList);
        File file = new File(gameList);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            String[] cols = line.split(",");
            if(cols[1].equals("rpg")){
                pw.println(cols[0]);
            }
            System.out.println(line);
            line = reader.readLine();
            pw.close();

        }
    }
}
