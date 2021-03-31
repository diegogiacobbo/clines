package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserFormMapperTest {

    private static final String NAME = "Diego Giacobo";
    private static final String EMAIL = "diegog@dbserver.com.br";
    private static final String PASSWORD = "123456";

    private UserFormMapper mapper = new UserFormMapper();

    @Test
    void shouldConvertUserFormToUser() {
        var user = new UserForm(NAME, EMAIL, PASSWORD);

        var userForm = mapper.map(user);

        assertEquals(NAME, userForm.getName());
        assertEquals(EMAIL, userForm.getEmail());
        assertEquals(PASSWORD, userForm.getPassword());
    }
}
