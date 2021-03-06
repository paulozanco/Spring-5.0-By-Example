package springfive.twitterdispatcher

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TweetDispatcherApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(TweetDispatcherApplication::class.java, *args)
        }
    }

}

