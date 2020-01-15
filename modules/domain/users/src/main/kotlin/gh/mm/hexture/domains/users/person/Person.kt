package gh.mm.hexture.domains.users.person

import java.util.UUID

data class PersonId(val id: UUID = UUID.randomUUID())

val NoPersonId = PersonId(UUID.nameUUIDFromBytes(byteArrayOf(0, 0, 0)))

data class Person(
        val id: PersonId,
        val firstName: String,
        val lastName: String,
        val position: String
)
