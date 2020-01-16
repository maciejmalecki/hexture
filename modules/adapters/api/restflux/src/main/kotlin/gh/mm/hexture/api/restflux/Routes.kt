package gh.mm.hexture.api.restflux

import gh.mm.hexture.domain.users.User
import gh.mm.hexture.app.taskmgmt.TaskCreator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class Routes(private val taskCreator: TaskCreator) {

    @Bean
    fun route() = router {
        GET("/users") {
            ServerResponse.ok().bodyValue(listOf(
                    User("john_doe"),
                    User("foo_bar")
            ))
        }
        GET("/projects") {
            ServerResponse.ok().bodyValue(
                    taskCreator.asUser(User("john_doe")) { pc ->
                        pc.allProjects().toArray()
                    }
            )
        }
    }
}
