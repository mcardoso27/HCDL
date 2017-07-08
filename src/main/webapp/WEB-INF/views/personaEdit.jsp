<%-- 
    Document   : personaEdit
    Created on : Apr 4, 2017, 6:01:53 PM
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
        <link rel="stylesheet" href="<c:url value="/resources/css/jquery-ui.css"/>" />
        <title>Editar Persona</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Editar Persona</div>
                <div class="panel-body">
                    <f:form action="personaUpdate.htm" modelAttribute="per">
                        <f:hidden path="id" value="${per.id}"/>
                        <p>
                            <f:label path="nombreyapellido">Nombre:</f:label>
                            <f:input path="nombreyapellido" cssClass="form-control" value="${per.nombreyapellido}"/>
                        </p>

                        <p>
                            <f:label path="dni">DNI:</f:label>
                            <f:input path="dni" cssClass="form-control" value="${per.dni}"/>
                        </p>

                        <p>
                            <f:label path="direccion">Dirección:</f:label>
                            <f:input path="direccion" cssClass="form-control" value="${per.direccion}"/>
                        </p>

                        <p>
                            <f:label path="localidades.idLocalidad">Localidad:</f:label>
                            <f:select path="localidades.idLocalidad" cssClass="form-control">
                                <f:option value="0">Seleccione......</f:option>
                                <f:options items="${localidadesLista}"/>
                            </f:select>
                        </p>

                        <p>                
                            <f:label path="fechaNacimiento">Ingrese fecha de Nacimiento:</f:label>
                            <f:input path="fechaNacimiento" cssClass="datepicker form-control" value="${per.fechaNacimiento}"/>
                        </p>

                        <p>
                            <f:label path="Sexo">Sexo:</f:label>
                            <f:select path="Sexo" cssClass="form-control">
                                <f:option value="${per.sexo}">Seleccione......</f:option>
                                <f:options items="${sexoLista}"/>
                            </f:select>
                        </p>

                        <p>
                            <f:label path="estadoCivil">Estado civil:</f:label>
                            <f:select path="estadoCivil" cssClass="form-control">
                                <f:option value="${per.estadoCivil}">Seleccione......</f:option>
                                <f:options items="${estCivilLista}"/>
                            </f:select>
                        </p>
                        </p>

                        <p>
                            <f:label path="numeroHijos">Cantidad de Hijos:</f:label>
                            <f:input path="numeroHijos" cssClass="form-control" value="${per.numeroHijos}"/>
                        </p>

                        <p>
                            <f:label path="datosVarios">Datos de Interés:</f:label>
                            <f:input path="datosVarios" cssClass="form-control" value="${per.datosVarios}"/>
                        </p>

                        <br/>
                        <input id="submitPersonaEdit" type="submit" value="Guardar" class="btn btn-success"/>
                        <a href="personaList.htm" class="btn btn-danger">Cancelar</a>
                    </f:form>  
                </div>
            </div>    
        </div>

        <script src="<c:url value="/resources/js/jquery.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery-ui.js"/>"></script>
        <script src="<c:url value="/resources/js/funciones.js"/>"></script>

    </body>
</html>