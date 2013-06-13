/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Security.AccountBeanLocal;
import bean.entidad.Cuenta;
import ejb.bean.CuentaFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
public class BalanceServlet extends HttpServlet {
    @EJB
    private AccountBeanLocal accountBean;  
    @EJB
    private CuentaFacadeLocal cuentaFacade;
    Cuenta cuenta = new Cuenta();

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BalanceServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p/>Llamando a Ver Saldo...");
            out.println("<TABLE Border=10 CellPadding=5><TR>");
            out.println("<th bgcolor=White> ID </th><th bgcolor=White>NOMBRE</th><th bgcolor=White>MONTO</th></TR>");
            List<Cuenta> c = cuentaFacade.findAll();
            Iterator it=c.iterator();
            while(it.hasNext()){
                Cuenta cuent= (Cuenta) it.next();
                        out.println("<TR>");
                        out.println("<TD>" + cuent.getId() + "</TD>");
                        out.println("<TD>" + cuent.getNombre() + "</TD>");
                        out.println("<TD>" + cuent.getMonto() + "</TD>");
                        out.println("<TR>");
            }
            out.println("</TABLE></CENTER></DIV></HTML>");
            //double amount = accountBean.getBalance(1);
            //out.println("<p/>El saldo es: $"+ amount);
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
