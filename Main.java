package launch;

import java.io.IOException;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.HTTPConfiguration;
import org.eclipse.jetty.servlet.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.io.File;
import java.lang.Object;
import java.HTTPClient.*



public class Main extends HttpServlet {
  @Link 
  protected void Get(HTTPConnectionRequest con, HttpConnectionResponse resp)
     new HTTPConnectionRequest = 
	


	 throws ServletException, IOException {


  public void POST(HTTPServletRequest req, HTTPServletResponse resp)
	throws ServletException, IO Exception {
	  if (req.getRequestURI().endwith("/users")) {
		showDatabase(req, resp);
		userId = new String {};
		userId = userId.push();
		conn.setRequestProperty.userId.id.push(); 
		conn.setRequestProperty.userId.username.push();
		conn.setRequestProperty.userId.active.push(); 
		conn.setRequestProperty.userId.flexible_specs.push(); 
		Obejct flexible_specs = new String {
			"life_event": life_event.get(),
			2: 
			3
			4
			5
	} 
		Object demographics = new String {
			id: id.get(), 
			username: username.get(),
			active: true, 
			attributesName: {
				"Gender" : Gender.get(),
				"Age" : Age.get(),
				"Language" : Language.get(),
				"" : geo_location.get(), 
	}
	}
		JsonReader userInfo = new Json.createReader("userInfo");
		JsonObject userInfoObject = new userInfo.getObject("userId"); 
		return JsonReader.close(); 
	}
}

  public void doPOST(HTTPServletRequest req, HTTPServletResponse resp)
	throws ServletException, IO Exception {
		if(req.getRequestURI().endswith("/items")) {
		  showDatabase(req, resp);
		  userAttr = new String {};  
		  userAttr = user_id.push();
		  conn.setRequestProperty.userAttr.push(); 
		  conn.setRequestProperty.userAttr.id();
		  conn.setRequestProperty.userAttr.type(); 
		  conn.setRequestProperty.userAttr.name();
		  conn.setRequestProperty.userAttr.atributeNames()
		  Object attributeNames = new String {
			"title" : title.get(),
			"artist" : artist.get(), 
			"genre" : genre.get(),
			"price" : price.get(),
			"books" : books.get(),
		}
		 JsonReader userSocial = new Json.createReader("userSocial")
		 JsonObject userSocialObject = new userSocial.readObject("userAttr"); 
		 return jsonReader.close(); 
		  else {
		    throw System.err.println("Receive error: " + userSocial.getReasonLine()); 
}


}


  private void showDatabase(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    Connection connection = req.get();
    try {
      connection = getConnection();

      Statement stmt = connection.createStatement();
      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
      stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
      ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

      String out = "Hello!\n";
      while (rs.next()) {
          out += "Read from DB: " + rs.getTimestamp("tick") + "\n";
      }

      resp.getWriter().print(out);
    } catch (Exception e) {
      resp.getWriter().print("There was an error: " + e.getMessage());
    } finally {
      if (connection != req) try{connection.close();} catch(SQLException e){}
    }
  }

  private Connection getConnection() throws URISyntaxException, SQLException {
    URI dbUri = new URI(System.getenv("DB_URL"));

    String username = dbUri.getUserInfo().split(":")[0];
    String password = dbUri.getUserInfo().split(":")[1];
    int port = dbUri.getPort();

    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ":" + port + dbUri.getPath();

    return DriverManager.getConnection(dbUrl, username, password);
  }

  public static void main(String[] args) throws Exception {
    Server server = new Server(Integer.valueOf(System.getenv("PORT")));
    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");
    server.setHandler(context);
    context.addServlet(new ServletHolder(new Main()),"/*");
    server.start();
    server.join();
  }

  public static String httpGet(String urlStr) throws IOException {
  URL url = new URL(urlStr);
  HttpURLConnection conn =
      (HttpURLConnection) url.openConnection();

  if (conn.getResponseCode() != 200) {
    throw new IOException(conn.getResponseMessage());
  }

  // Buffer the result into a string
  BufferedReader rd = new BufferedReader(
      new InputStreamReader(conn.getInputStream()));
  StringBuilder sb = new StringBuilder();
  String line;
  while ((line = rd.readLine()) != null) {
    sb.append(line);
  }
  rd.close();

  conn.disconnect();
  return sb.toString();
  }

 public static String httpPost(String urlStr, String[] paramName, String[] paramVal) throws Exception {
  URL url = new URL(https://rest.developer.yodlee.com/services/srest/restserver/v1.0​/authenticate/coblogin);  
  //figure out way to implement Yodlee REST Agg API for coblogin verification 
  HttpURLConnection conn =
      (HttpURLConnection) url.openConnection();
  conn.setRequestMethod("POST");
  conn.setDoOutput(true);
  conn.setDoInput(true);
  conn.setUseCaches(false);
  conn.setAllowUserInteraction(false);
  conn.setRequestProperty("Content-Type",
      "application/x-www-form-urlencoded");


  // Create the form content
  OutputStream out = conn.getOutputStream();
  Writer writer = new OutputStreamWriter(out, "UTF-8");
  for (int i = 0; i < paramName.length; i++) {
    writer.write(paramName[i]);
    writer.write("=");
    writer.write(URLEncoder.encode(paramVal[i], "UTF-8"));
    writer.write("&");
  }
  writer.close();
  out.close();

  if (conn.getResponseCode() != 200) {
    throw new IOException(conn.getResponseMessage());
  }

  // Buffer the result into a string
  BufferedReader rd = new BufferedReader(
      new InputStreamReader(conn.getInputStream()));
  StringBuilder sb = new StringBuilder();
  String line;
  while ((line = rd.readLine()) != null) {
    sb.append(line);
  }
  rd.close();

  conn.disconnect();
  return sb.toString();
 }

}
