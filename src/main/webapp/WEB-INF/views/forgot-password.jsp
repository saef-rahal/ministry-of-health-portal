<!DOCTYPE html>
<html lang="en">

<jsp:include page="fragments/head.jsp"/>
<body>


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
                            <form action="reset-password.jsp">
                                <div class="form-row mt-3">
                                    <div class="form-group col-md-12">
                                        <label for="staticEmail" class="col-form-label">User Name</label>
                                        <input type="text" readonly class="form-control-plaintext border" id="" value="">
                                    </div>
                                </div>
                                <div class="form-row mt-3 ">
                                    <div class="form-group col-12 pr-0 d-flex justify-content-center">
                                        <button type="submit" class="btn btn-success btn-add">Reset</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="fragments/js.jsp"/>
</body>

</html>