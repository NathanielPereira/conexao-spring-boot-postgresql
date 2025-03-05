package dio.aula.model;

import jakarta.persistence.*; // Importa todas as anotações do JPA

@Entity
@Table(name = "tab_user") // Define o nome da tabela no banco de dados
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") // Agora corrigido
    private Integer id;

    @Column(length = 58, nullable = false)
    private String name;

    @Column(length = 28, nullable = false)
    private String username;

    @Column(length = 168, nullable = false)
    private String password;

    // Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
    }
}
