package gh.mm.hexture.api.restflux

import gh.mm.hexture.app.taskmgmt.TaskCreator
import gh.mm.hexture.store.inmem.taskmgmt.ProjectRepositoryMem
import gh.mm.hexture.store.inmem.taskmgmt.TaskRepositoryMem

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RestfluxConfig {
    @Bean
    fun configureTaskCreator() = TaskCreator(TaskRepositoryMem(), ProjectRepositoryMem())
}
