import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import controllers.routes;
import play.http.*;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;
import play.mvc.Results;

public class ErrorHandler implements HttpErrorHandler {

	@Override
	public CompletionStage<Result> onClientError(RequestHeader request, int statusCode, String message) {
		return CompletableFuture.completedFuture(
                Results.redirect(routes.HomeController.index())
        );
	}

	@Override
	public CompletionStage<Result> onServerError(RequestHeader request, Throwable exception) {
		return CompletableFuture.completedFuture(
				Results.redirect(routes.HomeController.index())
        );
	}

}
