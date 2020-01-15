package mm.gh.hexture.app.taskmgmt

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domains.users.User
import mm.gh.hexture.app.taskmgmt.adapter.ProjectReader
import mm.gh.hexture.app.taskmgmt.adapter.TaskRepository

class ProjectContext(val user: User, private val projectReader: ProjectReader, private val taskRepository: TaskRepository) {

    fun allProjects() = projectReader.findAllIds()

    fun withProject(projectId: ProjectId, taskContext: (TaskContext) -> Unit) {
        val project = projectReader.findById(projectId)
        if (project != null) {
            taskContext(TaskContext(user, project, taskRepository))
        }
    }
}
