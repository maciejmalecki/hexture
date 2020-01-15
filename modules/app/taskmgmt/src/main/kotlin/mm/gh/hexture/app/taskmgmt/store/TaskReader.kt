package mm.gh.hexture.app.taskmgmt.store

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskId
import io.vavr.collection.List

interface TaskReader {
    fun findById(id: TaskId): Task?
    fun findAll(projectId: ProjectId): List<Task>
}
