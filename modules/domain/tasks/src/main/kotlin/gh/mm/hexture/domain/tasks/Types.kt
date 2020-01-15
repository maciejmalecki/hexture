package gh.mm.hexture.domain.tasks

import gh.mm.hexture.domains.users.person.NoPersonId
import gh.mm.hexture.domains.users.person.PersonId
import java.util.UUID


data class ProjectId(
        val projectId: UUID,
        val projectPrefix: String
)

data class Project(
        val id: ProjectId
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
