<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h3 class="page-header">Listado de Usuarios
                <a href="<c:url value="userCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
            </h3>
        </div>
    </div>
    <table class="table table-bordered table-striped table-hover">
        <thead>
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Nombre de usuario</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.ssoId}</td>
                    <td>
                        <a href="<c:url value="provinciaEdit.htm?id=${user.id}" />" class="btn btn-primary btn-xs">
                            <span class="fa fa-info" aria-hidden="true"></span>
                        </a>
                        &nbsp;&nbsp;
                        <a href="<c:url value="provinciaEdit.htm?id=${user.id}" />" class="btn btn-warning btn-xs">
                            <span class="fa fa-pencil" aria-hidden="true"></span>
                        </a>
                        &nbsp;&nbsp;
                        <a href="<c:url value="provinciaRemove.htm?id=${user.id}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
                            <span class="fa fa-trash" aria-hidden="true"></span>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
