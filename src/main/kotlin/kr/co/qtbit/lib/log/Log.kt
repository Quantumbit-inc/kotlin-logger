package kr.co.qtbit.lib.log

interface Log {
    val tag: String
    val log: Logger.TaggedLogger
}