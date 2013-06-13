<%-- 
    Document   : index
    Created on : 16/05/2013, 04:42:14 PM
    Author     : usuario
-- hacer capa de persistencia.
--estudiar RFC 2616
www.ietf.org/rfc/rfc2616.txt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Menu Banco UdeA </h2>
        <a href = "BalanceServlet">Ver Saldo</a>
        <p/>
        <form action="DepositServlet">
            Ingrese Cuenta: <input type="text" name="cuenta" value="" /><br><br>
            Ingrese Monto: <input type="text" name="amount" value="" />
            <input type="submit" value="Ingresar Deposito"/>
        </form>
        <p/>
        <a href="closecuenta.jsp"> Cerrar Cuenta</a>
        
    </body>
</html>
