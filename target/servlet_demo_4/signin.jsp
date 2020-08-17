<%--
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
<div>
    <h2>SignIn</h2>
    <form action="">
        <label for="email">Email
            <input id="email" type="text" name="email">
        </label>
        <label for="password">Password
            <input id="password" type="password" name="password">
        </label>
        <input type="submit" value="Submit">
    </form>
</div>
<jsp:include page="fragment/footer.jsp"></jsp:include>
</body>
</html>
