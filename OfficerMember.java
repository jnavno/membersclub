public class OfficerMember extends Subscriber {
    //This member type inherits from Subscriber through "extends" avoiding redundancy.
    
  private String responsibility;//each Junior has an Officer assigned to them  
    //Their responsibilities can be: head of club, publicity officer, purchasing officer and finance officer
    OfficerMember (int mId, String mName, String phone, 
  String sLevel, boolean paid, String responsibility) {//because parent class Subscriber has no default constructor,
      //we must pass on the arguments from the parent class Subscriber here
      super ( mId, "Officer", mName, phone, sLevel, paid);//and call them here using the super keyword//
      //writing each member type as a string in the stack to avoid mismatching
      //Note that the member type variable is not passed on in the contructor but directly written as a string
      this.responsibility = responsibility;//initializing the specific attribute of JuniorMember
    
    } 
    
    
    
        
  

 }