package cz.herain.sample.springreactivepoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.stream.Stream;

@RestController
public class SampleController {

    @GetMapping(value = "/api/random-message")
    public Flux<MessageDTO> getRandomMessage() {
        return Flux.fromStream(Stream.of(new MessageDTO("nazdar"), new MessageDTO("ahoj")));
    }
}
