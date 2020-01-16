package gh.mm.hexture.app.taskmgmt

import gh.mm.hexture.domain.tasks.Project
import gh.mm.hexture.domain.tasks.Task
import gh.mm.hexture.domain.tasks.TaskData
import gh.mm.hexture.domain.tasks.TaskId
import gh.mm.hexture.domain.users.User
import gh.mm.hexture.app.taskmgmt.adapter.TaskRepository

class TaskContext(val user: User, val project: Project, private val taskRepository: TaskRepository) {

    fun allTasks() = taskRepository.findAll(project.id)

    fun findTask(id: TaskId) = taskRepository.findById(id)

    fun createNew(taskData: TaskData) = taskRepository.create(project.id, taskData)

    fun save(task: Task) = taskRepository.save(task)
}
