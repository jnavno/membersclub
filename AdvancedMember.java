public class AdvancedMember extends Subscriber {
    //This member type inherits from Subscriber through "extends" avoiding redundancy.
    
    private String[] expertAreas;  //AdvancedMember has one or more areas of expertise:
    //Their expertise given in the task can be: programming language or computer architecture. 
    //But because there can be one or more of them, an array of Strings has been initialized to hold multiple strings as areas of expertise.
      
        
  AdvancedMember (int mId, String mName, String phone,String sLevel, boolean paid, String[] expertAreas) {
      //we must pass on the arguments from the parent class Subscriber here
      super ( mId, "Advanced", mName, phone, sLevel, paid);//writing each member type as a string in the stack to avoid mismatching
      //Note that the member type variable is not passed on in the contructor but directly written as a string
      this.expertAreas = expertAreas;
  } 
 
}
