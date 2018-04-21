package Chapter11.lesson0421;


/**
 * Created by xin14.zhang on 2018/4/21.
 */
public class Person {
    private Name name;
    private Address address;
    public Person(){
        this(new Name("Jill",'S',"Barr"),new Address("100 Main","Savannah","GA","31411"));
    }
    public Person(Name name,Address address){
        this.name = name;
        this.address = address;
    }
    public Name getName(){
        return name;
    }
    public void setName(Name name){
        this.name = name;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public String toString(){
        return '\n'+name.getFullName()+'\n'+address.getFullAddress()+'\n';
    }
    public int compareTo(Object o){
        return name.compareTo(((Person)o).name);
    }
}
