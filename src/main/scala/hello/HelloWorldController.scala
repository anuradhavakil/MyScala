package hello; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * This controller accepts incoming requst.
 * We are mapping the GET request to index() which handles the request as required.
 *
 * @author aVakil
 * @since 1.0
 */

@RestController
@RequestMapping(Array("/"))	
class HelloWorldController {

    @RequestMapping(method = Array(RequestMethod.GET))
    def index() = {
          "Hello World"
    }
}