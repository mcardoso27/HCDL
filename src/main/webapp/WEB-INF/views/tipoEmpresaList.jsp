<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Listado de Tipos de Empresas</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Listado de Tipos de Empresas</h1>
                <p>
                    <a href="<c:url value="tipoEmpresaCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                </p>
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <td><strong>ID</strong></td>
                            <td><strong>Tipo de Empresa</strong></td>
                            <td><strong>Descripción</strong></td>
                            <td><strong>Acciones</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${lst}" var="te">
                            <tr>
                                <td>${te.id}</td>
                                <td>${te.nombre}</td>
                                <td>${te.descripcion}</td>
                                <td>
                                    <p>
                                        <a href="<c:url value="tipoEmpresaEdit.htm?id=${te.id}" />" class="btn btn-primary btn-xs">
                                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>Editar
                                    </a>
                                    </p>
                                    
                                        <!--&nbsp;&nbsp;-->
                                    <a href="<c:url value="tipoEmpresaRemove.htm?id=${te.id}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
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
