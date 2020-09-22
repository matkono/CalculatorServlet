<%@page import="br.com.matkono.calculator.Pojo.CalculatorPojo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator result</title>
    </head>
    <body>
        <% 
            CalculatorPojo calculatorResult = (CalculatorPojo)request.getAttribute("calculatorResult");
            Cookie c[] = request.getCookies();
        %>
        <h1>Operation processed: <% out.println(calculatorResult.getOperation()); %></h1>
        <h1>Operator left: <% out.println(calculatorResult.getOperatorLeft()); %></h1>
        <h1>Operator right: <% out.println(calculatorResult.getOperatorRight()); %></h1>
        <h1>Operation result: <% out.println(calculatorResult.getResut()); %></h1>
        <h1>Number of access: 
            <% 
                if(c != null)
                {
                    for(int i=0; i <= c.length - 1; i++)
                    {
                        if(c[i].getName().equals("numberAccess"))
                        {
                            out.println(c[i].getValue());
                        }
                    }
                }
            %>
        </h1>
    </body>
</html>