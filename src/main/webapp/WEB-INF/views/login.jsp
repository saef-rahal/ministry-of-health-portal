<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
  <jsp:include page="fragments/head.jsp"/>
  <body>
    
  
  <%-- Error Messages Div --%>
<div style="color: red">${error}</div>
<%--  --%>
  <div class="wrap">
      <div class="login vh-100 d-flex align-items-center">
          <div class="container">
              <div class="row d-flex justify-content-center">
                  <div class="login-wrap">
                      <div class="border p-3">
                          <div class="d-flex justify-content-center">
                              <img src="images/LOGO.png" class="mx-auto" alt="Sadagaat & and Ministry of Health">
                          </div>

                          <h5 class="mt-3 text-center">Hospital Supply Portal</h5>
       <form id="form" onsubmit="return handleSubmit()" class="bg-grey" action="/login" method="POST">

                <div class="form-row mt-3">
                  <div class="form-group col-md-12">
                    <label for="" class="col-form-label">User Name</label>
                    <input
                          type="text"
                          class="form-control-plaintext border"
                          id="username"
                          name="userName"
                          onkeyup="bttonDisableLogic()"
                      />
                  </div>
                </div>
                
                <div class="form-group col-md-12">
                   <label  class="col-form-label">Password</label>
                <input
                        class="form-control-plaintext border"
                        type="password"
                        name="shownPassword"
                        id="password"
                        onkeyup="bttonDisableLogic()"
                >
                  </div>



                      <div class="form-group col-md-12">
                   <input 
                          type="password"
                          class="form-control-plaintext border"
                          id="hiddenPassword"
                          name="password"
                          hidden="true"
                          >
                </div>


                  <div class="form-row mt-3 ">
                      <div class="form-group col-12 pr-0 d-flex justify-content-center">
                <input
                        class="btn btn-success btn-add"
                        type="submit"
                        name="Submit"
                        value="Login"
                        id="submitButton"
                        disabled
                >
                  </div>
                </div>
            </form>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </div>
<script type="text/javascript" src="/js/login-javascript.js"></script>
<jsp:include page="fragments/js.jsp"/>

  </body>
</html>