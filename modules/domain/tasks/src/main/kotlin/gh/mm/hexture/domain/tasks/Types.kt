package gh.mm.hexture.domain.tasks

import gh.mm.hexture.domain.users.person.NoPersonId
import gh.mm.hexture.domain.users.person.PersonId
import java.util.UUID


data class ProjectId(
        val projectId: UUID
)

data class Project(
        val id: ProjectId,
        val name: String
)

data class TaskId(
        val ordinal: Long,
        val projectId: ProjectId
)

data class TaskData(
        val summary: String,
        val description: String,
        val priority: Int
)

data class Task(
        val id: TaskId,
        val data: TaskData,
        val creator: PersonId,
        val status: TaskStatus,
        val assigned: PersonId = NoPersonId
)

data class TaskStatus(
        val name: String
)
