// !LANGUAGE: +InlineClasses

inline class R(private val r: Long) {
    private fun ok() = "OK"

    companion object {
        fun test(r: R) = r.ok()
    }
}

fun box() = R.test(R(0))