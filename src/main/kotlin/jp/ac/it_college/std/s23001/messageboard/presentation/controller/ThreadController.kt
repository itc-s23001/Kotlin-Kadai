//package jp.ac.it_college.std.s23001.messageboard.presentation.controller
//
//import jp.ac.it_college.std.s23001.messageboard.application.service.MessageService
//import jp.ac.it_college.std.s23001.messageboard.application.service.ThreadService
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Message
//import jp.ac.it_college.std.s23001.messageboard.domain.model.Thread
//import jp.ac.it_college.std.s23001.messageboard.presentation.form.ThreadForm
//import jp.ac.it_college.std.s23001.messageboard.domain.model.User
//import kotlinx.datetime.Clock
//import kotlinx.datetime.TimeZone
//import kotlinx.datetime.toLocalDateTime
//import org.springframework.http.HttpStatus
//import org.springframework.http.ResponseEntity
//import org.springframework.security.core.annotation.AuthenticationPrincipal
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/threads")
//@CrossOrigin
//class ThreadController(
//    private val threadService: ThreadService,
//    private val messageService: MessageService
//) {
//
//    @GetMapping("/list")
//    fun getAllThreads(): ResponseEntity<List<Thread>> {
//        return ResponseEntity.ok(threadService.getAllThreads())
//    }
//
//    @PostMapping("/create")
//    fun createThread(@RequestBody form: ThreadForm, @AuthenticationPrincipal user: User): ResponseEntity<Any> {
//        val now = Clock.System.now().toLocalDateTime(TimeZone.UTC)
//        val thread = Thread(0, form.title, user.id, now, now, false)
//        val savedThread = threadService.createThread(thread)
//        val message = Message(0, savedThread.id, user.id, form.message ?: "", now, now, false)
//        messageService.createMessage(message)
//        return ResponseEntity.status(HttpStatus.CREATED).body(mapOf("id" to savedThread.id))
//    }
//
//    @PutMapping("/update/{id}")
//    fun updateThreadTitle(
//        @PathVariable id: Long,
//        @RequestBody form: ThreadForm,
//        @AuthenticationPrincipal user: User
//    ): ResponseEntity<Any> {
//        val updatedThread = threadService.updateThreadTitle(id, form.title, user.id)
//        return ResponseEntity.ok(mapOf(
//            "id" to updatedThread.id,
//            "title" to updatedThread.title
//        ))
//    }
//
//    @DeleteMapping("/delete/{id}")
//    fun deleteThread(@PathVariable id: Long, @AuthenticationPrincipal user: User): ResponseEntity<Any> {
//        val deletedThread = threadService.deleteThread(id, user.id)
//        return ResponseEntity.ok(mapOf(
//            "id" to deletedThread.id,
//            "title" to deletedThread.title,
//            "updated_at" to deletedThread.updatedAt
//        ))
//    }
//}
