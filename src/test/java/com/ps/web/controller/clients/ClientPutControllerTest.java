package com.ps.web.controller.clients;

import com.ps.web.controller.RequestTestCase;
import org.junit.jupiter.api.Test;

public final class ClientPutControllerTest extends RequestTestCase {

    @Test
    void create_a_valid_client() throws Exception{
        assertRequestWithBody(
            "PUT",
            "/client/900ba41a-13ab-4738-96da-7974668cf944",
            "{ \"dni\": \"666\", \"name\": \"Luis\", \"surname\": \"Bertel\", \"age\": 55 , \"addresss\" : \"En algun lugar de un gran país\"}",
            201);
    }

}
