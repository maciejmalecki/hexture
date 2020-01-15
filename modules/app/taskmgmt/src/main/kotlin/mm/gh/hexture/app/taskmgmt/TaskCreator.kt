package mm.gh.hexture.app.taskmgmt

import gh.mm.hexture.domains.users.User
import mm.gh.hexture.app.taskmgmt.adapter.ProjectReader
import mm.gh.hexture.app.taskmgmt.adapter.TaskRepository

class TaskCreator(private val taskRepository: TaskRepository, private val projectReader: ProjectReader) {
    fun asUser(user: User, userContext: (ProjectContext) -> Unit) = userContext(ProjectContext(user, projectReader, taskRepository))
}
