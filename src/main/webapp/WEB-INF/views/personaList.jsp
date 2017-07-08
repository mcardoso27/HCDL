<%-- 
    Document   : personaList
    Created on : Mar 30, 2017, 3:24:08 PM
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Listado de Personas</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado de Personas</h1>
                <p>
                    <a href="<c:url value="personaCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td><strong>ID</strong></td>
                            <td><strong>Nombre y apellido</strong></td>
                            <td><strong>DNI</strong></td>
                            <td><strong>Localidad</strong></td>
                            <td><strong>Dirección</strong></td>
                            <td><strong>Nacimiento</strong></td>
                            <td><strong>Sexo</strong></td>
                            <td><strong>Estado Civil</strong></td>
                            <td><strong>Cantidad de Hijos</strong></td>
                            <td><strong>Datos de interés</strong></td>
                            <td><strong>Acciones</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lst}" var="p">
                            <tr>
                                <td>${p.id}</td>
                                <td>${p.nombreyapellido}</td>
                                <td>${p.dni}</td>
                                <td>${localidadesLista[p.localidades.idLocalidad]}</td>
                                <td>${p.direccion}</td>
                                <td>${p.fechaNacimiento}</td>
                                <td>${p.sexo}</td>
                                <td>${p.estadoCivil}</td>
                                <td>${p.numeroHijos}</td>
                                <td>${p.datosVarios}</td>
                                <td>
                                    <p>
                                        <a href="<c:url value="personaEdit.htm?id=${p.id}" />" class="btn btn-primary btn-xs">
                                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Editar
                                        </a>
                                    </p>
                                    
                                        <a href="<c:url value="personaRemove.htm?id=${p.id}" />" class="btn btn-danger btn-xs" onclick="return confirm('Estás seguro?')">
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
