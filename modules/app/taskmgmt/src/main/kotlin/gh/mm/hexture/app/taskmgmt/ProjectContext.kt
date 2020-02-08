package gh.mm.hexture.app.taskmgmt

import gh.mm.hexture.app.taskmgmt.adapter.ProjectReader
import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository
import gh.mm.hexture.domain.orders.Order
import gh.mm.hexture.domain.orders.OrderLine
import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.users.User
import io.vavr.collection.HashSet
import java.math.BigDecimal

class ProjectContext(val user: User, private val projectReader: ProjectReader, private val taskRepository: TaskRepository) {

    suspend fun allProjects() = projectReader.findAllIds()

    suspend fun project(id: ProjectId) = projectReader.findById(id)

    suspend fun <T> withProject(projectId: ProjectId, taskContext: (TaskContext) -> T) {
        val project = projectReader.findById(projectId)
        // example of using Java code from Kotlin
        val order = Order(1, "foo", HashSet.of(
                OrderLine(
                        "L1",
                        "bar",
                        BigDecimal.valueOf(10),
                        BigDecimal.valueOf(100, 1))))

        if (project != null) {
            taskContext(TaskContext(user, project, taskRepository))
        }
    }
}
