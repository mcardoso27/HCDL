<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3>Add New User</h3>
    </div>
    <form:form method="POST" modelAttribute="provincia" action="${action}">
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <tbody>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="id">Alias/Nick</label>
                                    <div class="col-md-7">
                                        <form:input type="text" path="id" id="id" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="id" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="Nombre">First Name</label>
                                    <div class="col-md-7">
                                        <form:input type="text" path="Nombre" id="Nombre" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="Nombre" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>  
        </div>
        <form:hidden path="id"></form:hidden>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form:form>
</div>