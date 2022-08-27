package pl.ml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

@SpringBootTest
class ApplicationTests {

    @DisplayName("Should statusCode equals 200")
    @Test
    void shouldReturn200() throws URISyntaxException, IOException, InterruptedException {
        // given

        // when
        HttpResponse<String> posts = ExerciseService.getPosts();
        int result = posts.statusCode();

        // then
        Assertions.assertEquals(200, result);

    }

}
