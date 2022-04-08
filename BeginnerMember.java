public class BeginnerMember extends Subscriber {
  //This member type inherits from Subscriber through "extends" avoiding redundancy.  

  //BeginnerMember has no specific attributes
    
    BeginnerMember (int mId, String mName, String phone, 
  String sLevel, boolean paid) {
      //we must pass on the arguments from the parent class Subscriber here
      super ( mId, "Beginner", mName, phone, sLevel, paid);//writing each member type as a string in the stack to avoid mismatching
      //Note that the member type variable is not passed on in the contructor but directly written as a string
    
    } 
    
}