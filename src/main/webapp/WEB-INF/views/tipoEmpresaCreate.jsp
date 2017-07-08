<%-- 
    Document   : provinciaEdit
    Created on : 23/02/2017, 20:13:22
    Author     : bob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Agregar Tipo Empresa</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Agregar Tipo Empresa</div>
                <div class="panel-body">
                    <!--f:form action="provinciaUpdate.htm" modelAttribute="provincia"-->
                    <f:form action="tipoEmpresaAdd.htm" modelAttribute="tipoEmp">
                        <p><f:label path="nombre">Nombre:</f:label>
                            <f:input path="nombre" cssClass="form-control" value="${tipoEmp.nombre}"/></p>
                        
                        <p><f:label path="descripcion">Descripción:</f:label>
                            <f:input path="descripcion" cssClass="form-control" value="${tipoEmp.descripcion}"/></p>
                        <br/>
                        <input type="submit" value="Guardar" class="btn btn-success"/>
                        <a href="tipoEmpresaList.htm" class="btn btn-danger">Cancelar</a>
                    </f:form>
                </div>
            </div>
        </div>
    </body>
</html>
