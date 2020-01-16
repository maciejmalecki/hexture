package mm.gh.hexture.api.restflux

import gh.mm.hexture.domains.users.User

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes {
    @Bean
    fun route() = router {
        GET("/users") {
            ServerResponse.ok().bodyValue(listOf(
                    User("john_doe"),
                    User("foo_bar")
            ))
        }
    }
}
