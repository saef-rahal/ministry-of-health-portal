<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<jsp:include page="fragments/head.jsp"/>

<body>
<jsp:include page="fragments/header.jsp"/>

<script type="text/javascript">
    /*
     $(document).ready(function(){
     $("#CategoryList").change(function(){
     var categoryId = $(this).val();

     $.ajax({
     url: '${pageContext.request.contextPath }/itemByCategory/',
     type: 'post',
     data: {id:categoryId},
     contentType: "application/json; charset=utf-8",
     dataType: 'json',
     success:function(response){
     json_data = JSON.parse(response);
     var len = response.length;
     $("#ItemList").empty();
     for( var i = 0; i<len; i++){
     var id = response[i]['id'];
     var name = response[i]['name'];
     var unit = response[i]['unit'];
     $("#ItemList").append("<option value='"+id+"'>"+ name + unit+"</option>");

     }
     }
     });
     });

     });
     */
</script>


<div class="wrap">
    <section>
        <div class="container">
            <div class="row">
                <form:form class="w-100 p-4 mt-5 border" action="${pageContext.request.contextPath}/outbound" method="post" modelAttribute="outbound">
                    <div class="col-12">
                        <h3>Add Outbound Request</h3>
                        <!-- <div class="alert alert-success alert-add mt-3" role="alert">
                            Added Successfully!
                        </div> -->

                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="state">State</label>
                                <form:select class="form-control" path="state.id" id="StateList">
                                    <c:forEach var="state" items="${states }">
                                        <option value="${state.id }">${state.name }</option>
                                    </c:forEach>
                                </form:select>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="hospital">Hospital</label>
                                <form:select class="form-control" path="hospital.id" id="HospitalList">
                                    <c:forEach var="hospital" items="${hospitals }">
                                        <option value="${hospital.id }">${hospital.name }</option>
                                    </c:forEach>
                                </form:select>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="category">Category</label>
                                <form:select class="form-control" path="category.id" id="CategoryList">
                                    <c:forEach var="category" items="${categories }">
                                        <option value="${category.id }">${category.name }</option>
                                    </c:forEach>
                                </form:select>
                            </div>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <label for="item">Item</label>
                                <form:select class="form-control" path="item.id" id="ItemList">
                                    <c:forEach var="item" items="${items }">
                                        <option value="${item.id }">${item.name } - ${item.unit}</option>
                                    </c:forEach>
                                </form:select>
                            </div>
                        </div>

                            <%-- <div class="form-row mt-3">
                                  <div class="form-group col-md-4">
                                     <label for="staticEmail" class="col-form-label">Name</label>
                                     <form:input type="text"  class="form-control-plaintext border" path="need"/>
                                     <form:errors path="supply" cssStyle="color:#ff0000;"/>
                                 </div> --%>

                        <div class="form-group col-md-4">
                            <label for="received quantity" class="col-form-label">Delivered Quantity</label>
                            <form:input type="number" path="deliveredQuantity" class="form-control-plaintext border"/>
                        </div>


                        <div class="form-row mt-3 ">
                            <div class="form-group col-12 pr-0 d-flex justify-content-end">
                                <button type="submit" path="submit" class="btn btn-success btn-add">Add</button>
                            </div>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
</div>
<jsp:include page="fragments/footer.jsp"/>
<jsp:include page="fragments/js.jsp"/>
</body>

</html>