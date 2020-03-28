<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<nav aria-label="Page navigation">
    <ul class="pagination ">
<c:choose>

<%-- HANDLING THE PAGINATION LOGIC ON FIRST PAGES --%>
    <c:when test="${currentPage == 1 and  totalPages - currentPage >= 1 and totalPages > currentPage}">
        <li onclick="submit(this.value)" value="${1}" class="page-item not-clickable"><a href="/registration?page=${1}" class="page-link">First</a></li>
        <li onclick="submit(this.value)" value="${currentPage - 1}" class="page-item not-clickable"><a href="/registration?page=${currentPage - 1}" class="page-link">Previous</a></li>
        <c:forEach var="page" begin="${currentPage}" end="${currentPage + 1}">
            <li onclick="submit(this.value)" value="${page}" class=<c:if test="${currentPage == page}">"page-item active not-clickable"</c:if>>
            <a href="/registration?page=${page}" class="page-link">${page}</a></li>
        </c:forEach>
        <c:if test="${totalPages > currentPage}">
            <li onclick="submit(this.value)" value="${currentPage + 1}" class="page-item"><a href="/home?page=${currentPage + 1}" class="page-link">Next</a></li>
            <li onclick="submit(this.value)" value="${totalPages}" class="page-item"><a href="/home?page=${totalPages}" class="page-link">Last</a></li>
        </c:if>
    </c:when>

<%-- HANDLING THE PAGINATION LOGIC ON THE MIDDLE PAGES --%>
<c:when test="${currentPage > 1 and currentPage < totalPages}">
        <li onclick="submit(this.value)" value="${1}" class="page-item"><a href="/registration?page=${1}" class="page-link">First</a></li>
        <li onclick="submit(this.value)" value="${currentPage - 1}" class="page-item"><a href="/registration?page=${currentPage - 1}" class="page-link">Previous</a></li>
    <c:forEach var="page" begin="${currentPage - 1}" end="${currentPage + 1}">
        <li onclick="submit(this.value)" value="${page}" class=<c:if test="${currentPage == page}">"page-item active not-clickable"</c:if>>
        <a href="/registration?page=${page}" class="page-link">${page}</a></li>
    </c:forEach>
    <c:if test="${currentPage < totalPages}" >
        <li onclick="submit(this.value)" value="${currentPage + 1}" class="page-item"><a href="/registration?page=${currentPage + 1}" class="page-link">Next</a></li>
        <li onclick="submit(this.value)" value="${totalPages}" class="page-item"><a href="/registration?page=${totalPages}" class="page-link">Last</a></li>
    </c:if>
</c:when>


<%-- HANDLING PAGINATION LOGIC ON THE LAST PAGE --%>
<c:when test="${currentPage == totalPages and totalPages > 1}">
    <c:if test="${currentPage > 1 }" >
        <li onclick="submit(this.value)" value="${1}" class="page-item"><a href="/registration?page=${1}" class="page-link">First</a></li>
        <li onclick="submit(this.value)" value="${currentPage - 1}" class="page-item"><a href="/registration?page=${currentPage - 1}" class="page-link">Previous</a></li>
    </c:if>
    <c:forEach var="page" begin="${currentPage -1}" end="${currentPage}">
        <li onclick="submit(this.value)" value="${page}" class=<c:if test="${currentPage == page}">"page-item active not-clickable"</c:if>>
        <a href="/registration?page=${page}" class="page-link">${page}</a></li>
    </c:forEach>
    <li onclick="submit(this.value)" value="${currentPage + 1}" class="page-item not-clickable"><a href="/registration?page=${currentPage + 1}" class="page-link">Next</a></li>
    <li onclick="submit(this.value)" value="${totalPages}" class="page-item not-clickable"><a href="/registration?page=${totalPages}" class="page-link">Last</a></li>
</c:when>

<%-- HANDLING PAGINATION LOGIC WHEN THERE ARE TWO PAGES ONLY --%>


<%-- HANDLING PAGINATION LOGIC WHEN THERE IS A SINGLE PAGE --%>
    <c:when test="${totalPages == 1}">
    </c:when>

</c:choose>
</ul>
</nav>
<%-- TEXT TO SHOW TOTAL NUMBER OF PAGES --%>
<c:choose>
    <c:when test="${currentPage > totalPages and totalPages != 0}">
        <p>Please Do Not Enter Page Numbers Manually</p>
    </c:when>
    <c:when test="${totalPages >= currentPage}">
        <p style="text-align:" >showing ${currentPage} of ${totalPages} pages</p>
    </c:when>
</c:choose>