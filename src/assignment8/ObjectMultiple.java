package assignment8;

public class ObjectMultiple {
static int countObject; //take a static variable for count object
ObjectMultiple(){
	countObject++;
}
//design method for object count 
public static void getObjectCount() {
	System.out.println("number of object in class: "+countObject);
}
public static void main(String[] args) {
	ObjectMultiple objmul1=new ObjectMultiple();
	ObjectMultiple objmul2=new ObjectMultiple();
	ObjectMultiple objmul3=new ObjectMultiple();
	ObjectMultiple objmul4=new ObjectMultiple();
	ObjectMultiple objmul5=new ObjectMultiple();
	getObjectCount();
}

}
