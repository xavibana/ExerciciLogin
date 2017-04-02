<%-- 
    Document   : formulari
    Created on : 02-abr-2017, 20:09:57
    Author     : Xavibana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <jsp:setProperty name="logueo" property="*" />
            <% if (request.getParameter("nom") == null) {%>
                <form method="post">
                    <p>Nom:<input type="text" name="nick" size="9"></p>
                    <p>Password:<input type="text" name="contrasenya" size="8"></p>
                    <input type="submit" value="acceder">
                </form>
            <%}else{ %>
            <jsp:forward page="Controlador?accio=login"/>
        <%}%>
        
        </div>
    </body>
</html>
