<%-- 
    Document   : index
    Created on : 27-feb-2016, 13:16:22
    Author     : oscar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monopoly</title>
        <!--Latest compiled and minified CSS--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous" >
        <!--Optional theme--> 
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <!--Latest compiled and minified JavaScript--> 
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/UserIdent.css"/>
        <script src="js/loadForm.js"></script>
    </head>
    <body onload="init()" style="padding: 5px; margin-top: 10px;">
        <form method="POST" action="Juego/Entrar">

            <div class="col-sm-12">
                <label for="nJugadores" class="control-label col-sm-1">NºJugadores:</label>
                <div class="form-group col-sm-3" >
                    <input type="number" class="form-control" id="nJ" value="2" name="nJugadores" min="2" max="8" />
                </div>
            </div>

            <div id="load">
                <div class="col-sm-12">
                    <label for="Nombre" class="control-label col-sm-1">Nombre: </label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control col-sm-1" name="Nombre"/>
                    </div>
                    <img src="images/UserIcon1.png" class="col-sm-1" width="35" height="35" alt="UserIcon1"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon1.png"/>
                    <img src="images/UserIcon2.png" class="col-sm-1"  width="35" height="35" alt="UserIcon2"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon2.png"/>
                    <img src="images/UserIcon3.png" class="col-sm-1"  width="35" height="35" alt="UserIcon3"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon3.png"/>
                    <img src="images/UserIcon4.png" class="col-sm-1"  width="35" height="35" alt="UserIcon4"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon4.png"/>
                </div>
                <div class="col-sm-12">
                    <label for="Nombre" class="control-label col-sm-1">Nombre: </label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control col-sm-1" name="Nombre"/>
                    </div>
                    <img src="images/UserIcon1.png" class="col-sm-1" width="35" height="35" alt="UserIcon1"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon1.png"/>
                    <img src="images/UserIcon2.png" class="col-sm-1"  width="35" height="35" alt="UserIcon2"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon2.png"/>
                    <img src="images/UserIcon3.png" class="col-sm-1"  width="35" height="35" alt="UserIcon3"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon3.png"/>
                    <img src="images/UserIcon4.png" class="col-sm-1"  width="35" height="35" alt="UserIcon4"/>
                    <input type="radio" name="UserIcon" class="col-sm-1"  value="images/UserIcon4.png"/>
                </div>
            </div>

            <input type="submit" class="btn btn-default" value="Entrar"/>
        </form>
    </body>
</html>
