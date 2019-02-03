package chap02;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhaochoudecat on 2019/1/26
 * 输入一个链表的头节点，从尾到头打印链表每个节点的值。
 */
public class FromTail2Head {
    private class ListNode{
        int val;
        ListNode next = null;
        ListNode(int val){
            this.val = val;
        }
    }
    /**
     * LinkList有栈操作。
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        LinkedList<Integer> stack = new LinkedList<>();
        for(ListNode node = listNode; node != null; node = node.next){
            stack.push(node.val);
        }
        return new ArrayList<>(stack);
    }

    /**
     * 递归
     */
    private ArrayList<Integer> a = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        while(listNode.next != null){
            printListFromTailToHead2(listNode.next); //直到 listNode为空
            a.add(listNode.val);
        }
        return a;
    }
}
