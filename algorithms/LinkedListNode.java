package algorithms;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import java.sql.Timestamp;

public class LinkedListNode{
	
		public String file_name;
		public Timestamp timestamp;
		public int id;
		private static final AtomicInteger count = new AtomicInteger(0); 
		
		LinkedListNode(String file_name, Timestamp timestamp){
			this.file_name= file_name;
			this.timestamp = timestamp;
			this.id = count.incrementAndGet(); 
		}
		public  String getFilename() {
			return this.file_name;
		}
		public Timestamp getTimestamp() {
			return this.timestamp;
		
		}

}
