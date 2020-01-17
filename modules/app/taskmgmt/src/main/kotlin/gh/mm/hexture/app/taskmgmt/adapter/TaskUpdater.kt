package gh.mm.hexture.app.taskmgmt.adapter

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskData
import gh.mm.hexture.domain.tasks.TaskId

interface TaskUpdater {
    suspend fun create(projectId: ProjectId, taskData: TaskData): Task
    suspend fun save(task: Task): TaskId
    suspend fun delete(id: TaskId)
}
