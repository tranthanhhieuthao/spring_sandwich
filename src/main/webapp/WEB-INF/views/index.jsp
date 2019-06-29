<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/list" method="post">

    <input type="checkbox" name="condiment" value="Lettuce"/> Lettuce
    <input type="checkbox" name="condiment" value="tomato"/> tomato
    <input type="checkbox" name="condiment" value="mustard"/> mustard
    <input type="checkbox" name="condiment" value="sprouts"/> spouts
    <button type="submit">Done</button>
</form>
</body>
</html>
