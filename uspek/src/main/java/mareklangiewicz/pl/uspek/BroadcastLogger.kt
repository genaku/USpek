package mareklangiewicz.pl.uspek

class BroadcastLogger(private val loggers: List<ULogger>) : ULogger {
    override fun invoke(report: Report) {
        loggers.forEach {
            it.invoke(report)
        }
    }
}