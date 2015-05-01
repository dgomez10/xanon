
import AppEventsConstants;
import java.util.*;
import java.HTTPCLient.*;
import org.apache.jdbc.*;
import com.dbaccess.BasicDataSource;
import org.apache.HTTP.*;

class Payload {

    public static void main (String[] args) {
	//set requests in Header
	HTTPPoolingClientManager fb = conn.addAllHeaders("Facebook").setProperty("client_id").URL("https://graph.facebook.com/725968139/feed?access_token=))
	.redirect_uri("https://www.facebook.com/damian.gomezs/")
};

    private String query;
    private int mode;

    public get (String[] args) {
	//get URL 
	redirect_uri("https://graph.facebook.com/damian.gomezs/insights?fields=likes&period('week')&end_time_date('2011-06-26')")
	.("id") 

};

   public setQuery(String[] args) {
	

};
   public double setMode {
 	//focus on id:  flexible_spec JSON data
	Bundle parameters = new Bundle();
	parameters.putString(AppEventsConstants.EVENT_PARAM_VIEWED_CONTENT, "CURRENCY");
	parameters.putString(AppEventsConstants.EVENT_PARAM_SEARCH_STRING, "wedding%20ring");
	parameters.putString(AppEventsConstants.EVENT_PARAM_CONTENT_TYPE, "shoes");
	parameters.putString(AppEventsConstants.EVENT_PARAM_CONTENT_ID, "HDFU-8452");


//push it into a new array 
 


};
}

 public String FBInfo ([] ,"fbjson") {
 
   Array fbinfo = {}
 for fbinfo.sort(keys, sort_by["life_events", "behaviors", "geo_locations"]) 
	flexible_specs: new Array parsed_fb_info = {}
	//call those keys/attributes
	fbspecs = function( {
	return parsed_fb_info.sort
}



@link HTTPConnectionRequest fb_graph_call = new HTTPConnection("http://graph.facebook.com/damian.gomezs?client_id="725968139"?app_id="")
	if (fb_graph_call.getStatusCode() >= 300) {
		System.err.println("Recieved error: " + fb_graph_call.getReasonLine())
		System.err.println(fb_graph_call.getText())

	else 
		json_url = fb_graph_call.getData(fb_graph_call) //success call? 
		fbinfo.push.json_url(fb_graph_call) //proceed to FBInfo
}


@link HTTPRequest fbjson = new HTTPRequest("http://graph.facebook.com....")
 	
	fbinfo.getHeader(String, "<tbd>")	
	fbjson_parse = fbinfo.push.getData() //will parse through data 
	fbdata = JSON.parse(payload)  




//output based off all the info
Payload payload = new Payload();

payload.setQuery("life_events"); payload.setMode(0);
payload.setQuery("behaviors"); payload.setMode(0);
payload.setQuery("geo_locations"); payload.setMode(0);


payload.get("life_events"); payload.getMode(0); 

ResultType result = service  
    .path("graph-api").  
    .type(MediaType.APPLICATION_JSON)  
    .accept(MediaType.APPLICATION_JSON)  
    .get(ResultType.class, payload);



//push it to DB from local cache 


//local level 
 public static localDB {
	//connection 
	BasicDataSource localdb = new BasicDataSource(); 
	//set prop
	localdb = localdb.setServerName("").setDatabaseName("fb_sign_up_specs").setDescription("Initial Signup Specs")
	//push
	Contex ctx = new InitialContext();
	ctx.bind("xanon/src/main/db/fb_sign_up_specs", localdb)
	
	result = fb_sign_up_specs.push("localdb")

}

DataSource DriverManager 











 

