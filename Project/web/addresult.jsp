<%-- 
    Document   : addresult
    Created on : Nov 25, 2020, 11:03:51 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=request.getAttribute("rowInserted") + " row is added " %> </h1>
        </br>
        <jsp:include page="menu.jsp" flush="true" />
    </body>
</html>
