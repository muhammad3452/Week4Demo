package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author muham
 */
public class helloworldservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {//doget is used when a user clicks on some sortof link
        getServletContext().getRequestDispatcher("/WEB-INF/hellworldform.jsp").forward(request, response);
        //getServletContext
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //dopost is used when the user makes changes to the webpage, such as inputting their first and last names, and submitting
        //this method is used to send a response once the submit button is clicked, recall week 2 stuff
        String firstname = request.getParameter("firstname"); //this part consists of retrieving what the user wrote in the text boxes
        String lastname = request.getParameter("lastname");
        request.setAttribute("firstname", firstname);
        request.setAttribute("lastname", lastname);

        if (firstname == null || firstname.equals("") || lastname == null || lastname.equals("")) {
            //note: always check for null first since you could end up with NullPointerException otherwise
            getServletContext().getRequestDispatcher("/WEB-INF/hellworldform.jsp").forward(request, response);
            return; //helps to exit method
        }

        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
