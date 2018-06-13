package learnByBook.Chapter11.lesson0421;

/**
 * Created by xin14.zhang on 2018/4/21.
 */
public final class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    public Address(String street,String city,String state,String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZip(){
        return zip;
    }
    public String getFullAddress(){
        return street +'\n'+city+','+state+' '+zip+'\n';
    }
}
