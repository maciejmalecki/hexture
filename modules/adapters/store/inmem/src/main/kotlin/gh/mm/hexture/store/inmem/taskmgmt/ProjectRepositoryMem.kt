package gh.mm.hexture.store.inmem.taskmgmt

import gh.mm.hexture.app.taskmgmt.adapter.ProjectReader
import gh.mm.hexture.domain.tasks.Project
import gh.mm.hexture.domain.tasks.ProjectId
import io.vavr.collection.List
import io.vavr.kotlin.list
import java.util.UUID

class ProjectRepositoryMem : ProjectReader {

    private val projects: List<Project> = list(
            Project(id = ProjectId(UUID.randomUUID()), name = "foo"),
            Project(id = ProjectId(UUID.randomUUID()), name = "bar"))

    override suspend fun findAllIds(): List<ProjectId> = projects.map { p -> p.id }

    override suspend fun findById(id: ProjectId): Project? = projects.first { p -> id == p.id }
}
