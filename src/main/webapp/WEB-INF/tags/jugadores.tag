<%-- 
    Document   : jugadores
    Created on : 29-feb-2016, 17:01:03
    Author     : .David
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="Jugador" items="${Jugadores}" varStatus="loop">
    <c:if test="${loop.index == turno}">
        <img src="/monopoli/${Jugador.ficha}" width="35" height="35" style="background: yellow;"  alt='${Jugador.nombre}' />
        ${Jugador.nombre} : ${Jugador.dinero}
    </c:if>
    <c:if test="${loop.index != turno}">
        <img src="/monopoli/${Jugador.ficha}" width="35" height="35" alt='${Jugador.nombre}' />
        ${Jugador.nombre} : ${Jugador.dinero}
    </c:if>    
</c:forEach>