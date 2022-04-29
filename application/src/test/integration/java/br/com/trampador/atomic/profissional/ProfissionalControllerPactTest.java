package br.com.trampador.atomic.profissional;

import au.com.dius.pact.provider.junit.State;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Provider("sboot-trampador-atomic-atom-profissional")
// @PactBroker(host = "${pactbroker.host:localhost}", port = "${pactbroker.port:9292}")
public class ProfissionalControllerPactTest {
    @State("Pact for getProfissionalData")
    public void getProfissionalData() { }

    // @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void testTemplate(PactVerificationContext context) throws Exception {
        // context.verifyInteraction();
    }
}