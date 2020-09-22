package br.com.matkono.calculator.Servlet;

import br.com.matkono.calculator.Pojo.CalculatorPojo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"/CalculatorServlet"})
public class CalculatorServlet extends HttpServlet {

    private int numberAccess = 0;
    
    protected void processResponse(HttpServletRequest request, HttpServletResponse response, int operatorLeft, int operatorRight, int result, String operation)
            throws ServletException, IOException 
    {
        CalculatorPojo calculatorPojo = new CalculatorPojo();
        calculatorPojo.setOperatorLeft(operatorLeft);
        calculatorPojo.setOperatorRight(operatorRight);
        calculatorPojo.setResult(result);
        calculatorPojo.setOperation(operation);
        numberAccess ++;
        
        request.setAttribute("calculatorResult", calculatorPojo);
        Cookie cookie = new Cookie("numberAccess", String.valueOf(numberAccess));
        cookie.setMaxAge((60 * 60* 24));
        response.addCookie(cookie);
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Result.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out= response.getWriter();
        try
        {
            response.setContentType("text/html");
            int operatorLeft= Integer.parseInt(request.getParameter("number1"));
            int operatorRight= Integer.parseInt(request.getParameter("number2"));
            int result = 0;
            String operation = request.getParameter("operation");
            switch(operation)
            {
                case "addition":
                    result = operatorLeft + operatorRight;
                    break;
                
                case "subtraction":
                    result = operatorLeft - operatorRight; 
                    break;
                    
                case "multiplication":
                    result = operatorLeft * operatorRight;
                    break;
                
                case "division":
                    result = operatorLeft / operatorRight;
                    break;
                
                default:
                    throw new Exception("Operation not found");
            }
            
            processResponse(request, response, operatorLeft, operatorRight, result, operation);
        }
        catch(Exception e)
        {
            out.println("<h1>Error processing operation</h1>"+ e.getMessage());
        }
    }

}
