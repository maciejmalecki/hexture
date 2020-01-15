package gh.mm.hexture.domain.location

import io.vavr.collection.List
import kotlin.math.abs
import kotlin.math.sqrt


data class Location(val longitute: Double, val latitude: Double)

typealias Path = List<Location>

fun distance(locA: Double, locB: Double) = abs(locA - locB)

fun distance(locA: Location, locB: Location) =
        sqrt(distance(locA.latitude, locB.latitude) + distance(locA.longitute, locB.longitute))

tailrec fun Path.distance(accumulator: Double = 0.0): Double {
    val partialSum = accumulator + if (this.length() >= 2) {
        distance(this.head(), this.tail().head())
    } else {
        0.0
    }
    return if (this.length() <= 1) {
        partialSum
    } else {
        this.tail().distance(partialSum)
    }
}
