package gh.mm.hexture.domain.location

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.vavr.kotlin.list
import kotlin.math.sqrt

class PathDistanceTest : StringSpec({
    "distance with zero length path is 0.0" {
        val path: Path = list()
        path.distance() shouldBe 0.0
    }
    "distance with single location path is 0.0" {
        list(Location(0.0, 0.0)).distance() shouldBe 0.0
    }
    "distance of one segment path is a distance between locations" {
        list(Location(0.0, 0.0), Location(1.0, 1.0)).distance() shouldBe sqrt(2.0)
    }
})
