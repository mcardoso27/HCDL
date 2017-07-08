<%-- 
    Document   : empresaCreate
    Created on : Mar 22, 2017, 3:28:12 PM
    Author     : martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <title>Editar Empresa</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Editar Empresa</div>
                <div class="panel-body">
                    <f:form action="empresaUpdate.htm" modelAttribute="emp">
                        <f:hidden path="id" value="${emp.id}"/>
                        <p>
                            <f:label path="nombre">Nombre:</f:label>
                            <f:input path="nombre" cssClass="form-control" value="${emp.nombre}"/>
                        </p>

                        <p>
                            <f:label path="tiposEmpresas.id">Tipo de Empresa:</f:label>
                            <f:select path="tiposEmpresas.id" cssClass="form-control">
                                <f:option value="0">Seleccione......</f:option>
                                <f:options items="${tiposEmpLista}"/>
                            </f:select>
                        </p>

                        <p>
                            <f:label path="propiedadCapital">Propiedad del Capital:</f:label>
                            <f:select path="propiedadCapital" cssClass="form-control">
                                <f:option value="0">Seleccione......</f:option>
                                <f:options items="${PropiedadCapital}"/>
                            </f:select>
                        </p>    

                        <p>
                            <f:label path="direccion">Dirección:</f:label>
                            <f:input path="direccion" cssClass="form-control" value="${emp.direccion}"/>
                        </p>

                        <p>
                            <f:label path="localidades.idLocalidad">Localidad:</f:label>
                            <f:select path="localidades.idLocalidad" cssClass="form-control">
                                <f:option value="0">Seleccione......</f:option>
                                <f:options items="${localidadesLista}"/>
                            </f:select>
                        </p>

                        <p>
                            <f:label path="antiguedad">Angüedad:</f:label>
                            <f:input path="antiguedad" cssClass="form-control" value="${emp.antiguedad}"/>
                        </p>

                        <p>
                            <f:label path="numeroEmpleados">Número de empleados:</f:label>
                            <f:input path="numeroEmpleados" cssClass="form-control" value="${emp.numeroEmpleados}"/>
                        </p>

                        <p id="parrafo">
                            <label for="art">Posee ART:</label>
                            <c:choose>
                                <c:when test="${emp.art==true}">
                                    <input id="art1" name="art" type="radio" value="true" checked>Si</input>
                                    <input id="art2" name="art" type="radio" value="false">No</input>
                                <p>
                                    <label for="nombreArt">Nombre de la ART:</label>
                                    <input id="nombreArt" name="nombreArt" class="form-control" type="text" value="${emp.nombreArt}"/>
                                </p>
                            </c:when>    
                            <c:otherwise>
                                <input id="art1" name="art" type="radio" value="true">Si</input>
                                <input id="art2" name="art" type="radio" value="false" checked >No</input>
                                <p>
                                    <label for="nombreArt">Nombre de la ART:</label>
                                    <input id="nombreArt" name="nombreArt" class="form-control" type="text" value="${emp.nombreArt}" disabled/>
                                </p>
                            </c:otherwise>
                        </c:choose>
                        </p>

                        <p>
                            <f:label path="medico">Posee médico:</f:label>
                            <f:radiobutton path="medico" value="true"/>Si
                            <f:radiobutton path="medico" value="false"/>No
                        </p>

                        <p>
                            <f:label path="especialistaHigiene">Posee especialista en higiene y seguridad:</f:label>
                            <f:radiobutton path="especialistaHigiene" value="true"/>Si
                            <f:radiobutton path="especialistaHigiene" value="false"/>No
                        </p>

                        <br/>
                        <input type="submit" value="Guardar" class="btn btn-success"/>
                        <a href="empresaList.htm" class="btn btn-danger">Cancelar</a>
                    </f:form>

                </div>

            </div>    
        </div>

        <script src="<c:url value="/resources/js/jquery.js"/>"></script>
        <script src="<c:url value="/resources/js/funciones.js"/>"></script>

    </body>
</html>
