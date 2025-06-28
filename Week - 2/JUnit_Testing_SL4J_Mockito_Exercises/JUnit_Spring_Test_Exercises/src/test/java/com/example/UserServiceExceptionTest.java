package test.java.com.example;

import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class UserServiceExceptionTest {
    @Test
    void testUserNotFound() {
        UserRepository repo = Mockito.mock(UserRepository.class);
        when(repo.findById(1L)).thenReturn(Optional.empty());

        UserService service = new UserService();
        service.userRepository = repo;

        assertThrows(NoSuchElementException.class, () -> service.getUserById(1L));
    }
}
