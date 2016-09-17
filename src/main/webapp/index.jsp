<html>
<head>
<%@page import="java.io.*" %>
<%@page import="java.net.*" %>
<%@page import="java.net.*" %>

</head>
<body>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    
   <%
   
   String recv;
   String recvbuff = "";
   
   URL jsonpage = new URL("http://192.168.218.2:8080/backend/webapi/myresource");
   URLConnection urlcon = jsonpage.openConnection();
   BufferedReader buffread = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));

   while ((recv = buffread.readLine()) != null){
    recvbuff += recv;
   }
   buffread.close();
   
 
    //ObjectMapper mapper = new ObjectMapper();
   //org.json.JSONObject jsonObject = new org.json.JSONObject(recvbuff);
   

   System.out.println(recvbuff);
%>
</body>
</html>
