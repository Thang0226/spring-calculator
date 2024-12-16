<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <style>
        p {
            border: 1px solid black;
            width: 300px;
            padding: 5px;
            margin: 5px;
            text-align: center;
        }
    </style>
</head>

<body>
<h2>Simple Calculator</h2>
<form action="/calculator/calculate" method="post">
    <input id="num1" type="number" name="num1" placeholder="First number" value="${num1}">
    <input id="num2" type="number" name="num2" placeholder="Second number" value="${num2}">
    <br><br>

    <button type="submit" name="action" value="add">Add (+)</button>
    <button type="submit" name="action" value="subtract">Subtract (-)</button>
    <button type="submit" name="action" value="multiply">Multiply (x)</button>
    <button type="submit" name="action" value="divide">Divide (/)</button>
    <br><br>
</form>

<label>Result: </label>
<p>${result}</p>

</body>
</html>