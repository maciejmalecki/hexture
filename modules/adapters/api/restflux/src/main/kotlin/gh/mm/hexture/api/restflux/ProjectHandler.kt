package gh.mm.hexture.api.restflux

import gh.mm.hexture.app.taskmgmt.TaskCreator
import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.users.User
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import java.util.UUID

@RestController
class ProjectHandler(private val taskCreator: TaskCreator) {

    private val defaultUser = User("default")

    suspend fun allProjects(req: ServerRequest) = taskCreator.asUser(defaultUser) {
        ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValueAndAwait(it.allProjects().toJavaList())
    }

    suspend fun project(req: ServerRequest) = taskCreator.asUser(defaultUser) {
        ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValueAndAwait(it.project(ProjectId(UUID.fromString(req.pathVariable("projectId"))))!!)
    }
}
