import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse

class HelloFunction : HttpFunction {

    override fun service(httpRequest: HttpRequest, httpResponse: HttpResponse) {
        with(httpResponse.writer) {
            write("Hello from Cloud Functions!")
        }
    }

}