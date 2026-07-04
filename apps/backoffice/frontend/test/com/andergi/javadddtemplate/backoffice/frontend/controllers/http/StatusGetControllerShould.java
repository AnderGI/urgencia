package com.andergi.javadddtemplate.backoffice.frontend.controllers.http;

import com.andergi.javadddtemplate.backoffice.frontend.ApplicationTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class StatusGetControllerShould extends ApplicationTestCase {
    @Test
    void check_if_server_is_running_ok() throws Exception {
        assertResponse("/status", HttpStatus.OK.value(), "");
    }
}