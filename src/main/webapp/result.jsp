<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
	<% if(request.getAttribute("msg1") != null) { %>
   <h1> 
     <%= request.getAttribute("msg1") %>
    </h1>
   <% } %>
   
   <% if(request.getAttribute("msg2") != null) { %>
   <h1> 
     <%= request.getAttribute("msg2") %>
    </h1>
   <% } %>
   
   <% if(request.getAttribute("msg3") != null) { %>
   	<h1> 
     <%= request.getAttribute("msg3") %>
    </h1>
   <% } %>
   
</body>
</html>