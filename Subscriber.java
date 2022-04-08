
//Subscriber is the parent class for all the rest of members

//Common Objects to all subclasses: mId, mType, mName, sLevel, paid

public class Subscriber implements Comparable<Subscriber> {

    public int mId ;
    private String mType, mName, phone, sLevel ;
    private boolean paid;

    public Subscriber (int mId, String mType, String mName, String phone, 
    String sLevel, boolean paid)  {

        this.mId=mId;
        this.mType= mType;
        this.mName= mName;
        this.phone= phone;
        this.sLevel= sLevel;
        this.paid = paid;
    }

    //Only prints a part of the information held in Subscriber, i.e. skips phone and members specific attributes.
    public String toString () {
        String result = "";

        result += mId + ", "+ mType + ", " + mName + ", "  
        + sLevel ; 
        if(paid){result+= ", yes" ;}
        else{result+=", no";}

        return result ;
    }
    
    /* TASK 3
     * This method sorts all members by Id <ONLY>
     * 
     */
    //implementing compareTo by taking an instance "s" of Subscriber
    public int compareTo (Subscriber s) {       //<PLEASE CHANGE METHOD's NAME HERE WHEN TESTING IN MAIN>
       if(mId == s.mId){
            return 0;//since Id's coincide, search next
       }else if(mId > s.mId){
            return -1;//sort them by Id
       }else{
            return 1;//search next item
       }
    }
         
       
    /* TASK 4
     * This method sorts members who didn't pay first.
     * Then, members who didn't pay, are grouped by mType.
     * Then, members of each mType are sorted by sLevel and then they are sorted by mId.
     * 
     */ 
    public int compareToT4 (Subscriber s) {     //<PLEASE CHANGE METHOD's NAME HERE WHEN TESTING IN MAIN>
       if(s.paid==paid){//checking that both items in the "paid" category are equal
           if(s.paid) {//Sorting by Id for PAID members
                if(mId == s.mId){//checking that Id's are equal
                    return 0;//search next item since Id's coincide
                }else if(mId > s.mId){//if one is bigger than the other, they'll need sorting
                    return -1;//sort them by Id
                }else{
                    return 1;//search next item
                }
           }else{//Sorting section for NON - PAID members
               if(s.mType==mType){//checking that member types are equal
                   if( s.sLevel== sLevel){//checking that subscription levels are equal
                        if(mId == s.mId){
                            return 0;//search next item since Id's coincide
                        }else if(mId > s.mId){
                            return -1;//sort them by Id
                        }else{
                            return 1;//search next item
                        }
                   }else{ 
                        return s.sLevel.compareTo(sLevel);//string comparison, if the same will return 0
                   }
               }else{
                   return s.mType.compareTo(mType);//string comparison, if the same will return 0
               }
           }
       }else{
            if(paid){
                return -1;//because both paid categories are not equal, sort them (-1)
            }
            else{
                return 1;//search next item
            }
        }
    }  
             
       
     
  
}