package com.andergi.javadddtemplate.backoffice.backend.controllers.http.status;

import com.andergi.javadddtemplate.backoffice.backend.ApplicationTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;


class StatusGetControllerShould extends ApplicationTestCase {

    @Test
    void check_if_server_is_running_ok() throws Exception {
        assertResponse("/status", HttpStatus.OK.value(), "");
    }
}