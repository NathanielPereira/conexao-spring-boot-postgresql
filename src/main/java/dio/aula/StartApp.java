package dio.aula;

import org.springframework.boot.CommandLineRunner;
import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Nathaniel");
        user.setUsername("Nathan");
        user.setPassword("dio123");

        repository.save(user); // ✅ Correção feita aqui!

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
