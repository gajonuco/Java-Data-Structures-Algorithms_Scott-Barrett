

public class Main {
    public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(2);
    myLinkedList.append(3);

    System.out.println("Before prepend():");
    System.out.println("-----------------");
    myLinkedList.printAll();

    myLinkedList.prepend(1);

    System.out.println("\n\nAfter prepend():");
    System.out.println("----------------");
    myLinkedList.printAll();

    //2. Para remover um node no final da linkedlist
/*     LinkedList myLinkedList = new LinkedList(1);

    myLinkedList.append(2);
    myLinkedList.append(27);

    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast()); */


    //1. Para adicionar um novo node no final da linkedlist
/*  
    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.makeEmpthy();
    myLinkedList.append(1);
    myLinkedList.append(2);

    myLinkedList.printAll(); */
    }


}