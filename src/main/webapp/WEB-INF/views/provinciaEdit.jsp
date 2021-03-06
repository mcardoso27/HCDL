<%-- 
    Document   : provinciaEdit
    Created on : 24/02/2017, 20:13:22
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Editar Provincia</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Editar Provincia</div>
                <div class="panel-body">
                    <f:form action="provinciaUpdate.htm" modelAttribute="prov">
                        <f:hidden path="id" value="${prov.id}"/>
                        
                        <p><f:label path="nombre">Nombre:</f:label>
                            <f:input path="nombre" cssClass="form-control" value="${prov.nombre}"/></p>
                        
                        <br/>
                        <input type="submit" value="Guardar" class="btn btn-success"/>
                        &nbsp;&nbsp;
                        <a href="provinciaList.htm" class="btn btn-danger">Cancelar</a>
                    </f:form>    
                        
                </div>
            </div>
        </div>
    </body>
</html>
