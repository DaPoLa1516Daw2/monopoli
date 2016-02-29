<%-- 
    Document   : tablero
    Created on : 10-feb-2016, 17:14:57
    Author     : .David && Oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Partida Monopoly</title>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/monopoli/css/tablero.css" />
        <!--Latest compiled and minified CSS--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous" >
        <!--Optional theme--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <!--Latest compiled and minified JavaScript--> 
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="row" >
            <div class="jugadores">
            </div>
            <div class="dinero">

            </div>
        </div>

        <div class="col-sm-3">
            Diputacion <button class="btn btn-primary" >Comprar Casa<i class="glyphicon glyphicon-home"></i></button> 12
        </div>

        
        
        <div class="col-sm-7" >
            <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <table style="background-image: url(http://localhost:8080/monopoli/images/tablero.png);">
               
                <tr class="f1">
                    <td class="esquina" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="esquina" ></td>    
                </tr>
                
                <c:forEach var="i" begin="1" end="9">
                <tr>
                    <th class="horizontal" ></th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" ></th>

                </tr>
                </c:forEach>
                
                <tr class="f1">
                    <td class="esquina" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="vertical" ></td>
                    <td class="esquina" ></td>    
                </tr>
                
                
                
            </table>
        </div>
        
        
     



        <div class="col-sm-2">
            <div class="row" >
                <button class="btn btn-default" >Comprar Calle</button>
            </div>
            <div class="row" >
                <button class="btn btn-default" >Terminar Truno</button>
            </div>
            <div class="row" >
                <button class="btn btn-warning" >Retirada</button>
            </div>

        </div>


    </body>
</html>
