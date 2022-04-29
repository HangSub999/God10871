package FastCampus.Data_structure;

class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int data) {
    }
}

public class NodeMgmt {

    Node head = null;

    public static void main(String[] args) {
        NodeMgmt myTree = new NodeMgmt();
        myTree.insertNode(3);

        System.out.println(myTree.delete(4));

    }

    public boolean insertNode(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            // CASE2: Node 가 하나 이상 들어가 있을 때
            Node findNode = this.head;
            while (true) {
                // CASE2-1: 현재 Node 의 왼쪽에 Node 가 들어가야할 때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                    // CASE2-2: 현재 Node 의 오른쪽에 Node 가 들어가야할 때
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        // CASE1: Node 가 하나도 없을 때
        if (this.head == null) {
            return null;
            // CASE2: Node 가 하나 이상 있을 때
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

    public boolean delete(int value) {
        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        // 코너 케이스1: Node 가 하나도 없을 때
        if (this.head == null) {
            /* 한번 고민해서 작성해보세요 */
            return false;
        } else {
            // 코너 케이스2: Node 가 단지 하나만 있고, 해당 Node 가 삭제할 Node 일 때
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                /* 한번 고민해서 작성해보세요 */
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (value < currNode.value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (searched == false) {
                return false;
            }
        }

        // 여기까지 실행되면,
        // currNode 에는 해당 데이터를 가지고 있는 Node,
        // currParentNode 에는 해당 데이터를 가지고 있는 Node 의 부모 Node

        // Case1: 삭제할 Node 가 Leaf Node 인 경우
        if (currNode.left == null && currNode.right == null) {
            if (value < currParentNode.value) {
                /* 한번 고민해서 작성해보세요 */
                currNode.left = null;
                currNode = null;
            } else {
                /* 한번 고민해서 작성해보세요 */
                currNode.right = null;
                currNode = null;
            }
            return true;
        }
        return true;
    }
}

