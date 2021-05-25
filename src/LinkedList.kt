class LinkedList(var head: Node? = null){

    val lastNode: Node?
        get() {
            var curr = head
            while(curr?.next != null) {
                curr = curr.next
            }
            return curr
        }

    val size: Int
        get() {
            var count = 0
            var curr = head
            while(curr != null) {
                count++
                curr = curr?.next
            }
            return count
        }

    fun add(data: String) {
        var newNode = Node(data)
        if (head == null) head = newNode
            else lastNode!!.next = newNode
    }

    fun remove(index: Int) {
        var before = head
        repeat(index-1) {
            before = before?.next
        }
        var after = before?.next?.next
        before?.next = after
    }

    fun get(index: Int): String? {
        var curr = head
        repeat(index) {
            curr = curr?.next
        }
        return curr?.data
    }

}

class Node(val data: String, var next: Node? = null) {

}

fun main() {

    val ll = LinkedList()
    ll.add("Abby")
    ll.add("Joe")
    ll.add("Marcus")
    println(ll.get(1))
    println(ll.size)
    ll.remove(1)
    print(ll.get(1))

}