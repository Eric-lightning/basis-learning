import java.util.*;
public class MapTest {
public static void main(String[] args){

////////////////////////
// HashMap
HashMap<String,String> hmap = new HashMap<>();
////////////////
//add相当,put
//[instance].put(key,value);

hmap.put("ID","2557832");
hmap.put("First Name","Kichi");
hmap.put("Last Name","Gotou");
hmap.put("TEL","03-xxxx-yy");
hmap.put("Mail","k.goto@toku2.keishicho.jp");
hmap.put("Address","9-2-1 Jounanjima Ota-wards Tokyo Japan");

// forEachで表示
hmap.forEach((key,val) -> System.out.println(key+"->"+val));


}
}
