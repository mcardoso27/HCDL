<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h3 class="page-header">Listado de Provincias
                <a href="<c:url value="provinciaCreate.htm" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
            </h3>
        </div>

    </div>
    <table class="table table-bordered table-striped table-hover">
        <thead>
            <tr>
                <td><strong>ID</strong></td>
                <td><strong>Provincia</strong></td>
                <td><strong>Acciones</strong></td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${lst}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.nombre}</td>
                    <td>
                        <a href="<c:url value="provinciaEdit.htm?id=${p.id}" />" class="btn btn-primary btn-xs">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                        </a>
                        &nbsp;&nbsp;
                        <a href="<c:url value="provinciaRemove.htm?id=${p.id}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
                            <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
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
