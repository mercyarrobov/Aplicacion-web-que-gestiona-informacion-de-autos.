<%--
  Created by IntelliJ IDEA.
  User: ESPE
  Date: 09/08/2023
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear Auto</title>
</head>
<body>
  <h1>Registrar un Auto</h1>
    <form action="autoController" method="post">
        <table>
            <input type="hidden" name="opcion" value="crear">
            <tr>
                <td>Marca</td>
                <td> <input type="text" name="marca"></td>
            </tr>
            <tr>
                <td>Placa</td>
                <td> <input type="text" name="placa"></td>
            </tr>
            <tr>
                <td>Modelo</td>
                <td> <input type="text" name="modelo"></td>
            </tr>

            <tr>
                <td>Cilindraje</td>
                <td> <input type="text" name="cilindraje"></td>
            </tr>

            <tr>
                <td>Año</td>
                <td> <input type="text" name="anio"></td>
            </tr>

            <tr>
                <td>Consumo</td>
                <td> <input type="text" name="consumo"></td>
            </tr>


        </table>
        <input type="submit" value="registro">
    </form>
</body>
</html>
