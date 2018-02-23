package by.vitali.demo.function.pojo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Request, Response> {
    public Response handleRequest(Request request, Context context) {

        String greetingString = String.format("Hello %s %s.", request.firstName, request.lastName) + "memory " + context.getIdentity();

        return new Response(greetingString);
    }
}
