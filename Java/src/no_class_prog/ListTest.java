import java.util.*;

public class ListTest{
    public static void main(String[] args){
    //////////////////
    // ArrayList
    ArrayList<String> alist = new ArrayList<String>();
    // add
    alist.add("Java");
    alist.add("C");
    alist.add("Node");
    alist.add("Rust");
    alist.add("Python");
    // get
    for(String i : alist){
        System.out.println(i);
    }
    //////////////////
    // LinkedList
    LinkedList<String> llist = new LinkedList<String>();
    // add
    llist.add("Mixi");
    llist.add("Facebook");
    llist.add("Twitter");
    llist.add("Instagram");
    // get
    llist.forEach(i -> System.out.println(i));
    //////////////////
    // Vector
    Vector<String> vlist = new Vector<String>();
    // add
    vlist.add("App");
    vlist.add("Transport");
    vlist.add("Session");
    vlist.add("Network");
    vlist.add("DataLink");
    vlist.add("Phisical");
    // get
    vlist.forEach(System.out::println);
    /////////////////////////////
    }
}
