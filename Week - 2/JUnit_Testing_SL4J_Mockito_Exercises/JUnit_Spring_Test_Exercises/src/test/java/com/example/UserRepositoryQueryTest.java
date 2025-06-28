package test.java.com.example;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class UserRepositoryQueryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName() {
        userRepository.save(new User(1L, "John"));
        userRepository.save(new User(2L, "Alice"));

        List<User> result = userRepository.findByName("John");
        assertEquals(1, result.size());
        assertEquals("John", result.get(0).getName());
    }
}
