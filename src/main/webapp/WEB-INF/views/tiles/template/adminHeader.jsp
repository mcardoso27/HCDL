<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <!-- Navigation -->
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">Historia Cl�nica Digital Laboral</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <li><i class="fa fa-user fa-fw"></i>${loggedinuser}</li>
        <li class="divider"></li>
        <li class="dropdown">
            <a href="<c:url value="/logout" />">Logout<i class="fa fa-sign-out fa-fw"></i></a>
        </li>
    </ul>