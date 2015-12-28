package facilitybooking;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FacilityBookingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hellofdgggggggggggggggijkjlkjljo, world");
		
		//req.setAttribute("", arg1)
		//req.getRequestDispatcher("").forward(req, arg1)
	}
}
