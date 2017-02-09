package rxdemo

import rx.Subscriber
import grails.rx.web.*

class DemoController implements RxController {

    static int i = 0

    def index() {
        rx.stream { Subscriber  s ->
            s.onNext(rx.render("${i++}"))
            throw new RuntimeException("Expected", null, false, true) {}
        }
    }
}
