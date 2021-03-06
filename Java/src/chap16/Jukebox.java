package chap16;

import java.util.*;
import java.io.*;

public class Jukebox
{
    ArrayList<Song> songList = new ArrayList<Song>();
    
    public static void main(String[] args) {
        new Jukebox().go();
    }

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    
    public void go() {
        getSongs();
        System.out.println("???l???ǡG" + songList);
        
        Collections.sort(songList);
        System.out.println("Title?r?????ǡG" + songList);
        
        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println("Artist?r?????ǡG" + songList);
        
        HashSet<Song> songHashSet = new HashSet<Song>();
        songHashSet.addAll(songList);
        System.out.println("Hash Set?G" + songHashSet);
        
        TreeSet<Song> songTreeSet = new TreeSet<Song>();
        songTreeSet.addAll(songList);
        System.out.println("Tree Set (Title?r??????)?G" + songTreeSet);
        
        songTreeSet = new TreeSet<Song>(artistCompare);
        songTreeSet.addAll(songList);
        System.out.println("Tree Set (Artist?r??????)?G" + songTreeSet);
    }
    
    void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close();
        } catch (Exception ex) { ex.printStackTrace(); }
    }
    
    void addSong(String lineToParse) {
        String[]tokens = lineToParse.split("/");
        songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
    }
}
