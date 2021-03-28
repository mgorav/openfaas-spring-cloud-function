package function;

import java.util.function.Function;

public class Handler implements Function<String, String> {
    @Override
    public String apply(String requestPayload) {
        return String.format("Spring cloud function, You said: %s", new String(requestPayload));
    }
}