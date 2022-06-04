public class doublelinkedlist {
    Node_06 head;
    Pembeli pembeli;
    Pesanan pesanan;
    int size, idx;

    public doublelinkedlist(){
        head = null;
        size = 0;
    } 
    
    public boolean isEmpty(){
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node_06 tmp = head;
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Customer\t|No hp");
        while (tmp != null) {
            System.out.println("|" + tmp.pembeli + "\t|" + tmp.pesanan+ "\t");
            tmp = tmp.next;
            }
            System.out.println("Total Antrian : " + size);
        } else {
            System.out.println("Linked List Masih Kosong");
        }
    }

    public void addFirst(/*int no,*/ Pembeli pb, Pesanan ps) {
        if (isEmpty()) {
            head = new Node_06(null, /*no,*/ pb, ps, null);
        } else {
            Node_06 newNode = new Node_06(null, /*no,*/ pb, ps, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli pb, Pesanan ps) {
        if (isEmpty()) {
            addFirst(pb, ps);
        } else {
            Node_06 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node_06 newNode = new Node_06(current, /*no,*/ pb, ps, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node!");
        } else if (size == 1){
            head = null;
            System.out.println(head.pembeli.namaPembeli+" Telah Memesan Menu");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    /*public void BubbleSort() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node_06 tmp = head;
            while (tmp != null) {
                Node_06 temp2 = tmp.next;
                while (temp2 != null) {
                if (tmp.pesanan.namaPesanan > temp2.pesanan.namaPesanan) {
                    double tempdata = tmp.pesanan.namaPesanan;
                    tmp.namaPesanan = temp2.namaPesanan;
                    tmp.next.namaPesanan = tempdata;
                    }
                temp2 = temp2.next;
                }
            tmp = tmp.next;
            }
            Node_06 printdata = head;
                while (printdata != null) {
                System.out.print(printdata.pesanan.namaPesanan + "\t");
                printdata = printdata.next;
            } System.out.println();
        }
    }*/

    public void total(){
        
    }
}
