package gh.mm.hexture.app.taskmgmt

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.users.User
import gh.mm.hexture.app.taskmgmt.adapter.ProjectReader
import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository

class ProjectContext(val user: User, private val projectReader: ProjectReader, private val taskRepository: TaskRepository) {

    suspend fun allProjects() = projectReader.findAllIds()

    suspend fun project(id: ProjectId) = projectReader.findById(id)

    suspend fun <T> withProject(projectId: ProjectId, taskContext: (TaskContext) -> T) {
        val project = projectReader.findById(projectId)
        if (project != null) {
            taskContext(TaskContext(user, project, taskRepository))
        }
    }
}
