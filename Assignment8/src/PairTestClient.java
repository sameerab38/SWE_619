public class PairTestClient
{
   public static void main(String args[])
   {
      // create a pair of integer and Character
      Pair<Integer, Character> pair = new Pair<Integer, Character>(1, 'a');
      
      // print first and second elements in the original pair.
      int i = pair.getFirstElement();
      char c = pair.getSecondElement();
      System.out.println("Original pair: " + i + "," + c);
      
      // Modify first element in the pair object.
      pair.setFirstElement(2);
      i = pair.getFirstElement();
      
      // Modify first element in the pair object.
      pair.setSecondElement('b');
      c = pair.getSecondElement();

      // print modified numberPair.
      System.out.println("The pair after modification: " + i + "," + c);
      
      // calling to string method
      System.out.println(pair);
   }
}