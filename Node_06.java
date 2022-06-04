public class Node_06 {
    Pembeli pembeli;
    Pesanan pesanan;
    Node_06 prev, next;

    Node_06(Node_06 prev, Pembeli pb, Pesanan ps, Node_06 next){
        this.prev = prev;
        this.pembeli = pb;
        this.pesanan = ps;
        this.next = next;
    }
}