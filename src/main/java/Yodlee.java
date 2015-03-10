

import java.HTTPClient.*
import java.util.*
import com.dbaccess.BasicDataSource
import org.json
import javax.json
import java.lang.Object



public Yodlee {

  public void static () {
	@link HTTPConnectionRequest yodlee = new HTTPConnection ("https://rest.developer.yodlee.com/services/srest/restserver/v1.0​/authenticate/coblogin?cobrand_id=10010352") 
		if (yodlee() >= 300){
			System.err.println("Received Error: " + yodlee.getReasonLine())
}
		else 
			HttpURLConnection auth = (HttpURLConnection) url.openConnection("https://rest.developer.yodlee.com/services/srest/restserver/v1.0​/authenticate/login")
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			authUser = new String {}.;
			authUser = authUser.push(); //wro		
			conn.setRequestProperty.authUser.password("sbMemdgomez101#123"); 
			conn.setRequestProperty.authUser.login("sbMemdgomez101")
			conn.setRequestProperty.authUser.cobSessionToken("")
//userSessionToken? call 
			JsonReader userInfo = new Json.createReader("authUser");
			JsonObject userInfoObject = new userInfo.readObject();
			return jsonReader.close();

	@link HTTPConnectionRequest search = new HTTPConnection ("https://rest.developer.yodlee.com/services/srest/restserver/v1.0/jsonsdk​/SiteTraversal/searchSite")	
		if (search() >= 300){
			System.err.println("Receive Error: " + search.getReasonLine())
		else 
			conn.setRequestMethod("POST"); 
			conn.setDoInput(true);
			String siteInfo = new String {"1": "banks", "2": "credit unions", "3": "atm"}
			conn.setRequestProperty.siteSearchString("siteInfo");
			JsonReader siteInfo = new Json.createReader("siteSearchString");
			JsonObject siteInfoObject = new siteInfo.readObject();
			return jsonReader.close();
};
			
	@link HTTPConnectionRequest login = new HTTPConnection ("https://rest.developer.yodlee.com/services/srest/restserver/v1.0/jsonsdk​/SiteAccountManagement/getSiteLoginForm")
		if (login() >= 300){
			System.err.println("Receive error: " + login.getReasonLine())
		else
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			conn.setRequestProperty.siteId();
			JsonReader Form = new Json.createReader("siteId");
			JsonObject FormObject = new Form.readObject();
			return jsonReader.close();
};

	@link HTTPConnectionRequest addSites = new HTTPConnection ("https://rest.developer.yodlee.com/services/srest/restserver/v1.0/jsonsdk​/SiteAccountManagement/addSiteAccount1")
		if (addSites() >= 300){
			System.err.println("Receive error: " + addSites.getReasonLine())
		else 
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			Int siteVisit = new Int ["0", "100"]
			conn.setRequestProperty.credentialFields.enclosedType();
			conn.setRequestProperty.credentialFields["siteVisit"].displayName();
			conn.setRequestProperty.credentialFields["siteVisit"].fieldType.typeName();
			conn.setRequestProperty.credentialFields["siteVisit"].name();
			conn.setRequestProperty.credentialFields["siteVisit"].value();
			conn.setRequestProperty.credentialFields["siteVisit"].valueIdentifier();
			conn.setRequestProperty.credentialFields["siteVisit"].valueMask();
			conn.setRequestProperty.credentialFields["siteVisit"].isEditable();
			JsonReader siteAccountInfo = new Json.createReader("credentialFields");	
			JsonObject siteAccountInfoObject = new siteAccountInfo.readObject();
			return jsonReader.close();

};
	@link HTTPConnectionRequest transactions = new HTTPConnection ("https://rest.developer.yodlee.com/services/srest/restserver/v1.0/jsonsdk​/DataService/getItemSummariesForSite")
		if (transactions() >= 300){
			System.err.println("Receive error: " + transactions.getReasonLine())
		else 
			conn.setRequestMethod("POST");
			conn.setDoInput(true);
			conn.setRequestProperty.memSiteAccId();
};

	@link HTTPConnectionRequest transactionList = new HTTPConnection ("https://rest.developer.yodlee.com/services/srest/restserver/v1.0/jsonsdk​/TransactionSearchService/executeUserSearchRequest")
		if (transactionList() >= 300){
			System.err.println("Receive error: " + transactionList.getReasonLine())
		else 
			
			conn.setRequestProperty.transactionSearchRequest.containerType="all";
			conn.setRequestProperty.transactionSearchRequest.higherFetchLimit(300);
			conn.setRequestProperty.transactionSearchRequest.resultRange.endNumber("100");
			conn.setRequestProperty.transactionSearchRequest.searchClients.clientName();
			conn.setRequestProperty.transactionSearchRequest.searchFilter.transactionsSplitType("ALL_TRANSACTION");
			JsonReader transactionSearchRequest = new Json.createReader("transactionSearchrequest");
			JsonObject transactionSearchRequestObject = new transactionSearchRequest.readObject("transactionSearchRequest");
			return jsonReader.close(); 
			return 

transactionSearchRequest.searchFetchRequest.searchIdentifier.identifier().searchResultRange.endnumber()
}; 				
	@link HTTPConnectionRequest fetchpage = new HTTPConnection ("")

};
    public static localDB {
	//connection 
	BasicDataSource localdb = new BasicDataSource(); 
	//set prop
	localdb = localdb.setServerName("carrotcake").setDatabaseName("yodlee_info").setDescription("Initial Yodlee Transc")
	//push
	Contex ctx = new InitialContext();
	first_db = ctx.bind("xanon/main/scr/db/yodlee_info", localdb);
	

};

};


