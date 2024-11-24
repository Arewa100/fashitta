package africa.semicolon.packageApplication.services.implementations;

import africa.semicolon.packageApplication.data.repositories.ReceiverRepository;
import africa.semicolon.packageApplication.dtos.requests.CreateReceiverRequest;
import africa.semicolon.packageApplication.dtos.responses.CreateReceiverResponse;
import africa.semicolon.packageApplication.services.interfaces.ReceiverService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ReceiverServiceImplTest {
    @Autowired
    private ReceiverService receiverService;

    @Autowired
    private ReceiverRepository receiverRepository;

//    @BeforeEach
//    public void setUp() {
//        receiverRepository.deleteAll();
//    }

    @Test
    public void testToCreateAReceiver_RepositoryCountIsOne() {
        CreateReceiverRequest createReceiverRequest = new CreateReceiverRequest();
        createReceiverRequest.setAddress("semicolon, sabo");
        createReceiverRequest.setFullName("Eri");
        createReceiverRequest.setPhoneNumber("+234-9086112841");
        receiverService.createReceiver(createReceiverRequest);
        assertEquals(2, receiverRepository.count());
    }

    @Test
    public void testToCreateAReceiverThatExistsAlready_RepositoryCountIsOne() {
        CreateReceiverRequest createReceiverRequest = new CreateReceiverRequest();
        createReceiverRequest.setAddress("semicolon, sabo");
        createReceiverRequest.setFullName("Ola");
        createReceiverRequest.setPhoneNumber("+234-9086112841");
        receiverService.createReceiver(createReceiverRequest);

        assertEquals(2L, receiverRepository.count());
        CreateReceiverRequest createReceiverRequestTwo = new CreateReceiverRequest();
        createReceiverRequestTwo.setAddress("semicolon, sabo");
        createReceiverRequestTwo.setFullName("Ola");
        createReceiverRequestTwo.setPhoneNumber("+234-9086899000");
        assertEquals(2L, receiverRepository.count());

    }



}