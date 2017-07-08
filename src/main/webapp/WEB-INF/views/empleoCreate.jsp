<%-- 
    Document   : empleoCreate
    Created on : Apr 14, 2017, 6:01:26 PM
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
        <link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.css"/>" />
        <title>Agregar Empleo</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Agregar Empleo</div>
                <div class="panel-body">
                    <f:form action="empleoAdd.htm" modelAttribute="emp">
                        
                        <p><f:label path="empresas.id">Empresa:</f:label>
                        <f:input path="empresas.id" cssClass="form-control" value="${emp.empresas.id}"/></p>
                        
                        <p><f:label path="personas.id">Persona:</f:label>
                        <f:input path="personas.id" cssClass="form-control" value="${emp.personas.id}"/></p>
                        
                        <p><f:label path="cargo">Cargo:</f:label>
                        <f:input path="cargo" cssClass="form-control" value="${emp.cargo}"/></p>
                        
                        <p>                
                            <f:label path="fechaInicio">Fecha de inicio:</f:label>
                            <f:input path="fechaInicio" cssClass="datepicker form-control"/>
                        </p>
                        
                        <p>                
                            <f:label path="fechaFin">Fecha de finalización</f:label>
                            <f:input path="fechaFin" cssClass="datepicker form-control"/>
                        </p>
                        
                        <br/>
                        <input type="submit" value="Guardar" class="btn btn-success"/>
                        <a href="empleoList.htm" class="btn btn-danger">Cancelar</a>
                    </f:form>
                </div>
            </div>    
        </div>
        
        <script src="<c:url value="/resources/js/jquery.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery-ui.js"/>"></script>
        <script src="<c:url value="/resources/js/funciones.js"/>"></script>
        
    </body>
</html>


