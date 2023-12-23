package com.picpaysimplificado.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

//notação para dizer ao spring que estamos testando um repository
@DataJpaTest
class UserRepositoryTest {

    @Test
    void findUserByDocument() {
    }
}   