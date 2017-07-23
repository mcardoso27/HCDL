<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li>
                    <a href="#"><i class="fa fa-user fa-fw" aria-hidden="true"></i>Administración de usuarios</a>
                </li>
                <li class="active">
                    <ul class="nav nav-second-level">
                        <li> 
                            <a href="<c:url value="/usersList" />">Listado de usuarios</a>
                        </li>
                        <li>
                            <a href="<c:url value="/chronHistoryUsers" />">Listado cronológico de acciones</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="<c:url value="/provinciasList" />"><i class="fa fa-globe fa-fw" aria-hidden="true"></i> Provincias</a>
                </li>
            </ul>
        </div>
    </div>
</nav>