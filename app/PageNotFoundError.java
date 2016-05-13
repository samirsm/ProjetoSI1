import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.http.*;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;
import play.mvc.Results;

public class PageNotFoundError implements HttpErrorHandler {

	@Override
	public CompletionStage<Result> onClientError(RequestHeader request, int statusCode, String message) {
		return CompletableFuture.completedFuture(
                Results.status(statusCode, "A client error occurred: " + message)
        );
	}

	@Override
	public CompletionStage<Result> onServerError(RequestHeader request, Throwable exception) {
		return CompletableFuture.completedFuture(
                Results.internalServerError("A server error occurred: " + exception.getMessage())
        );
	}

}
