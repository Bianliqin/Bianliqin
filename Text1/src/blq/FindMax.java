public class LinkList {
    static class LinkList {  //单链表泛型类
        public LinkNode head;

        public LinkList() {
            head = new LinkNode();
            head.next = null;
        }

        public void CreateListR(int[] a) {
            LinkNode s, t;
            t = head;
            for (int i = 0; i < a.length; i++) {
                s = new LinkNode(a[i]);
                t.next = s;
                t = s;
            }
            t.next = null;
        }
    }

    static class LinkNode {
        public int data;
        public LinkNode next;

        public LinkNode() {
            next = null;
        }

        public LinkNode(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 5, 6, 8, 4, 8, 2, 8, 5, 5, 8};
        LinkList temp = new LinkList();
        temp.CreateListR(data);
        int count = Maxcount(temp);
        System.out.println(count);
    }

    public static int Maxcount(LinkList L) {
        int cnt = 1;
        int maxe;
        LinkNode p = L.head.next;
        maxe = p.data;
        while (p.next != null) {
            if (p.next.data > maxe) {
                maxe = p.next.data;
                cnt = 1;
            } else if (p.next.data == maxe) {
                cnt++;
            }
            p = p.next;
        }
        return cnt;
    }

}
