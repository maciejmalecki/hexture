package gh.mm.hexture.app.taskmgmt

import gh.mm.hexture.app.taskmgmt.adapter.ProjectReader
import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository
import gh.mm.hexture.domain.users.User

class TaskCreator(private val taskRepository: TaskRepository, private val projectReader: ProjectReader) {
    suspend fun <T> asUser(user: User, userContext: suspend (ProjectContext) -> T) = userContext(ProjectContext(user, projectReader, taskRepository))
}
