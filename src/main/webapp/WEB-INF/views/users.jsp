<!DOCTYPE html>
<html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="fragments/head.jsp"/>
<body>


    <div class="wrap">
        <jsp:include page="fragments/header.jsp"/>

        <section>
            <div class="container">
                <div class="row">
                    <form:form class="w-100 p-4 mt-5 border" action="/registration" method="post" modelAttribute="user">
                        <div class="col-12">
                            <h3>Add Users</h3>
                            <!-- <div class="alert alert-success alert-add mt-3" role="alert">
                                Added Successfully!
                            </div> -->
                            <div class="form-row mt-3">
                                <div class="form-group col-md-6">
                                    <label for="staticEmail" class="col-form-label">User Name</label>
                                    <form:input type="text"  class="form-control-plaintext border" path="userName"/>
                                     <form:errors path="userName" cssStyle="color:#ff0000;"/>
                                </div>
                            </div>
                            <div class="form-row mt-3">
                                <div class="form-group col-md-6">
                                    <label for="staticEmail" class="col-form-label">User Address</label>
                                    <form:input type="text" class="form-control-plaintext border" path="userAddress"/>
                                     <form:errors path="userAddress" cssStyle="color:#ff0000;"/>
                                </div>
                            </div>
                            <div class="form-row mt-3">
                                <div class="form-group col-md-6">
                                    <label for="staticEmail" class="col-form-label">User Phone</label>
                                    <form:input type="text"  class="form-control-plaintext border" path="userPhone"/>
                                     <form:errors path="userPhone" cssStyle="color:#ff0000;"/>
                                </div>
                            </div>
                            <div class="form-row mt-3">
                                <div class="form-group col-md-6">
                                    <label for="staticEmail" class="col-form-label">User Email</label>
                                    <form:input type="text"  class="form-control-plaintext border" path="userEmail" />
                                     <form:errors path="userEmail" cssStyle="color:#ff0000;"/>
                                </div>
                            </div>
                            <div class="form-row mt-3">
                                <div class="form-group col-md-6">
                                    <label for="staticEmail" class="col-form-label">User Password</label>
                                    <form:input type="password" class="form-control-plaintext border" path="password"/>
                                     <form:errors path="password" cssStyle="color:#ff0000;"/>
                                </div>
                            </div>
                            <%-- <div class="form-row mt-3">
                                <div class="form-group col-md-6">
                                    <label for="staticEmail" class="col-form-label">Password Matched</label>
                                    <form:input type="password"  class="form-control-plaintext border" path="passwordMatched"/>
                                     <form:errors path="passwordMatched" cssStyle="color:#ff0000;"/>
                                </div>
                            </div>  --%>
                           <%--  <div class="form-group col-md-6">
                                <label for="exampleFormControlSelect1">Role</label>
                                <form:input class="form-control" id="exampleFormControlSelect1" path="role"/>
                                    <form:errors path="role" cssStyle="color:#ff0000;" />
                               
                            </div> --%>
                        </div> 

                        <div class="form-row mt-3 ">
                            <div class="form-group col-12 pr-0 d-flex justify-content-end">
                                <form:button type="submit" class="btn btn-success btn-add">Add</form:button>
                               
                            </div>
                        </div>

                        <!-- <div class="form-row mt-3">
                            <div class="form-check col-md-4">
                                <input class="form-check-input" type="radio" name="first" id="first" value="option1">
                                <label class="form-check-label" for="first">
                                    Role 1
                                </label>
                            </div>
                            <div class="form-check col-md-4">
                                <input class="form-check-input" type="radio" name="second" id="second" value="option2">
                                <label class="form-check-label" for="second">
                                    Role 2
                                </label>
                            </div>-->

                        </div> 
                         </form:form>
                        </div>
                </div>
        </section>

        <section class="mt-5">
            <div class="container">
                <div class="row mb-4 p-0">
                    <div class="col-8 d-flex justify-content-start">
                        <h3>All Users</h3>
                    </div>
                    <!-- <div class="col-4 d-flex justify-content-end">
                        <button type="button" class="btn btn-success">Add User</button>
                    </div> -->
                </div>
                <div class="row">
                    <div class="col-12">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">User Name</th>
                                    <th scope="col">User Address</th>
                                    <th scope="col">User Phone</th>
                                    <th scope="col">User Email</th>
                                </tr>
                            </thead>

                            <c:if test="${not empty users}"/>
                            <c:forEach items="${users}" var="user">
                            <tbody>
                                <tr>
                                    <td scope="row">${user.userName}</td>
                                    <td>${user.userAddress}</td>
                                    <td>${user.userPhone}</td>
                                    <td>${user.userEmail}</td>
                                </tr>
                            </tbody>
                            </c:forEach>
                        </table>
                    </div>
                </div>
                <jsp:include page="fragments/pagination_component_user.jsp"/>
            </div>
        </section>
        <jsp:include page="fragments/footer.jsp"/>

    </div>
    <jsp:include page="fragments/js.jsp"/>
</body>

</html>