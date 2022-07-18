package kr.co.qtbit.lib.log

import org.slf4j.LoggerFactory

open class Logger : Log {

    final override val tag: String = javaClass.enclosingClass?.simpleName ?: javaClass.simpleName

    private val logger: org.slf4j.Logger = LoggerFactory.getLogger(tag)

    override val log = object : TaggedLogger {

        override fun error(message: String) {
            logger.error(message)
        }

        override fun warn(message: String) {
            logger.warn(message)
        }

        override fun info(message: String) {
            logger.info(message)
        }

        override fun debug(message: String) {
            logger.debug(message)
        }

        override fun trace(message: String) {
            logger.trace(message)
        }
    }

    interface TaggedLogger {
        fun error(message: String)
        fun warn(message: String)
        fun info(message: String)
        fun debug(message: String)
        fun trace(message: String)
    }
}