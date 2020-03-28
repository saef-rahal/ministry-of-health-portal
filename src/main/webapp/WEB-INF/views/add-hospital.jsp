<%@ taglib prefix=" form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="fragments/head.jsp"/>
<body>
    <div class="wrap">
        <jsp:include page="fragments/head.jsp"/>
        <section>
            <div class="container">
                <div class="row">
                    <form:form class="w-100 p-4 mt-5 border" action="addhospital" method="POST" modelAttribute="hospital" >
                        <div class="col-12">
                            <h3>Add Hospitals</h3>
                            <!-- <div class="alert alert-success alert-add mt-3" role="alert">
                                Added Successfully!
                            </div> -->
                        <div class="form-row">
                            <div class="form-group col">
                                <label for="exampleFormControlSelect1">State</label>
                                <form:select class="form-control" id="exampleFormControlSelect1" path="state">
                                    <form:option  value="${state}"/>
                                </form:select>
                                <form:errors path="state" cssStyle="color:#ff0000;"/>
                            </div>
                            <div class="form-group col">
                                <label for="exampleFormControlSelect1">Locality</label>
                                <form:select class="form-control" id="exampleFormControlSelect1" path="locality">
                                    <form:option  value="${locality}"/>
                                </form:select>
                                <form:errors path="state" cssStyle="color:#ff0000;"/>
                            </div>
                            
                        </div>

                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="staticEmail" class="col-form-label">Hospital Name</label>
                                <form:input type="text"  class="form-control-plaintext border"   path="hospitalName"/>
                                <form:errors path="hospitalName" cssStyle="color:#ff0000;"/>
                            </div>
                        </div>

                        <div class="form-row mt-3 ">
                            <div class="form-group col-12 pr-0 d-flex justify-content-end">
                                <form:button type="submit" class="btn btn-success btn-add">Add</form:button>
                            </div>
                        </div>

                        </div>
                    </form:form>
                </div>
            </div>
        </section>

        <jsp:include page="fragments/footer.jsp"/>
    </div>



    <jsp:include page="fragments/js.jsp"/>
</body>

</html>