package ObjectsAndClassesLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public String getTypeList() {
            return this.typeList;
        }

        public String setTypeList(String typeList) {
            return this.typeList = typeList;
        }

        public String setName(String name) {
            return this.name = name;
        }

        public String setTime(String time) {
            return this.time = time;
        }

        public String getName() {
            return this.name;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int numberSongs = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberSongs; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeList = scanner.nextLine();

        if (typeList.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
