
package hadoop_xanon;
import java.util.*;
import javafx.application.Application 

public class HadoopYodlee extends Application {

	public static void main(String[] args, Object yodleeObject, facebookObject) {
		FileReader new yodlee = yodlee.get("../xanon/xanon/src/main/java/Yodlee.java");
		FileReader new facebook =  facbook.get("../xanon/xanon/src/main/java/Payload.java");
		JsonReader yodlee = new Json.createReader("yodlee");	
		JsonObject yodleeObject = new yodlee.readObject();
		return jsonReader.close();
		JsonReader facebook = new Json.createReader("Facebook");	
		JsonObject facebookObject = new facebook.readObject();
		return jsonReader.close();
	}
	
	public static void MapReduce(String[] args, Object yodleeObject, facebookObject) {
		@link Mapper = yodleeObject; 
		@link Reducer = facebookObject; 
		yodleeObject.mapTaskRunner();	
		facebookObject.mapTaskRunner();
		yodlee.reduceTaskRunner();
		facebook.reduceTaskRunner(); 
	} 
	public void MapReduceRunner(String[] args, Object yodleeObject, facebookObject) {
		yodleeObject.mapReduceTaskRunner();
		facebookObject.mapReduceTaskRunner();
		//outputs new file
		mapOutputFile.yodleeObject.prepare.close() .facebookObject.prepare.close();  
	}
	
	public void MergeSorter (String[] args, Object yodleeObject, facebookObject) {
		MergeSorter new = yodleeObject.rawKeyValueIterator(); 
		MergeSorter new = facebookObject.rawKeyValueIterator();
		//compare
		yodleeObject. facebookObject.compare(); 
		//getMemoryUtilized 
		yodleeObject, facebookObject.getMemoryUtilized();
	}
	public void Merger (String[] args) {
		//LocalDirAllocator
		Merge new = yodleeObject. facebookObject.localDirAllocator(); 
		Log.yodleeObject facebook.info.writeFile.getprogress();
	}	

	
}





