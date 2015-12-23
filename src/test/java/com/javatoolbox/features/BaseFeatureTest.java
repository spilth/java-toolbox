package com.javatoolbox.features;

import com.javatoolbox.ToolboxApplication;
import net.codestory.simplelenium.SeleniumTest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ToolboxApplication.class)
@WebIntegrationTest(randomPort = true)
@ActiveProfiles("test")
public abstract class BaseFeatureTest extends SeleniumTest {
    @Value("${local.server.port}")
    private int localServerPort;

    @Override
    protected String getDefaultBaseUrl() {
        return "http://localhost:" + localServerPort;
    }
}
