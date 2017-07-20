<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li>
                    <a href="<c:url value="/provinciasList" />"><i class="fa fa-dashboard fa-fw" aria-hidden="true"></i> Provincias</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-dashboard fa-fw" aria-hidden="true"></i>Users Administration</a>
                </li>
                <li class="active">
                    <ul class="nav nav-second-level">
                        <li> 
                            <a href="<c:url value="/listUsers" />">User List</a>
                        </li>
                        <li>
                            <a href="<c:url value="/historyUsers" />">User History</a>
                        </li>
                        <li>
                            <a href="<c:url value="/chronHistoryUsers" />">Chronological History (que ser�a esto?)</a>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="<c:url value="/configurationFiles" />"><i class="fa fa-dashboard fa-fw" aria-hidden="true"></i>Manage Files Configuration</a>
                </li>
                <li class="active">
                    <ul class="nav nav-third-level collapse in" aria-expanded="true" style="">
                        <c:forEach items="${configFiles}" var="configFile">
                            <li>
                                <a href="<c:url value="/confFileTemp?currentFile=${configFile.name}" />">${configFile.name}</a>
                            </li>
                        </c:forEach>
                        <li>
                            <a href="<c:url value="/rulesConf" />">Rules</a>
                        </li>
                    </ul>
                    <!-- /.nav-third-level -->
                </li>
                <li>
                    <a href="#"><i class="fa fa-dashboard fa-fw" aria-hidden="true"></i>Monitoring</a>
                </li>
                <li class="active">
                    <ul class="nav nav-third-level collapse in" aria-expanded="true" style="">
                        <li>
                            <a href="<c:url value="/charts" />">Statistical Charts</a>
                        </li>
                        <li>
                            <a href="<c:url value="/reports" />">Generate Report</a>
                        </li>
                        <li>
                            <a href="<c:url value="/events" />">List Events</a>
                        </li>
                    </ul>
                    <!-- /.nav-third-level -->
                </li>
            </ul>
        </div>
    </div>
</nav>