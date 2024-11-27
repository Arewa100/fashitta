package africa.semicolon.packageApplication.services.implementations;


import africa.semicolon.packageApplication.data.repositories.SenderRepository;
import africa.semicolon.packageApplication.dtos.requests.CreateSenderRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateSenderResponse;
import africa.semicolon.packageApplication.services.interfaces.SenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
public class SenderServiceImplTest {

    @Autowired
    private SenderService senderService;

    @Autowired
    private SenderRepository senderRepository;

    @Test
    public void testToCreateASenderAndSaveTheSender_RepositoryCount_Is_One() {
        CreateSenderRequest createSenderRequest = new CreateSenderRequest();
        createSenderRequest.setSenderName("Miracle");
        createSenderRequest.setSenderPhoneNumber("09086112841");
        senderService.createSender(createSenderRequest);
        assertThat(senderRepository.count(), is(1L));

    }
}