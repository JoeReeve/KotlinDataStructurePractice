class LinkedListPractice(var head: Node? = null) {

    fun add(data: String) {
        var newNode = Node(data)
        if (head == null) head = newNode
            else {
                var curr = head
                while (curr?.next != null) {
                    curr = curr.next
                }
            curr?.next = newNode
        }
    }

    fun get(index: Int): String {
        var curr = head
        repeat(index) {
            curr = curr?.next
        }
        return curr!!.data
    }

    fun size(): Int {
        var count = 0
        var curr = head
        while (curr != null) {
            count++
            curr = curr.next
        }
        return count
    }

    fun remove(index: Int) {
        var before = head
        repeat(index - 1) {
            before = before?.next
        }
        before?.next = before?.next?.next
    }
}

data class PracticeNode(val data: String, var next: Node? = null)

fun main() {

    var ll = LinkedListPractice()
    ll.add("1")
    ll.add("2")
    ll.add("3")
    ll.add("4")
    println(ll.get(2))
    ll.remove(2)
    println(ll.get(2))
    println(ll.get(0))

}