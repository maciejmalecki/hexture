rootProject.name = "hexture"

include(":modules:domain:location")
include(":modules:domain:tasks")
include(":modules:domain:users")

include(":modules:app:taskmgmt")

include(":modules:adapters:api:restflux")
include(":modules:adapters:store:inmem")
