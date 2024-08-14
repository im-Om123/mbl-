package servelet1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SetCookies")
public class Servelet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handles GET requests
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirect to the form if accessed via GET
        response.sendRedirect("index.html");
    }

    // Handles POST requests
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the current HttpSession, create one if it doesn't exist
        HttpSession session = request.getSession(true);

        // Get the session ID
        String sessionId = session.getId();

        // Retrieve the username from the request parameters
        String userName = request.getParameter("username");

        // Create the session_id cookie
        Cookie sessionIdCookie = new Cookie("session_id", sessionId);
        // Set the maximum age of the cookie to 7 days (604800 seconds)
        sessionIdCookie.setMaxAge(604800);
        // Add the session_id cookie to the response
        response.addCookie(sessionIdCookie);

        // Check if userName is not null or empty
        if (userName != null && !userName.trim().isEmpty()) {
            // Create the username cookie
            Cookie userNameCookie = new Cookie("username", userName);
            // Set the maximum age of the cookie to 7 days (604800 seconds)
            userNameCookie.setMaxAge(604800);
            // Add the username cookie to the response
            response.addCookie(userNameCookie);

            // Inform the user that the cookies have been set and display the user name and session id
            response.getWriter().println("Cookies 'session_id' and 'username' have been set.");
            response.getWriter().println("Username: " + userName);
            response.getWriter().println("Session ID: " + sessionId);
        } else {
            // Inform the user that the username parameter is missing
            response.getWriter().println("Missing 'username' parameter!");
        }
    }
}
