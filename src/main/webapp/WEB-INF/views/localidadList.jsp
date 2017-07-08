<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Listado de Localidades</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado de Localidades</h1>
                <p>
                    <a href="<c:url value="localidadCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td><strong>ID</strong></td>
                            <td><strong>Localidad</strong></td>
                            <td><strong>Código Postal</strong></td>
                            <td><strong>Provincia</strong></td>
                            <td><strong>Acciones</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lst}" var="l">
                            <tr>
                                <td>${l.idLocalidad}</td>
                                <td>${l.nombre}</td>
                                <td>${l.codigopostal}</td>
                                
                                <td>${provinciaLista[l.provincias.id]}</td>
                                
                                <td>
                                    <a href="<c:url value="localidadEdit.htm?id=${l.idLocalidad}" />" class="btn btn-primary btn-xs">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Editar
                                    </a>
                                        &nbsp;&nbsp;
                                    <a href="<c:url value="localidadRemove.htm?id=${l.idLocalidad}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
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
