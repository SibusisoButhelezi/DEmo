class HashTableFunctions
{
   // hash function weights
   // 9 integers, each in the range 0-5 to act as weights for the characters in the keys
   int [] weights = {1, 1, 1, 1, 1, 1, 1, 1, 1};
   // ADD YOUR WEIGHTS INSTEAD OF 1s

   // returns True if the hash table contains string s
   // return False if the hash table does not contain string s
   HashTableFunctions(){
   	
   }
   boolean find ( String s, int h, int hashTableSize, String [] hashTableArray )
   {
      // WRITE YOUR CODE HERE
      
      while (! hashTableArray[h].equals (""))
      {
      	if (hashTableArray[h] == s)
      		return true;
         h = (h+1) % hashTableSize;
       }
      return false;
   }
}	
