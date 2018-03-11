import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastro
 */
@WebServlet("/cadastro")
public class cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String cpf = request.getParameter("cpf");
		String sexo = request.getParameter("sexo");
		String data = request.getParameter("dataNascimento");
		String email = request.getParameter("email");
		
		// Formato data e Hora
		DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		// Convertendo String data para formato DateTime
		LocalDate date = LocalDate.parse(data,formatter);
		
		// Cadastra usuário
		Usuario u = new Usuario(nome, sobrenome, cpf, email, sexo, date);
		
		
		// preparar a resposta ao usuário
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Resposta</title></head>");
		out.println("<body><h2>O usuario: " + u.getNome() + " foi Cadastrado com sucesso</h2>");
		out.println("</body></html>");
	}
}
