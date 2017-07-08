<%-- 
    Document   : personaCreate
    Created on : Mar 30, 2017, 3:58:34 PM
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
        <title>Agregar Persona</title>
    </head>
    <body>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-heading">Agregar Persona</div>
                <div class="panel-body">
                    <f:form action="personaAdd.htm" modelAttribute="per">

                        <p>
                            <f:label path="nombreyapellido">Nombre:</f:label>
                            <f:input path="nombreyapellido" cssClass="form-control" value="${per.nombreyapellido}"/>
                        </p>

                        <p>
                            <f:label path="dni">DNI:</f:label>
                            <f:input path="dni" cssClass="form-control" value=""/>
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
                            <f:input path="fechaNacimiento" cssClass="datepicker form-control"/>
                        </p>

                        <p>
                            <f:label path="Sexo">Sexo:</f:label>
                            <f:select path="Sexo" cssClass="form-control">
                                <f:option value="0">Seleccione......</f:option>
                                <f:options items="${sexoLista}"/>
                            </f:select>
                        </p>

                        <p>
                            <f:label path="estadoCivil">Estado civil:</f:label>
                            <f:select path="estadoCivil" cssClass="form-control">
                                <f:option value="0">Seleccione......</f:option>
                                <f:options items="${estCivilLista}"/>
                            </f:select>
                        </p>
                        </p>

                        <p>
                            <f:label path="numeroHijos">Cantidad de Hijos:</f:label>
                            <f:input path="numeroHijos" cssClass="form-control"/>
                        </p>

                        <p>
                            <f:label path="datosVarios">Datos de Interés:</f:label>
                            <f:input path="datosVarios" cssClass="form-control" value="${per.datosVarios}"/>
                        </p>

                        <br/>
                        <input id="submitPersonaCreate" type="submit" value="Guardar" class="btn btn-success"/>
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