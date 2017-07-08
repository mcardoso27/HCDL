<%-- 
    Document   : empresaList
    Created on : Mar 22, 2017, 2:49:52 PM
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Listado de Empresas</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado de Empresas</h1>
                <p>
                    <a href="<c:url value="empresaCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td><strong>ID</strong></td>
                            <td><strong>Nombre</strong></td>
                            <td><strong>Dirección</strong></td>
                            <td><strong>Empleados</strong></td>
                            <td><strong>Capital</strong></td>
                            <td><strong>ART</strong></td>
                            <td><strong>NombreART</strong></td>
                            <td><strong>TipoEmpresa</strong></td>
                            <td><strong>Localidad</strong></td>
                            <td><strong>Antigüedad</strong></td>
                            <td><strong>Médico</strong></td>
                            <td><strong>EspecialistaHyS</strong></td>
                            <td><strong>Acciones</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lst}" var="emp">
                            <tr>
                                <td>${emp.id}</td>
                                <td>${emp.nombre}</td>
                                <td>${emp.direccion}</td>
                                <td>${emp.numeroEmpleados}</td>
                                <td>${emp.propiedadCapital}</td>
                                ${emp.art==true ? "<td>Si</td>" : "<td>No</td>"}
                                <td>${emp.nombreArt}</td>
                                <td>${tiposEmpLista[emp.tiposEmpresas.id]}</td>
                                <td>${localidadesLista[emp.localidades.idLocalidad]}</td>
                                <td>${emp.antiguedad}</td>

                                ${emp.medico==true ? "<td>Si</td>" : "<td>No</td>"}
                                ${emp.especialistaHigiene==true ? "<td>Si</td>" : "<td>No</td>"}

                                <td>
                                    <p>
                                        <a href="<c:url value="empresaEdit.htm?id=${emp.id}" />" class="btn btn-primary btn-xs">
                                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
                                        </a>
                                    </p>


                                    <a href="<c:url value="empresaRemove.htm?id=${emp.id}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
                                        <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Eliminar
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
