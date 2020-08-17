<%@ page import="entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2020
  Time: 8:07 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<jsp:include page="fragment/head.jsp"></jsp:include>
<body>
<jsp:include page="fragment/header.jsp"></jsp:include>
<%
    Student student = (Student) request.getAttribute("student");
%>
<div>
    <h2>Edit Form</h2>
    <form action="edit" method="post">
        <label for="full_name">FullName
            <input id="full_name" type="text" name="full_name" value="<%=student.getFull_name()%>">
        </label>
        <label for="gender">Gender
            <input id="gender" type="number" name="gender" value="<%=student.getGender()%>">
            <p><i style="color: red">* 0 represents for "Male" and 1 represent for Females</i></p>
        </label>
        <label for="address">Address
            <input id="address" type="text" name="address" value="<%=student.getAddress()%>">
        </label>
        <label for="email">Email
            <input id="email" type="text" name="email" value="<%=student.getEmail()%>">
        </label>
        <label for="phone">Phone
            <input id="phone" type="text" name="phone" value="<%=student.getPhone()%>">
        </label>
        <label for="dob">Year Of Birth
            <input id="dob" type="text" name="dob" value="<%=student.getDob()%>">
        </label>
        <input type="hidden" name="id" id="" value="<%=student.getId()%>">
        <input type="submit" value="Submit">
    </form>
</div>
<jsp:include page="fragment/footer.jsp"></jsp:include>
</body>
</html>
