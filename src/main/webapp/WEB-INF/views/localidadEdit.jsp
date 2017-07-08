<%-- 
    Document   : localidadEdit
    Created on : Mar 21, 2017, 5:44:26 PM
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
        <title>Editar Localidad</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Editar Localidad</div>
                <div class="panel-body">
                    <f:form action="localidadUpdate.htm" modelAttribute="loc">
                                                
                        <f:hidden path="idLocalidad" value="${loc.idLocalidad}"/>
                        
                        <p><f:label path="nombre">Nombre:</f:label>
                            <f:input path="nombre" cssClass="form-control" value="${loc.nombre}"/></p>
                        
                        <p><f:label path="codigopostal">Código Postal:</f:label>
                        <f:input path="codigopostal" cssClass="form-control" value="${loc.codigopostal}"/></p>
                        
                        <p><f:label path="provincias.id">Provincia:</f:label>
                        <f:select path="provincias.id" cssClass="form-control">
                            <f:option value="0">Seleccione......</f:option>
                            <f:options items="${provinciaLista}"/>
                        </f:select></p>
                        
                        <br/>
                        <input type="submit" value="Guardar" class="btn btn-success"/>
                        <a href="localidadList.htm" class="btn btn-danger">Cancelar</a>
                    </f:form>
                </div>
            </div>    
        </div>
    </body>
</html>
