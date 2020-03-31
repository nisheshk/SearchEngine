package algorithms;
import java.util.LinkedList;
import java.sql.Timestamp;

public class LinkedListOperation {
	public LinkedList linked_list_object;
	
	public LinkedListOperation(){
		
		LinkedList<LinkedListNode> linked_list_object = new LinkedList<LinkedListNode>();
		this.linked_list_object = linked_list_object;
	}
	
	
	public void add_node_beginning(String url_name) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		LinkedListNode obj = new LinkedListNode(url_name,timestamp);
		System.out.println(obj.file_name + obj.timestamp);
		linked_list_object.addFirst(obj);
		
	}
	
	public void delete_node(int url_id) {
		
		boolean flag = false;
		for (int i = 0; i < linked_list_object.size(); i++) {
        	int id = ((LinkedListNode) linked_list_object.get(i)).id;
        	if ( url_id == id ) {
        		linked_list_object.remove(i);
        		flag = true;
        		break;
        	}
        	
        }
		if (flag) System.out.println("\n*****URL successfully deleted******\n");
    	if (!flag) System.out.println("\n!!!!!!!!!!Id not found!!!!!!!!!!\n");
	}
	
	public void clear_list() {
		System.out.println("\n****Browser History has been cleared*****\n");
		linked_list_object.clear();
	}
	
	public void display_list() {
		
		if (linked_list_object.size() == 0) {
			System.out.println("\n****No Browser History*****\n");
			return ;
		}
		System.out.println("\n****Browser's History*****\n");
		for (int i = 0; i < linked_list_object.size(); i++) {
			System.out.print(((LinkedListNode) linked_list_object.get(i)).id + ". ");
        	System.out.print("\t" + ((LinkedListNode) linked_list_object.get(i)).getFilename());
        	System.out.println("\t"+((LinkedListNode) linked_list_object.get(i)).getTimestamp());
        }
		System.out.println("\n");
	}

	}


