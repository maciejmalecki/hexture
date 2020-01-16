package gh.mm.hexture.app.taskmgmt

import gh.mm.hexture.domain.users.User
import gh.mm.hexture.app.taskmgmt.adapter.ProjectReader
import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository

class TaskCreator(private val taskRepository: TaskRepository, private val projectReader: ProjectReader) {
    fun <T> asUser(user: User, userContext: (ProjectContext) -> T) = userContext(ProjectContext(user, projectReader, taskRepository))
}
