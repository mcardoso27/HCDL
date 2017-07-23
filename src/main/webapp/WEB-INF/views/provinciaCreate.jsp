<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="page-wrapper">
    <div class="container">
        <div class="panel panel-primary">
            <div class="panel-heading">Agregar Provincia</div>
            <div class="panel-body">
                <f:form action="provinciaAdd" modelAttribute="prov">

                    <p><f:label path="nombre">Nombre:</f:label>
                    <input path="nombre" cssClass="form-control" value="${prov.nombre}"/></p>

                    <br/>
                    <input type="submit" value="Guardar" class="btn btn-success"/>
                    <a href="provinciaList.htm" class="btn btn-danger">Cancelar</a>
                </f:form>
            </div>
        </div>    
    </div>
</div>



