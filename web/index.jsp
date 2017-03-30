<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 30.03.2017
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Разложение числа на множители</title>
  </head>
  <h1>Разложение числа</h1>
  <body>
  <form action = "params" method = "GET">
    <table border = "0">

      <tr>
        <td><b>Введите число</b></td>
        <td><input type = "text" name = "number"
                   size = "70"/></td>
      </tr>
      <tr>
        <td colspan = "2"><input type = "submit" value = "Start"/></td>
      </tr>
    </table>
  </form>
  </body>
</html>
