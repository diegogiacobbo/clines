package br.com.caelum.clines.api.users;

import br.com.caelum.clines.api.aircraft.AircraftViewMapper;
import br.com.caelum.clines.shared.domain.Aircraft;
import br.com.caelum.clines.shared.domain.AircraftModel;
import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserViewMapperTest {

    private static final String NAME = "Diego Giacobo";
    private static final String EMAIL = "diegog@dbserver.com.br";
    private static final String PASSWORD = "123456";

    private UserViewMapper mapper = new UserViewMapper();

    @Test
    void shouldConvertUserToUserView() {
        var user = new User(NAME, EMAIL, PASSWORD);

        var userView = mapper.map(user);

        assertEquals(NAME, userView.getName());
        assertEquals(EMAIL, userView.getEmail());
    }
}
