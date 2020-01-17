package gh.mm.hexture.app.taskmgmt.adapter

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskId
import io.vavr.collection.List

interface TaskReader {
    suspend fun findById(id: TaskId): Task?
    suspend fun findAll(projectId: ProjectId): List<Task>
}
