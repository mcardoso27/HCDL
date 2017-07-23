<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h3 class="page-header">Listado de Provincias
                <a href="<c:url value="/provinciaCreate" />" class="btn btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Agregar</a>
                <a type="button" class="btn btn-primary" id="add-user-button" data-action="addUser">Add</a>
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
                            <span class="fa fa-info" aria-hidden="true"></span>
                        </a>
                        &nbsp;&nbsp;
                        <a href="<c:url value="provinciaEdit.htm?id=${p.id}" />" class="btn btn-warning btn-xs">
                            <span class="fa fa-pencil" aria-hidden="true"></span>
                        </a>
                        &nbsp;&nbsp;
                        <a href="<c:url value="provinciaRemove.htm?id=${p.id}" />" onclick="return confirm('Estás seguro?')" class="btn btn-danger btn-xs">
                            <span class="fa fa-trash" aria-hidden="true"></span>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <hr/>
    <a href="index.htm">Volver a index</a>
</div>
                
<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">>
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h2 class="modal-title" id="userModalTitle">Agregar Provincia</h2>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body" id="modal-body-add-user">
          <img id="loading-image-modal" src="<c:url value='/static/img/loading.png'/>"></img>
          <div id="userModalBody"></div>
      </div>
      <div class="modal-footer" id="addUserModalFooter">         
      </div>
    </div>
  </div>
</div>s
