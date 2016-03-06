<%-- 
    Document   : tablero
    Created on : 10-feb-2016, 17:14:57
    Author     : .David && Oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct" tagdir="/WEB-INF/tags"%>
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
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    </head>
    <body>
        <div >
            <div class="jugadores">
                <ct:jugadores />
            </div>
            <div class="dinero">

            </div>
        </div>

        <div class="col-sm-3">
            <c:forEach var="calles" items="${jCasillas}" varStatus="loop">
                Diputacion ${calles} <button class="btn btn-primary" >Comprar Casa<i class="glyphicon glyphicon-home"></i></button> 12
            </c:forEach>
        </div>

        <div class="col-sm-7" >
            <table style="background-image: url(http://localhost:8080/monopoli/images/tablero.png);">
                <tr class="f1">
                    <td class="esquina" >${Casillas[20]}</td>
                    <td class="vertical" >${Casillas[21]}</td>
                    <td class="vertical" >${Casillas[22]}</td>
                    <td class="vertical" >${Casillas[23]}</td>
                    <td class="vertical" >${Casillas[24]}</td>
                    <td class="vertical" >${Casillas[25]}</td>
                    <td class="vertical" >${Casillas[26]}</td>
                    <td class="vertical" >${Casillas[27]}</td>
                    <td class="vertical" >${Casillas[28]}</td>
                    <td class="vertical" >${Casillas[29]}</td>
                    <td class="esquina" >${Casillas[30]}</td>    
                </tr>

                
                <tr>
                    <th class="horizontal" >${Casillas[19]}</th>
                    <th class="horizontal" colspan="9">Bote: ${Bote}</th>
                    <th class="horizontal" >${Casillas[31]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[18]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[32]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[17]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[33]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[16]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[34]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[15]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[35]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[14]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[36]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[13]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[37]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[12]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[38]}</th>
                </tr>
                <tr>
                    <th class="horizontal" >${Casillas[11]}</th>
                    <th class="horizontal" colspan="9"></th>
                    <th class="horizontal" >${Casillas[39]}</th>
                </tr>
                
                

                <tr class="f1">
                    <td class="esquina" >${Casillas[10]}</td>
                    <td class="vertical" >${Casillas[9]}</td>
                    <td class="vertical" >${Casillas[8]}</td>
                    <td class="vertical" >${Casillas[7]}</td>
                    <td class="vertical" >${Casillas[6]}</td>
                    <td class="vertical" >${Casillas[5]}</td>
                    <td class="vertical" >${Casillas[4]}</td>
                    <td class="vertical" >${Casillas[3]}</td>
                    <td class="vertical" >${Casillas[2]}</td>
                    <td class="vertical" >${Casillas[1]}</td>
                    <td class="esquina" >${Casillas[0]}</td>    
                </tr>
            </table>
        </div>

        <div class="col-sm-2">
            <div class="row" >
                <a class="btn btn-default" href="/monopoli/Juego/compraCalle">Comprar Calle</a>
            </div>
            <div class="row" >
                <a class="btn btn-default" href="/monopoli/Juego/avanzaTurno">Terminar Truno</a>
            </div>
            <div class="row" >
                <a class="btn btn-warning" href="/monopoli/Juego/Dado">Tirar Dado</a>
            </div>
            <div class="row" >
                <img src="/monopoli/images/${d12}_12.svg" width="100" height="100" />
            </div>
            
        </div>
    </body>
</html>
