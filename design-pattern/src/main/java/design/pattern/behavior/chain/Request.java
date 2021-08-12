package design.pattern.behavior.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {
    private RequestType type;
    private String name;
}
