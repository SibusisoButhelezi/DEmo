import java.util.*;
import java.nio.file.*;
import java.util.Arrays;
import java.io.IOException;

class TestHashTable
{
   public TestHashTable ()
   {
   }
   
   // run the test with the threshold provided from args[0]
   void run ( int threshold)
   {
   	//Create variables to be used further down in the program
      List<String> lines = null;
      HashTable h = null;
      int i;
   
   // Read in the file to be hashed
      try {
         lines = Files.readAllLines (Paths.get ("names36.txt"));
      } catch (Exception e) {
         System.out.println (e.toString ());
      }   
      
      // Create loops to input all possible weights into run the program
   	for (int a = 0; a < 5; a++){
   	for (int b = 0; b < 5; b++){
   	for (int c = 0; c < 5; c++){
   	for (int d = 0; d < 5; d++){
   	for (int e = 0; e < 5; e++){
   	for (int f = 0; f < 5; f++){
   	for (int g = 0; g < 5; g++){
   	for (int j = 0; j < 5; j++){
   	for (int k = 0; k < 5; k++){
   	// Convert all numbers into 1 int array
   	int [] weights = {a, b, c, d, e, f, g, j, k};
      
	// create a HashTable and give it a weights value   
      h = new HashTable (weights);

      // Insert each line from the file into the hash table
      for (i=0; i<lines.size (); i++ )
      {
         h.insert (lines.get (i));
      }
      // Check if the collisions are less than the threshold
      // If so, print out the weights 
      if (h.getCollisions () <= threshold){
          // write weights into the file if they provide a perfect hash with 0 collisions 
          System.out.println(Arrays.toString(weights));
         }
      }}}}}}}}} // end of all loops
   }

   public static void main ( String [] args )
   {   
   	(new TestHashTable ()).run(Integer.valueOf (args[0]));	
   }
      
}

