package mm.gh.hexture.app.taskmgmt.store

import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskId

interface TaskUpdater {
    fun delete(id: TaskId)
    fun save(task: Task): TaskId
}
