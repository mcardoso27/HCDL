<%-- 
    Document   : empleoList
    Created on : Apr 14, 2017, 4:23:04 PM
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Listado de Empleos</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado de Empleos</h1>
                <p>
                    <a href="<c:url value="empleoCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td><strong>ID</strong></td>
                            <td><strong>IDEmpresa</strong></td>
                            <td><strong>IDEmpleado</strong></td>
                            <td><strong>Cargo</strong></td>
                            <td><strong>FechaInicio</strong></td>
                            <td><strong>FechaFin</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lst}" var="l">
                            <tr>
                                <td>${l.id}</td>
                                <td>${l.empresas.id}</td>
                                <td>${l.personas.id}</td>
                                <td>${l.cargo}</td>
                                <td>${l.fechaInicio}</td>
                                <td>${l.fechaFin}</td>
                                
                                <td>
                                    <a href="<c:url value="empleoEdit.htm?id=${l.id}" />" class="btn btn-primary btn-xs">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Editar
                                    </a>
                                        &nbsp;&nbsp;
                                    <a href="<c:url value="empleoRemove.htm?id=${l.id}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>Eliminar
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
                <hr/>
                <a href="index.htm">Volver a index</a>
            </div>
        </div>
    </body>
</html>
