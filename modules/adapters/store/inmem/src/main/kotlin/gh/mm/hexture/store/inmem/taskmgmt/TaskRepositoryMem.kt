package gh.mm.hexture.store.inmem.taskmgmt

import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskData
import gh.mm.hexture.domain.tasks.TaskId
import io.vavr.collection.List
import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository

class TaskRepositoryMem : TaskRepository {

    override fun findById(id: TaskId): Task? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAll(projectId: ProjectId): List<Task> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(projectId: ProjectId, taskData: TaskData): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun save(task: Task): TaskId {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: TaskId) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
