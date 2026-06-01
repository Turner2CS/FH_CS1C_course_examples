package week07_part03.solution;


import week07_part03.utility.MillionSongDataSubset;
import week07_part03.utility.SongEntry;

import java.util.Scanner;

public class FindSong
{
    public static void main(String [] args)
    {
        // Parses the JSON input file.
        final String JSONFILE = "resources/example_json_input/msd_subset_short.json";
        MillionSongDataSubset msd = new MillionSongDataSubset(JSONFILE);

        // Retrieves the parsed objects.
        SongEntry[] allSongs = msd.getArrayOfSongs();

        // Displays the number of songs read from the input file.
        System.out.printf("Total number of songs read %d \n", allSongs.length);

        // Creates a hash table of SongEntry objects with the song title as key.
        FHmapSC<String, SongEntry>  tableOfSongs = new FHmapSC<String, SongEntry>();

        // TODO: Iterate over "allSongs" and insert each SongEntry object in
        //       the table by the song title.
        for(int i = 0; i < allSongs.length; i++)
        {
            SongEntry currentSong = allSongs[i];
            String keyByTitle = currentSong.getTitle();
            tableOfSongs.insert(keyByTitle, currentSong);
        }

        System.out.println("The number of elements in table " + tableOfSongs.getElementCount());

        // Prompts the user for a title to search for.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a title to search for. For example \"Blues Power\" or \"does not exist\":");
        String request = keyboard.nextLine();
        // Checks if the table contains the user's request as key
        // TODO: Complete the implementation such that it checks if a key exists.
        boolean isFound = tableOfSongs.containsKey(request);
        // Displays a message based on whether the song is found.
        String message = isFound ? "found" : "not found";
        System.out.printf("Requested title \"%s\" is %s.\n", request,  message);
    }
}
