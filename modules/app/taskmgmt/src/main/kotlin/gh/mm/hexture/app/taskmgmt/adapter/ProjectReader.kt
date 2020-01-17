package gh.mm.hexture.app.taskmgmt.adapter

import gh.mm.hexture.domain.tasks.Project
import gh.mm.hexture.domain.tasks.ProjectId
import io.vavr.collection.List

interface ProjectReader {
    suspend fun findAllIds(): List<ProjectId>

    suspend fun findById(id: ProjectId): Project?
}
