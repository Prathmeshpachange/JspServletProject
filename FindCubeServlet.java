import java.io.*;
import javax.servlet.http.*;

public class FindCubeServlet extends HttpServlet
{
   public void service(HttpServletRequest hreq, HttpServletResponse hres)
    {
        try
          {
               String s1=hreq.getParameter("no");
        
               int x=Integer.parseInt(s1);
                
                 x=x*x*x;

              PrintWriter pw=hres.getWriter();
                pw.println("cub="+x);     
          }
        catch(Exception e)
          {
            System.out.println(e);
          } 
    }
}