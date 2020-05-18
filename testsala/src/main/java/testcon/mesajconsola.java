package testcon;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/afis")
public class mesajconsola extends HttpServlet{
        public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
            String name = req.getParameter("nume");

            //resp.getWriter().println("Hello " + name);
            //resp.getWriter().println(Integer.parseInt(req.getParameter("age")) + 7);
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            Map<String, String> map = new HashMap<>();

            String linie;

            while ((linie = request.getReader().readLine()) != null) {
                map.put(linie.split("=")[0], linie.split("=")[1]);
            }

            System.out.println("Hello, " + map.get("nume")+"!");

    }
}
