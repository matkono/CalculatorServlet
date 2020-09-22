<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        <form action="CalculatorServlet" method="post">
            <label>first number:</label>
            <input type="text" name="number1" />
            <br />
            <label>Second number : </label>
            <input type="text" name="number2" />
            <br />
            <div>
                <input type="radio" id="addition" name="operation" value="addition">
                <label for="addition">Addition</label><br>
                <input type="radio" id="subtraction " name="operation" value="subtraction">
                <label for="subtraction ">Subtraction </label><br>
                <input type="radio" id="multiplication" name="operation" value="multiplication">
                <label for="multiplication">Multiplication</label><br>
                <input type="radio" id="division" name="operation" value="division">
                <label for="division">Division</label>
            </div>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>