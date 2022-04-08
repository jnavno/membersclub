public class Test {

  public static void main (String[] args) {
  
    //creating the stack mm of type MemberManager with 25 spaces
    MemberManager mm = new MemberManager (25);
    //mId, String mType, String mName, String phone, String sLevel, boolean paid
    //all attributes pertaining to each member are held in this stack of arrays
    //adding the members
    mm.addMember(new AdvancedMember(10,"Moritz Laas","12356567745","retired", true, new String[]{"Python"}));//Instantiating AdvancedMember
    mm.addMember(new AdvancedMember(23,"Ben Thomson","1211234345","junior", true, new String[]{"C++"}));
    mm.addMember(new OfficerMember(28,"David Bowie","1234567645","retired", true, "head of club" ));
    mm.addMember(new OfficerMember(29,"Astor Piazzola","1211123345","junior", true, "finance officer"));
    mm.addMember(new JuniorMember(17,"Peter Green","2273645345","retired", false, 21));
    mm.addMember(new JuniorMember(11,"James Hendrix","1234676765","normal", false, 21));//Instantiating JuniorMemb
    mm.addMember(new OfficerMember(22,"Andreu Buenafuente","12921887345","retired", false, "purchasing officer"));
    mm.addMember(new OfficerMember(12,"Nicola Tesla","1234565655","normal", true, "head of club"));
    mm.addMember(new AdvancedMember(14,"Miles Davis","1231212145","normal", true, new String[]{"computer architecture"}));
    mm.addMember(new JuniorMember(24,"Leon Tolstoy","1233245345","junior", true, 23));
    mm.addMember(new JuniorMember(15,"Leonel O'Connor","1223234345","junior", true, 21));
    mm.addMember(new JuniorMember(16,"Ella Fitzgerald","1232345645","junior", false, 21));
    mm.addMember(new AdvancedMember(27,"Delvon Lamarr","1223345345","junior", true, new String[]{"computer architecture"}));
    mm.addMember(new OfficerMember(13,"Likke Li","1234556745","retired", false, "head of club"));
    mm.addMember(new JuniorMember(25,"Muhammad Ali","1237879945","normal", false, 23));
    mm.addMember(new JuniorMember(26,"Johnny Mitchell","1245467345","normal", true, 23));
    mm.addMember(new AdvancedMember(18,"Mariah Carey","1262654345","retired", false, new String[]{"Python"}));
    mm.addMember(new JuniorMember(19,"Tom Petty","1237355445","normal", false, 18));
    mm.addMember(new JuniorMember(20,"Scarlett O'Hara","1230298345","retired", true, 18));
    mm.addMember(new OfficerMember(21,"Fedor Dostoyevsky","1284756345","normal", true, "publicity officer"));
    
    /*
     * <SORTING ALGORITHM SWAP HERE>
     * In this state, Sort() only sorts members by Id.
     * In order to sort them by mType, sLevel and Id (as in Task 4), 
     * please change the name of the last method in the Subscriber's class called: "compareToT4" into "compareTo"
     * and then change the original compareTo method into compareToT2 (as in Task 2)
     * Then, run main again to see the output from Task 4.
     * 
     */
       
       // TESTING toString(), and sort():
    System.out.println (mm);//checking it prints the unsorted output.
    System.out.println ("sorted: ");//divides the list for easier understanding.
    mm.sort();//calling the sort function
    System.out.println (mm); //Testing that sort works correctly
    
      
        
       // TESTING removeMember() and addMember():
    mm.addMember(new OfficerMember(30,"Paola Moscoso","1334123225","junior", true, "finance officer"));
    System.out.println (mm); //expecting the whole unsorted list of members
    System.out.println ("* The above line contains the newly added member.");//test result from adding a new member.
    mm.removeMemberById(30);
    System.out.println (mm);//expecting all members without the one with Id 30
    System.out.println ("* The newly added member was removed from the above line.");//test result from removing a member.
    
    
    
       // TESTING findById() error handling:  
    System.out.println("* Id "+ 21 + " member's position is: "+ (mm.findById(21)));    
    //enter an Id that does not exist and ArrayIndexOutOfBoundsException should appear.
    //enter an Id that does exist and its location in the stack should appear.
    
      
  }

}
