package com.vinhveer.mywebapps;

import com.vinhveer.mywebapps.user.User;
import com.vinhveer.mywebapps.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAddNewUser() {
        User user = new User();
        user.setEmail("abc@123");
        user.setFirstName("Vinh");
        user.setLastName("Veer");
        user.setPassword("Vinhveer");

        User savedUser = userRepository.save(user);

        // Assert that the saved user is not null
        assertNotNull(savedUser);

        // Assert that the ID is positive (greater than 0)
        assertTrue(savedUser.getId() > 0);
    }
}
