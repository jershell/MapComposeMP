package ovh.plrapps.mapcompose.utils

/**
 * Calculates a number between two numbers at a specific increment.
 */
fun lerp(a: Float, b: Float, t: Float): Float {
    return a + (b - a) * t
}

fun lerp(a: Double, b: Double, t: Double): Double {
    return a + (b - a) * t
}