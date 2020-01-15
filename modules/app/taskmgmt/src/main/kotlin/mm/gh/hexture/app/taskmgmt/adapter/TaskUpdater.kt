package mm.gh.hexture.app.taskmgmt.adapter

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskData
import gh.mm.hexture.domain.tasks.TaskId

interface TaskUpdater {
    fun create(projectId: ProjectId, taskData: TaskData): Task
    fun save(task: Task): TaskId
    fun delete(id: TaskId)
}
