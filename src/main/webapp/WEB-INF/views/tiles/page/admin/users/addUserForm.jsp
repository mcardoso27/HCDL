<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="panel panel-default">
    <div class="panel-heading">
        <h3>Add New User</h3>
    </div>
    <!-- /.panel-heading -->
    <form:form method="POST" modelAttribute="user" action="${action}">
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <tbody>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="ssoId">Alias/Nick</label>
                                    <div class="col-md-7">
                                        <form:input type="text" path="ssoId" id="ssoId" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="ssoId" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="firstName">First Name</label>
                                    <div class="col-md-7">
                                        <form:input type="text" path="firstName" id="firstName" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="firstName" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="lastName">Last Name</label>
                                    <div class="col-md-7">
                                        <form:input type="text" path="lastName" id="lastName" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="lastName" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="email">Email</label>
                                    <div class="col-md-7">
                                        <form:input type="text" path="email" id="email" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="email" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="password">Password</label>
                                    <div class="col-md-7">
                                        <form:input type="password" path="password" id="password" class="form-control input-sm"/>
                                        <div class="has-error">
                                            <form:errors path="password" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <div class="form-group col-md-12">
                                    <label class="col-md-5 control-lable" for="state">State</label>
                                    <div class="col-md-7">
                                        <form:select path="state" multiple="false" class="form-control input-sm">
                                            <form:option value="Active" >Active</form:option>
                                            <form:option value="Disable" >Disable</form:option>
                                        </form:select>
                                        <div class="has-error">
                                            <form:errors path="state" class="help-inline"/>
                                        </div>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <!-- /.panel-body -->
                    </tbody>
                </table>
            </div>
            <!-- /.table-responsive -->
        </div>
        <!-- /.panel-body -->
        
        <form:hidden path="id"></form:hidden>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form:form>
</div>
<!-- /.panel -->