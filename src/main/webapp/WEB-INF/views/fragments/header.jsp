<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <header class="bg-white">
        <div class="container">
            <div class="row">
                <nav class="navbar navbar-expand-lg navbar-light bg-white col-12">
                    <a class="navbar-brand" href="#"><img src="images/LOGO.png" alt=""></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item active">
                                <a class="nav-link" href="${pageContext.request.contextPath}/index">Home</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="${pageContext.request.contextPath}/supply-request">Supply Request</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="${pageContext.request.contextPath}/inbound">Inbound</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="${pageContext.request.contextPath}/outbound">Outbound</a>
                            </li>
                        </ul>
                        <a href="/login?logout">Logout</a>
                    </div>
                </nav>
            </div>
        </div>
    </header>
