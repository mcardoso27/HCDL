<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login page</title>
        <link rel="shortcut icon" href="<c:url value='/static/images/fcm.ico' />" />
        <link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>
        <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
        <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
    </head>

    <body>

        <div class="jumbotron text-center">
            <h2>Historia Clinica Digital Laboral</h2> 
            <h3>Facultad de Ciencias M�dicas - Universidad Nacional del Litoral</h3>
        </div>

        <div >
            <div class="panel panel-primary login-container">
                <div class="login-card">
                    <div class="login-form">
                        <c:url var="loginUrl" value="/login" />
                        <form action="${loginUrl}" method="post" class="form-horizontal">
                            <c:if test="${param.error != null}">
                                <div class="alert alert-danger">
                                    <p>Invalid username and password.</p>
                                </div>
                            </c:if>
                            <c:if test="${param.logout != null}">
                                <div class="alert alert-success">
                                    <p>You have been logged out successfully.</p>
                                </div>
                            </c:if>
                            <div class="input-group input-sm">
                                <label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>
                                <input type="text" class="form-control" id="username" name="ssoId" placeholder="Ingrese usuario" required>
                            </div>
                            <div class="input-group input-sm">
                                <label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label> 
                                <input type="password" class="form-control" id="password" name="password" placeholder="Ingrese contrase�a" required>
                            </div>
                            <div class="input-group input-sm">
                                <div class="checkbox">
                                    <label><input type="checkbox" id="rememberme" name="remember-me"> Recordarme</label>  
                                </div>
                            </div>
                            <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />

                            <div class="form-actions">
                                <input type="submit"
                                       class="btn btn-block btn-primary btn-default" value="Ingresar al sistema">
                            </div>
                        </form>
                    </div>


                </div>

            </div>
        </div>

    </body>
</html>