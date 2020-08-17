<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/31/2020
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Student" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<jsp:include page="fragment/head.jsp"></jsp:include>
<style>
    table td{
        border: 1px solid black;
    }
</style>
<body>
<jsp:include page="fragment/header.jsp"></jsp:include>
<%
    List<Student> list = (List<Student>) request.getAttribute("studentList");
%>
<a href="/index">Home</a>
<div>
    <h2>List Account</h2>
    <table style="border: 1px solid black">
        <thead>
        <tr>
            <td>ID</td>
            <td>Full Name</td>
            <td>Gender</td>
            <td>Address</td>
            <td>Phone</td>
            <td>Email</td>
            <td>Year Of Birth</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        </thead>
        <tbody>
        <%
            for (Student student : list) {
        %>
        <tr>
            <th><%= student.getId() %></th>
            <th><%= student.getFull_name() %></th>
            <th><%= student.getGender()==0 ? "Male":"Female" %></th>
            <th><%= student.getAddress() %></th>
            <th><%= student.getPhone() %></th>
            <th><%= student.getEmail() %></th>
            <th><%= student.getDob() %></th>
            <th><a href="">Edit</a></th>
            <th><a href="/delete?id=<%= student.getId() %>">Delete</a></th>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
<jsp:include page="fragment/footer.jsp"></jsp:include>
</body>
</html>
