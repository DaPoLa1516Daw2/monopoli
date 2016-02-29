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
    </head>
    <body style="padding: 5px; margin-top: 10px;">
        <form method="POST" action="Juego/Entrar">
            
            <div class="col-sm-12 name"> 
                <label class="col-sm-offset-4 col-sm-1 control-label" for="Nombre">Nombre: </label>
                <div class="col-sm-3" > 
                    <input type="text" class="form-control" name="Nombre"/>
                </div>
            </div>
            
            
            <div class="icons">
                <img src="images/UserIcon1.png" alt="UserIcon1"/>
                <img src="images/UserIcon2.png" alt="UserIcon2"/>
                <img src="images/UserIcon3.png" alt="UserIcon3"/>
                <img src="images/UserIcon4.png" alt="UserIcon4"/>
            </div>
            <div class="icons-value">
                <input type="radio" name="UserIcon" value="images/UserIcon1.png"/>
                <input type="radio" name="UserIcon" value="images/UserIcon2.png"/>
                <input type="radio" name="UserIcon" value="images/UserIcon3.png"/>
                <input type="radio" name="UserIcon" value="images/UserIcon4.png"/>
            </div>
            
            <input type="submit" class="col-sm-offset-6 btn btn-default" value="Entrar"/>
        </form>
    </body>
</html>
