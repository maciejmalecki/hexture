package gh.mm.hexture.api.restflux

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class Routes() {

    @Bean
    fun route(projectHandler: ProjectHandler) = coRouter {
        GET("/projects", projectHandler::allProjects)
        GET("/projects/{projectId}", projectHandler::project)
    }
}
