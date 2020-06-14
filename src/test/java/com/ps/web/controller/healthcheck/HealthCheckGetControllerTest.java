package com.ps.web.controller.healthcheck;

import com.ps.web.controller.RequestTestCase;
import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerTest extends RequestTestCase {

    @Test
    void check_health_check_is_working_ok() throws Exception{
        assertResponse(
            "/health-check",
            200,
            "{'status':'ok'}"
        );
    }

}
