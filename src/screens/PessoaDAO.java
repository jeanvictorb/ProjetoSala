package screens;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDAO {

    public Pessoa buscarPorCPF (String cpf) {
        Pessoa pessoa = null;
        String sql = "SELECT * FROM pessoa WHERE cpf = ?"; // Ajuste o nome da tabela e os campos conforme seu banco

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, cpf); // Define o valor do CPF na consulta
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Se encontrou a pessoa, crie uma nova instância da classe Pessoa
                pessoa = new Pessoa(
                    rs.getString("nome"), 
                    rs.getString("cpf"), 
                    rs.getString("rg"), 
                    rs.getString("nomeMae"),
                    rs.getString("nomePai"), 
                    rs.getString("unidadePrisional"),
                    rs.getString("crime"), 
                    rs.getString("statusPrisioneiro")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoa; // Retorna a pessoa encontrada ou null se não houver correspondência
    }
}
