package gh.mm.hexture.store.inmem.taskmgmt

import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository
import gh.mm.hexture.domain.tasks.ProjectId
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskData
import gh.mm.hexture.domain.tasks.TaskId
import io.vavr.collection.List

class TaskRepositoryMem : TaskRepository {

    override suspend fun findById(id: TaskId): Task? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun findAll(projectId: ProjectId): List<Task> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun create(projectId: ProjectId, taskData: TaskData): Task {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun save(task: Task): TaskId {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun delete(id: TaskId) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
