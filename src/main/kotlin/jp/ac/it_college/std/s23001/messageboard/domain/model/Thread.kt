//package jp.ac.it_college.std.s23001.messageboard.domain.model
//
//import kotlinx.datetime.LocalDateTime
//import kotlinx.datetime.Clock
//import kotlinx.datetime.TimeZone
//import kotlinx.datetime.toLocalDateTime
//import kotlinx.serialization.Serializable
//
//@Serializable
//data class Thread(
//    val id: Long,
//    var title: String,
//    val userId: Long,
//    val createdAt: LocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC),
//    var updatedAt: LocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC),
//    var deleted: Boolean = false
//)
//
