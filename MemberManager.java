public class MemberManager {
    //MemberManager holds the stack of arrays and manages the members of the system
    private Subscriber[] members;
    public int currentSize;
    public int maximumSize;
    
  public MemberManager  (int maximumSize) {
    members = new Subscriber[maximumSize];
    this.maximumSize = maximumSize;
    this.currentSize = 0;  
  }
  
  public void addMember (Subscriber member) {
     if(currentSize>=maximumSize)
     return;
      members[currentSize] = member ;
     currentSize ++;
  }
    
    
  public int findById (int Id) {
        if(Id < 0 ){
            System.out.println ("Error Id is out of bounds");//checking that Id is correct
            throw new ArrayIndexOutOfBoundsException (Id);
        }        
      
        for (int i=0; i<currentSize; i=i+1) {
             if(members[i].mId == Id)//finds the location of a member given its Id number
                return i;//returns the position where the specific member is located
                
        }
        throw new ArrayIndexOutOfBoundsException (Id);
    
  }
    
  public void removeMember (int index) {
        if (index < 0 || index >= currentSize) {
            // checking that the index is correct
           System.out.println ("Error in deletion: index is out of bounds");
           throw new ArrayIndexOutOfBoundsException (index);
        }
        
        for (int i=index; i<currentSize-1; i=i+1) {
            members[i] = members[i+1];
        }
        currentSize = currentSize - 1;
  }
    
    
  public void removeMemberById (int Id) {
                
        removeMember(findById(Id));
        
  }
    
    //a wrapper of toString found in Subscriber class
    public String toString () {
    
    String result = "";//initializes the variable for output
    result = result;
    for (int i=0; i<currentSize; i=i+1) {//walks through each item in the array
      result = result + members[i];
      if (i+1<currentSize) {    
        result = result + "\n";//starts printing the next array in a new line
      }//although it is a concatenation
    }
    result = result;

    return result;
  }
    //function called in Test class to run sorting on members
  public void sort () {
    bubbleSort(members, currentSize);
        
  }  
     
    //bubble sort extension, to perform the actual swap of elements
  public static void swap (Subscriber[] numbers, int i1, int i2) {
    Subscriber temp;

    temp = numbers[i1];
    numbers[i1] = numbers[i2];
    numbers[i2] = temp;
  }


    //takes in Subscriber data-type called numbers and its size (currentSize)
    //This method sorts the items in the string of numbers, which is "members".
    //This method is called by sort() in Test class, see above.
  public static void bubbleSort (Subscriber[] numbers, int size) {
    boolean madeSwap;                                    

    do {                                                 
      madeSwap = false;                                   
      for (int i = 0; i < size-1; i = i + 1) {  
        if (0>numbers[i].compareTo(numbers[i+1])) { //<1>
          swap (numbers, i, i+1);   //swaps the items                     
          madeSwap = true;    
          //<1> Here the "0>" condition forces compareTo to equal -1
          //this the method to run its sorting algorithm when compareTo return -1 only.
          //if true, therefore, it will pass the "if" condition and run "swap" 
          //fulfilling its sorting purpose
        }
      }
    } while (madeSwap);                                
  }
  
 

}


