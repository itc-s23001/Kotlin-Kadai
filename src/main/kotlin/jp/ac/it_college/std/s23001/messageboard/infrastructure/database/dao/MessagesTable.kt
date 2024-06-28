//package jp.ac.it_college.std.s23001.messageboard.infrastructure.database.dao
//
//import org.jetbrains.exposed.dao.id.LongIdTable
//import org.jetbrains.exposed.sql.javatime.CurrentDateTime
//import org.jetbrains.exposed.sql.javatime.datetime
//
//object MessagesTable : LongIdTable() {
//    val threadId = reference("thread_id", ThreadsTable)
//    val userId = reference("user_id", UsersTable)
//    val message = text("message")
//    val postedAt = datetime("posted_at").defaultExpression(CurrentDateTime)
//    val updatedAt = datetime("updated_at").defaultExpression(CurrentDateTime)
//    val deleted = bool("deleted").default(false)
//}
