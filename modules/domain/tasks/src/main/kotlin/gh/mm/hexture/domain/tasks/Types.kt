package gh.mm.hexture.domain.tasks

import gh.mm.hexture.domains.users.person.NoPersonId
import gh.mm.hexture.domains.users.person.PersonId
import java.util.UUID


data class ProjectId(
        val projectId: UUID,
        val projectPrefix: String
)

data class TaskId(
        val ordinal: Long,
        val projectId: ProjectId
)

data class Task(
        val id: TaskId,
        val summary: String,
        val description: String,
        val priority: Int,
        val creator: PersonId,
        val status: TaskStatus,
        val assigned: PersonId = NoPersonId
)

data class TaskStatus(
        val name: String
)
