public class JuniorMember extends Subscriber {
    //This member type inherits from Subscriber through "extends" avoiding redundancy.
 
  private int maOfficerId;//reference to find the Officer's Id to whom they are assigned.
    
    JuniorMember (int mId, String mName, String phone, String sLevel, boolean paid, int maOfficerId) {//because parent class Subscriber has no default constructor,
      //Passing on the arguments from the parent class Subscriber here
      super ( mId, "Junior", mName, phone, sLevel, paid);//and call them here using the super keyword
      //writing each member type as a string in the stack to avoid mismatching
      //Note that the member type variable is not passed on in the contructor but directly written as a string
      this.maOfficerId = maOfficerId;//initializing the specific attribute of JuniorMember
    } 
    
}
