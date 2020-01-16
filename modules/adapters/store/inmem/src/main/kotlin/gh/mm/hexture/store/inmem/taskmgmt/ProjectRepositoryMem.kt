package gh.mm.hexture.store.inmem.taskmgmt

import gh.mm.hexture.domain.tasks.Project
import gh.mm.hexture.domain.tasks.ProjectId
import io.vavr.collection.List
import io.vavr.kotlin.list
import gh.mm.hexture.app.taskmgmt.adapter.ProjectReader
import java.util.UUID

class ProjectRepositoryMem : ProjectReader {

    private val projects: List<Project> = list(
            Project(id = ProjectId(UUID.randomUUID(), "OM")),
            Project(id = ProjectId(UUID.randomUUID(), "SE")))

    override fun findAllIds(): List<ProjectId> = projects.map { p -> p.id }

    override fun findById(id: ProjectId): Project? = projects.first { p -> id.equals(p.id) }
}
