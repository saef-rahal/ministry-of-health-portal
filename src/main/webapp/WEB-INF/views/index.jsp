<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="fragments/head.jsp"/>
<body>

<jsp:include page="fragments/header.jsp"/>
    <div class="wrap">
    <section id="jumbotron">
        <div class="jumbotron">
            <div class="container">
                <div class="row">
                    <h2 class="display-4">Hospital Supply Portal</h2>
                    <!-- <hr class="my-4">
                    <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
                    <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a> -->
                </div>
            </div>
        </div>
    </section>

    <section>
        <div class="container-fluid">
            <div class="row mb-4 p-0">
                <div class="col-8 d-flex justify-content-start"><h3>Latest Supply Requests</h3></div>
                <div class="col-4 d-flex justify-content-end">
                <a href="/download/reports.xlsx">
                    <button type="button" class="btn btn-success"><svg class="bi bi-file-earmark-spreadsheet" width="1em" height="1em"
                                                                       viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                        <path fill-rule="evenodd" d="M13 9H3V8h10v1zm0 3H3v-1h10v1z" clip-rule="evenodd"/>
                        <path fill-rule="evenodd" d="M5 14V9h1v5H5zm4 0V9h1v5H9z" clip-rule="evenodd"/>
                        <path d="M4 1h5v1H4a1 1 0 00-1 1v10a1 1 0 001 1h8a1 1 0 001-1V6h1v7a2 2 0 01-2 2H4a2 2 0 01-2-2V3a2 2 0 012-2z"/>
                        <path d="M9 4.5V1l5 5h-3.5A1.5 1.5 0 019 4.5z"/>
                      </svg> Download</button>
                      </a>
                 </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">State</th>
                                <th scope="col">Hospital</th>
                                <th scope="col">Category</th>
                                <th scope="col">Item</th>
                                <th scope="col">Supply Request Quantity</th>
                                <th scope="col">Outbound Quantity</th>
                                <th scope="col">Remining Quantity</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${reports}" var="report">
                            <tr>
                                <td scope="row">${report.stateName}</td>
                                <td>${report.hospitalName}</td>
                                <td>${report.categoryName}</td>
                                <td>${report.Item} - ${report.unitName}</td>
                                <td>${report.supplyRequestQuantity}</td>
                                <td>${report.deliveredQuantity}</td>
                                <td>${report.remainingQuantity}</td>
                            </tr>
                             </c:forEach>
                        </tbody>
                    </table>
                    <jsp:include page="fragments/pagination_component.jsp"/>
                </div>
            </div>
        </div>
    </section>
        
</div>
<jsp:include page="fragments/footer.jsp"/>
    <jsp:include page="fragments/js.jsp"/>
</body>

</html>