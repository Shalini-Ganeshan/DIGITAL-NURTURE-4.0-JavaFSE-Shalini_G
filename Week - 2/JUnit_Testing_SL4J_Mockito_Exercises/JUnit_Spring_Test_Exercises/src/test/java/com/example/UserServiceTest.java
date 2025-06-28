package test.java.com.example;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    @Test
    void testGetUserById() {
        UserRepository repo = Mockito.mock(UserRepository.class);
        User user = new User(1L, "John");
        when(repo.findById(1L)).thenReturn(Optional.of(user));

        UserService service = new UserService();
        service.userRepository = repo;

        User result = service.getUserById(1L);
        assertEquals("John", result.getName());
    }
}
