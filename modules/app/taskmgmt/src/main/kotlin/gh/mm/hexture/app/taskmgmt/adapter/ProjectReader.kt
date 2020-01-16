package gh.mm.hexture.app.taskmgmt.adapter

import gh.mm.hexture.domain.tasks.Project
import gh.mm.hexture.domain.tasks.ProjectId
import io.vavr.collection.List

interface ProjectReader {
    fun findAllIds(): List<ProjectId>

    fun findById(id: ProjectId): Project?
}
