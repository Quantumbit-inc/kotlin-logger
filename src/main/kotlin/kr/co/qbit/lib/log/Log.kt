package kr.co.qbit.lib.log

interface Log {
    val tag: String
    val log: Logger.TaggedLogger
}